package com.jitin.dozercontextbasedmapping.model;

public class AddressBO {
	private Integer houseNumber;
	private String Street;
	private String city;
	private String state;
	private Integer zipcode;

	public AddressBO() {
	}

	public AddressBO(Integer houseNumber, String street, String city, String state, Integer zipcode) {
		this.houseNumber = houseNumber;
		Street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public Integer getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(Integer houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

}
