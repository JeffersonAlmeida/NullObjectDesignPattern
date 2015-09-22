package com.designpattern.nullobject;


import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main (String [] args){
		
		List<Customer> list = new ArrayList<Customer>();
		Customer customer = Customer.newNull();
		list.add(new Customer(1, "jefferson"));
		list.add(customer);
		System.out.println(list);
		
	}
}
