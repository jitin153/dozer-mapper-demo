package com.jitin.dozercustomconverter.service;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jitin.dozercustomconverter.dto.TestBooleanResponseDTO;
import com.jitin.dozercustomconverter.dto.TestRequestDTO;
import com.jitin.dozercustomconverter.dto.TestStringResponseDTO;
import com.jitin.dozercustomconverter.model.TestBooleanToStringBO;
import com.jitin.dozercustomconverter.model.TestStringToBooleanBO;
import com.jitin.dozercustomconverter.util.DozerUtil;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService {
	@Resource
	private DozerUtil dozerUtil;

	@Override
	public TestBooleanResponseDTO stringToBoolean(TestRequestDTO testRequestDTO) {
		TestBooleanResponseDTO testResponseDTO = new TestBooleanResponseDTO();
		if (null != testRequestDTO && null != testRequestDTO.getPercentage()) {
			TestStringToBooleanBO testBO = new TestStringToBooleanBO();
			if (testRequestDTO.getPercentage() >= 33) {
				testBO.setIsPass("Yes");
			} else {
				testBO.setIsPass("No");
			}
			dozerUtil.map(testBO, testResponseDTO);
		}
		return testResponseDTO;
	}

	@Override
	public TestStringResponseDTO booleanToString(TestRequestDTO testRequestDTO) {
		TestStringResponseDTO testStringResponseDTO = new TestStringResponseDTO();
		if (null != testRequestDTO && null != testRequestDTO.getPercentage()) {
			TestBooleanToStringBO testBooleanToStringBO = new TestBooleanToStringBO();
			if (testRequestDTO.getPercentage() >= 33) {
				testBooleanToStringBO.setIsPass(Boolean.TRUE);
			} else {
				testBooleanToStringBO.setIsPass(Boolean.FALSE);
			}
			dozerUtil.map(testBooleanToStringBO, testStringResponseDTO);
		}
		return testStringResponseDTO;
	}

	@Override
	public List<TestStringResponseDTO> mapAsListBooleanToString() {
		TestBooleanToStringBO testBooleanToStringBO1 = new TestBooleanToStringBO();
		testBooleanToStringBO1.setIsPass(Boolean.TRUE);
		TestBooleanToStringBO testBooleanToStringBO2 = new TestBooleanToStringBO();
		testBooleanToStringBO2.setIsPass(Boolean.TRUE);
		TestBooleanToStringBO testBooleanToStringBO3 = new TestBooleanToStringBO();
		testBooleanToStringBO3.setIsPass(Boolean.FALSE);
		List<TestBooleanToStringBO> listTestBooleanToStringBO = Arrays.asList(testBooleanToStringBO1,
				testBooleanToStringBO2, testBooleanToStringBO3);
		List<TestStringResponseDTO> listTestStringResponseDTO = dozerUtil.mapAsList(listTestBooleanToStringBO,
				TestStringResponseDTO.class);
		return listTestStringResponseDTO;
	}

	@Override
	public List<TestBooleanResponseDTO> mapAsListStringToBoolean() {
		TestStringToBooleanBO testStringToBooleanBO1 = new TestStringToBooleanBO();
		testStringToBooleanBO1.setIsPass("Yes");
		TestStringToBooleanBO testStringToBooleanBO2 = new TestStringToBooleanBO();
		testStringToBooleanBO2.setIsPass("No");
		TestStringToBooleanBO testStringToBooleanBO3 = new TestStringToBooleanBO();
		testStringToBooleanBO3.setIsPass("Yes");
		List<TestStringToBooleanBO> listTestStringToBooleanBO = Arrays.asList(testStringToBooleanBO1,
				testStringToBooleanBO2, testStringToBooleanBO3);
		List<TestBooleanResponseDTO> listTestBooleanResponseDTO = dozerUtil.mapAsList(listTestStringToBooleanBO,
				TestBooleanResponseDTO.class);
		return listTestBooleanResponseDTO;
	}
}
