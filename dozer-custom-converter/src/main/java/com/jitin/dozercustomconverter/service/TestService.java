package com.jitin.dozercustomconverter.service;

import java.util.List;

import com.jitin.dozercustomconverter.dto.TestBooleanResponseDTO;
import com.jitin.dozercustomconverter.dto.TestRequestDTO;
import com.jitin.dozercustomconverter.dto.TestStringResponseDTO;

public interface TestService {
	public TestBooleanResponseDTO stringToBoolean(TestRequestDTO testRequestDTO);

	public TestStringResponseDTO booleanToString(TestRequestDTO testRequestDTO);

	public List<TestStringResponseDTO> mapAsListBooleanToString();
	
	public List<TestBooleanResponseDTO> mapAsListStringToBoolean();
}
