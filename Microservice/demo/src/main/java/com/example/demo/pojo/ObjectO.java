package com.example.demo.pojo;

import javax.persistence.*;


@Entity
public class ObjectO {

	@Id
	private int x;
	private String name;
	
	public ObjectO(int x, String name) {
		super();
		this.x = x;
		this.name = name;
	}

	public ObjectO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public String getName() {
		return name;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
