package com.spring.board.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.board.service.dao.User;

@Controller
public class BoardLogin {
	
	private final Logger logger = LoggerFactory.getLogger(BoardLogin.class);
	
	@SuppressWarnings("unused")
	@RequestMapping(value="login.json" , method=RequestMethod.POST)
	public Map<String,Object> login(HttpServletRequest request, @RequestBody User user,Model model){
		Map<String,Object> resMap = new HashMap<String,Object>();
		
		this.logger.debug(user.toString());
		this.logger.debug("성공");
		
		HttpSession session = request.getSession();
		
		if(user != null){
			this.logger.debug(user.toString());
			session.setAttribute("Login", user);
			this.logger.debug("resgister Session");
			resMap.put("success", true);
		}else{
			resMap.put("success", false);
		}
		
		return resMap;
	}
	
}
