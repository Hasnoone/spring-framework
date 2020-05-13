package com.study.service.impl;

import com.study.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @description
 * @create 2020-03-11 11:02
 */
@Service
public class TestServiceImpl implements TestService {
	@Override
	public void sayHello() {
		System.out.println("Test·······");
	}
}
