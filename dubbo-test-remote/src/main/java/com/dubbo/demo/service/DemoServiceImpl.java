package com.dubbo.demo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dubbo.demo.client.service.DemoService;
import com.dubbo.demo.mapper.DemoMapper;
import com.dubbo.demo.model.DemoModel;

@Service("demoService")
public class DemoServiceImpl implements DemoService{
	
	private static final Logger logger = LogManager.getLogger();
	
	@Autowired
	private DemoMapper demoMapper;
	
	@Override
	public void test() {
		DemoModel demo = demoMapper.queryById(0);
		logger.info(demo.toString());
	}
	
}

