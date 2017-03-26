package com.spring.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardConstant {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/board.page", method=RequestMethod.GET)
	public Model boardPage(HttpServletRequest request, Model model){
		
		if(logger.isDebugEnabled()){
			logger.debug("요청된 페이지  " + request.getRequestURI().toString());
		}
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("Login") != null){
			this.logger.debug(session.getAttribute("Login").toString());
			model.addAttribute("session", session.getAttribute("Login"));
		}
		
		return model;
	}
	
	@RequestMapping(value="/login.page", method=RequestMethod.GET)
	public Model loginPage(HttpServletRequest request, Model model){
		
		if(logger.isDebugEnabled()){
			logger.debug("요청된 페이지  " + request.getRequestURI().toString());
		}
		
		HttpSession session = request.getSession();
		
		Object ob = session.getAttribute("Login");
		
		if(ob == null){
			session.setAttribute("Login", "session set!!!");
			logger.debug("session setting complete!");
			logger.debug("session value : " + session.getAttribute("Login").toString());
		}
		
		return model;
	}
	
	@RequestMapping(value="/*.page", method=RequestMethod.GET)
	public Model getPage(HttpServletRequest request, Model model){
		
		if(logger.isDebugEnabled()){
			logger.debug("요청된 페이지  " + request.getRequestURI().toString());
		}

		return model;
	}
}
