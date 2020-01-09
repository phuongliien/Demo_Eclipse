package com.journaldev.spring.dao;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.model.Course;
import com.journaldev.spring.model.Person;

@Repository
public class CourseDAOImpl implements CourseDAO {
	private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addCourse(Course Cs) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(Cs);
		logger.info("Course saved successfully, Course Details="+Cs);
	}

	@Override
	public void updateCourse(Course Cs) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(Cs);
		logger.info("Course updated successfully, Course Details="+Cs);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Course> listCourses() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Course> listCourses = session.createQuery("from Course").list();
		for(Course Cs : listCourses){
			logger.info("Course List::"+Cs);
		}
		return listCourses;
	}

	@Override
	public Course getCourseById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Course Cs = (Course) session.load(Course.class, new Integer(id));
		logger.info("Course loaded successfully, Course details="+Cs);
		return Cs;
	}

	@Override
	public void removeCourse(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Course Cs = (Course) session.load(Course.class, new Integer(id));
		if(null != Cs){
			session.delete(Cs);
		}
		logger.info("Course deleted successfully, Course details="+Cs);
	}

}
