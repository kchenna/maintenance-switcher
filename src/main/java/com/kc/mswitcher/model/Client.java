package com.kc.mswitcher.model;

import java.util.List;

public class Client {
	
	private int id;
	private String name;
	private List<Environment> env;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Environment> getEnv() {
		return env;
	}
	public void setEnv(List<Environment> env) {
		this.env = env;
	}
	
}
