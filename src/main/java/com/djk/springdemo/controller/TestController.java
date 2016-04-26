package com.djk.springdemo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.djk.springdemo.bean.Email;
import com.djk.springdemo.service.TestService;

/**
 * 测试请求控制器
 * @author djk
 *
 */
@Controller
public class TestController {
	
	@Resource
	private TestService testService;

	/**
	 * 第一个数据源的接口
	 * @return
	 */
	@RequestMapping("/query")
	@ResponseBody
	public Email testQuery() {
		return testService.quert();
	}
	
	/**
	 * 第二个数据源的接口
	 * @return
	 */
	@RequestMapping("/query1")
	@ResponseBody
	public Email testQuery1() {
		return testService.quert1();
	}
	
}
