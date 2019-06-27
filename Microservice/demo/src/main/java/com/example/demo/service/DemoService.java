package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.DemoDao;
import com.example.demo.pojo.ObjectO;

@Component
public class DemoService {

	@Autowired
	private DemoDao dao;
	private static int x;
	public DemoService() {
		super();
		x=1;
		// TODO Auto-generated constructor stub
	}
	public void add(String s){
		dao.save(new ObjectO(x++,s));
	}
	
	public List<ObjectO> viewAll(){
		return dao.findAll();
	}
	
	
	
	
}
