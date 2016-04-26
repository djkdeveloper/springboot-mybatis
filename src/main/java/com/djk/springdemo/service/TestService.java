package com.djk.springdemo.service;

import com.djk.springdemo.bean.Email;

/**
 * 测试服务
 * 
 * @author djk
 *
 */
public interface TestService {
	/**
	 * 第一个数据源的服务接口
	 * 
	 * @return
	 */
	Email quert();

	/**
	 * 第二个数据源的服务接口
	 * 
	 * @return
	 */
	Email quert1();
}
