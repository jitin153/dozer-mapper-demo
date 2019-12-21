package com.jitin.dozercontextbasedmapping;

import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DozerContextBasedMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DozerContextBasedMappingApplication.class, args);
	}
	
	@Bean
	public DozerBeanMapper mapper() {
		List<String> mappingFiles = Arrays.asList("dozerMapping.xml");
		DozerBeanMapper mapper = new DozerBeanMapper(mappingFiles);
		return mapper;
	}

}

