package com.jitin.dozercustomconverter.controller;

import java.util.List;

import com.jitin.dozercustomconverter.dto.TestBooleanResponseDTO;
import com.jitin.dozercustomconverter.dto.TestRequestDTO;
import com.jitin.dozercustomconverter.dto.TestStringResponseDTO;

public interface TestController {
	public TestBooleanResponseDTO testBoolean(TestRequestDTO testRequestDTO);

	public TestStringResponseDTO testString(TestRequestDTO testRequestDTO);
	
	public List<TestStringResponseDTO> testMapAsListBooleanToString();
	
	public List<TestBooleanResponseDTO> testMapAsListStringToBoolean();
}
