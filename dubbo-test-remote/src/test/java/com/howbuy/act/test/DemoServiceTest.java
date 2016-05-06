package com.howbuy.act.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.demo.client.service.DemoService;

public class DemoServiceTest {
	private static ClassPathXmlApplicationContext context = null;
	private static DemoService demoService;
	
	@BeforeClass
	public static void init() throws Exception {
		context = new ClassPathXmlApplicationContext("dubbo-demo-test.xml");
		demoService = (DemoService) context.getBean("demoService");
	}
	
	@AfterClass
	public static void destory() {
		context.destroy();
		context = null;
	}
	
	@Test
	public void test() throws Exception {
		demoService.test();
	}
	
}