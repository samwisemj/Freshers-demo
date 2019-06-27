package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/api")
public class DemoController {

	public DemoController() {
		super();
		// TODO Auto-generated constructor stubF
	}

	@Autowired
	private DemoService service;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void add(String s) {
		service.add(s);
	}

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public Object view() {
		return service.viewAll();
	}

}
