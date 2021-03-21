package com.springdataapi.demo.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springdataapi.demo.service.StudentService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class StudentControllerTest {

	@Autowired
	StudentController controller;

	@Mock
	StudentService service;

	//tests 
	@Test
	public void testGetAllStudents() {
		Mockito.when(service.getAllStudents()).thenReturn(Mockito.any());
		assertNotNull(controller.getAllStudents());
	}
}
