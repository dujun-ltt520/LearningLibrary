package com.cib.cinema.customermanage.login.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录控制
 * @author 杜俊
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping
	public String login() {
		return "index";
	}
	
	
	@RequestMapping("/home.do")
	public String home() {
		return "main";
	}
	
	
	@RequestMapping("/userLogin.do")
	@ResponseBody
	public Map<String, String> userLogin(String username,String password) {
		
		Map<String, String> loginMsg = new HashMap<String, String>();
		
		if("dujun".equals(username) && "123456".equals(password)) {
			loginMsg.put("status", "success");
			
		}else {
			loginMsg.put("status", "error");
		}
		
		return loginMsg ;
	}
	
}



