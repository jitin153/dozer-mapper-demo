package com.jitin.dozercontextbasedmapping.service;

import java.util.List;

import com.jitin.dozercontextbasedmapping.dto.StudentDTO;

public interface TestStudentService {

	public List<StudentDTO> getStudentWithoutAddress();

	public List<StudentDTO> getStudentWithAddress();

}
