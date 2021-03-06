package com.study.test;

import com.study.service.TestService;
import com.study.service.impl.TestServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description
 * @create 2020-03-11 10:51
 */
public class MyApplicationTest {
	public static void main(String[] args) {
//		ApplicationContext ac = new AnnotationConfigApplicationContext("com.study");
		ApplicationContext ac2 = new ClassPathXmlApplicationContext("classpath:TestApplication.xml");
		TestService testService = ac2.getBean(TestServiceImpl.class);
		testService.sayHello();


	}
}
