package com.jitin.dozercontextbasedmapping.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jitin.dozercontextbasedmapping.dto.StudentDTO;
import com.jitin.dozercontextbasedmapping.service.TestStudentService;

@RestController
public class TestStudentControllerImpl implements TestStudentController {
	@Resource
	private TestStudentService testStudentService;

	@GetMapping("/studentwithoutaddress")
	public List<StudentDTO> getStudentWithoutAddress() {
		return testStudentService.getStudentWithoutAddress();
	}

	@GetMapping("/studentwithaddress")
	public List<StudentDTO> getStudentWithAddress() {
		return testStudentService.getStudentWithAddress();
	}

}
