package com.A115EE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/testInterceptor")
	public String testInterceptor() {

		System.out.println("testInterceptor()方法执行了！");

		return "success";
	}

}