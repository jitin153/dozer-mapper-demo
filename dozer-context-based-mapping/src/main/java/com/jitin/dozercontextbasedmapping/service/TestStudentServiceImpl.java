package com.jitin.dozercontextbasedmapping.service;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jitin.dozercontextbasedmapping.dto.StudentDTO;
import com.jitin.dozercontextbasedmapping.model.AddressBO;
import com.jitin.dozercontextbasedmapping.model.StudentBO;
import com.jitin.dozercontextbasedmapping.util.DozerUtil;

@Service("testStudentService")
public class TestStudentServiceImpl implements TestStudentService {

	@Resource
	private DozerUtil dozerUtil;

	/*
	 * Hardcoded student list.
	 */
	private List<StudentBO> students = Arrays.asList(
			new StudentBO(1, "Varun", new AddressBO(10, "Test Street1", "Test City1", "Test State1", 000000)),
			new StudentBO(2, "Arihant", new AddressBO(109, "Test Street2", "Test City2", "Test State2", 000000)),
			new StudentBO(3, "Mukesh", new AddressBO(8, "Test Street3", "Test City3", "Test State3", 000000)),
			new StudentBO(4, "Karan", new AddressBO(47, "Test Street4", "Test City4", "Test State4", 000000)));

	@Override
	public List<StudentDTO> getStudentWithoutAddress() {
		return dozerUtil.mapAsList(students, StudentDTO.class, "noAddressMap");
	}

	@Override
	public List<StudentDTO> getStudentWithAddress() {

		return dozerUtil.mapAsList(students, StudentDTO.class);
	}
}
