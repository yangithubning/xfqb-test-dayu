package com.xfqb.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 描述
 * 
 * @author ning yan
 * 
 * @Date 2019年4月20日 下午3:30:47
 * 
 */
@RestController
public class UserController {

	@RequestMapping(value = "/getInfo", method = RequestMethod.GET)
	public String getInfo() {
		return "hello jenkins";
	}
}
