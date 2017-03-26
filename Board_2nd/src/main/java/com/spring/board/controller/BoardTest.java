package com.spring.board.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardTest {
	
	private final Logger logger = LoggerFactory.getLogger(BoardTest.class);
	private Map<String,Object> map;
	
	private ObjectMapper objectMapper;
	
	@Inject
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		map = new HashMap<String,Object>();
		map.put("id", "심명섭");
	}
	
	@Test
	public void test() throws Exception {
		objectMapper = new ObjectMapper();
		mockMvc.perform(MockMvcRequestBuilders.post("/dd.json").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsBytes(map)));
	}

}
