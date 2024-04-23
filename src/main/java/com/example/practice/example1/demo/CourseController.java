
package com.example.practice.example1.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
//creating a list of courses that returns courseid,coursename,author
	@RequestMapping("/courses")
	public List<Course>retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"java","abc"),
				new Course(2,"javascript","xyz"),
				new Course(3,"react","def")

				);
	}
}
