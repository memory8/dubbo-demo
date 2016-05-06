package com.dubbo.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcException;

@Activate(group=Constants.PROVIDER)
public class DemoDubboFilter implements Filter {

	private static final Logger log = LogManager.getLogger();
	
	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation)
			throws RpcException {
		//关联request、response
        String txKeyTime = UUID.randomUUID().toString().replaceAll("-", "");
        String interfaceName = invoker.getInterface().getSimpleName();
        String methodName = invocation.getMethodName();

        if(invocation.getArguments() != null) {
        	List<Object> args = new ArrayList<Object>();
			for(Object obj : invocation.getArguments()){
				if(obj == null) continue;
				args.add(obj);
			}
			log.info("DUBBO PROVIDOR request:[txKeyTime:{}, txInterface:{}.{}]{}", new Object[]{txKeyTime, interfaceName, methodName, args});
		}
		long start = System.currentTimeMillis();
        Result invoke = invoker.invoke(invocation);
        long cost = System.currentTimeMillis() - start;
        Object obj = invoke.getValue();
        if(obj != null){
        	String code = "--";
            String desc = "--";
            //TODO..
    		log.info("DUBBO PROVIDOR response:[txKeyTime:{}, txInterface:{}.{}, code:{}, desc:{}, cost:{}]{}", new Object[]{txKeyTime, interfaceName, methodName, code, desc, cost, ""});
        }
        return invoke;
	}
    
}
