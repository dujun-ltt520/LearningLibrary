package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录控制层
 * @author 杜俊
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/login.do")
	public String toIndex() {
		return "index";
	}
	
}
