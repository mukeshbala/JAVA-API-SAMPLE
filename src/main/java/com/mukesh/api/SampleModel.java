package com.mukesh.api;

public class SampleModel {
	
	private String name;
	private String age;
	private String header;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getHeader() {
		return header;
	}
	
	public void setHeader(String arg) {
		this.header=arg;
	}
	
	public SampleModel(String name, String age,String header) {
		this.name = name;
		this.age = age;
		this.header = header;
	}
	
	

}
