package com.jitin.dozercontextbasedmapping.model;

public class StudentBO {
	private Integer id;
	private String name;
	private AddressBO address;

	public StudentBO() {

	}

	public StudentBO(Integer id, String name, AddressBO address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressBO getAddress() {
		return address;
	}

	public void setAddress(AddressBO address) {
		this.address = address;
	}

}
