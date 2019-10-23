package com.testyantra.cgbanspringapp.di;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<Integer> phNo;

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

	public List<Integer> getPhNo() {
		return phNo;
	}

	public void setPhNo(List<Integer> phNo) {
		this.phNo = phNo;
	}
}
