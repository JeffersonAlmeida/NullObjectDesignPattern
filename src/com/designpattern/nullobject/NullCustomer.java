package com.designpattern.nullobject;

class NullCustomer extends Customer {

	protected NullCustomer() {}
	
	@Override
	public int getId() {
		return -1;
	}
	
	@Override
	public String getName() {
		return "no-name";
	}

	@Override
	public String toString() {
		return "Customer [id=" + getId() + ", name=" + getName() + "]";
	}
}
