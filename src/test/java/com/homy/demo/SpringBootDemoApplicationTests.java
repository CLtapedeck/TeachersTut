package com.homy.demo;

import com.homy.rest.controller.TeacherController;
import com.homy.rest.dao.TeacherDAO;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

// Making a change
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Test
	public void contextLoads() {

	}
	@Test
	public void checkTeacherNumber() {
		TeacherDAO testDAO = new TeacherDAO();
		Assert.assertEquals((testDAO.getAllTeachers()).getTeacherList().size(),3);
	}

}
