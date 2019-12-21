package com.jitin.dozercontextbasedmapping.controller;

import java.util.List;

import com.jitin.dozercontextbasedmapping.dto.StudentDTO;

public interface TestStudentController {

	public List<StudentDTO> getStudentWithoutAddress();

	public List<StudentDTO> getStudentWithAddress();
}
