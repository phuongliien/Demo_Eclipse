package com.journaldev.spring.dao;

import java.util.*;
import com.journaldev.spring.model.Course;

public interface CourseDAO {
	public void addCourse(Course Cs);
	public void updateCourse(Course Cs);
	public List<Course> listCourses();
	public Course getCourseById(int id);
	public void removeCourse(int id);
}
