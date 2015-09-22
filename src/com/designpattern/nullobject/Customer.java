package com.designpattern.nullobject;

public class Customer {

	private int id;
	private String name;
	
	protected Customer(){} // for NullObject Design Pattern
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static Customer newNull(){
		return new NullCustomer();
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
}
