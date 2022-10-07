package com.edureka.spring.jdbc.intro.dao;

import java.util.List;

import com.edureka.spring.jdbc.intro.bean.Course;

/**
 * @author nitish.gupta_spicemo
 */
public interface CourseDAO {
	public Boolean insertCourse(Course course);
	public Boolean deleteCourse(Course course);
	public List<Course> findByCourseTitle(String courseTitle);
	public Boolean updateCourse(String newCourseName, Course course);
}
