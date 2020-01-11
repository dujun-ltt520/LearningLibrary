package com.cib.cinema.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户登录 控制器
 * @author 杜俊
 *
 */
@Controller
@RequestMapping("/user")
public class UserManageCtrler {
	
	@RequestMapping("/toIndex.do")
	public String show() {
		
		return "index";
	}
	
	
	
	
}
