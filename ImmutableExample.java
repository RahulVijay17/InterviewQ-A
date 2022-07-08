package com.answers;

public class ImmutableExample {
	static int count=0;//class variable
	private String name;//instance variable
	private int age;
	
	ImmutableExample(String name,int age){
		count++;
		this.name=name;
		this.age=age;
	}
	
	

	@Override
	public String toString() {
		return "ImmutableExample [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
