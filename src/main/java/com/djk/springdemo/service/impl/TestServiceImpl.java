package com.djk.springdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djk.springdemo.bean.Email;
import com.djk.springdemo.mapper.TestMapper;
import com.djk.springdemo.mapper1.TestMapper1;
import com.djk.springdemo.service.TestService;

/**
 * 测试服务接口实现类
 * 
 * @author djk
 *
 */
@Service
public class TestServiceImpl implements TestService {

	/**
	 * 第一个数据源的接口
	 */
	@Autowired
	private TestMapper testMapper;

	/**
	 * 第二个数据源的接口
	 */
	@Autowired
	private TestMapper1 testMapper1;

	/**
	 * 第一个数据源的测试接口
	 */
	public Email quert() {
		return testMapper.findemail();
	}

	/**
	 * 第二个数据源的测试接口
	 */
	public Email quert1() {
		return testMapper1.findemail();
	}

}
