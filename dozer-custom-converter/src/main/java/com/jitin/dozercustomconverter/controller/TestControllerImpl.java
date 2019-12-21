package com.jitin.dozercustomconverter.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jitin.dozercustomconverter.dto.TestBooleanResponseDTO;
import com.jitin.dozercustomconverter.dto.TestRequestDTO;
import com.jitin.dozercustomconverter.dto.TestStringResponseDTO;
import com.jitin.dozercustomconverter.service.TestService;

@RestController
public class TestControllerImpl implements TestController {
	@Resource
	private TestService testService;

	@RequestMapping(value = "/testboolean", method = RequestMethod.POST)
	public TestBooleanResponseDTO testBoolean(@RequestBody TestRequestDTO testRequestDTO) {
		return testService.stringToBoolean(testRequestDTO);
	}

	@RequestMapping(value = "/teststring", method = RequestMethod.POST)
	public TestStringResponseDTO testString(@RequestBody TestRequestDTO testRequestDTO) {
		return testService.booleanToString(testRequestDTO);
	}

	@RequestMapping(value = "/testmapaslistbooleantostring", method = RequestMethod.GET)
	public List<TestStringResponseDTO> testMapAsListBooleanToString() {
		return testService.mapAsListBooleanToString();
	}

	@RequestMapping(value = "/testmapasliststringtoboolean", method = RequestMethod.GET)
	public List<TestBooleanResponseDTO> testMapAsListStringToBoolean() {
		return testService.mapAsListStringToBoolean();
	}

}
