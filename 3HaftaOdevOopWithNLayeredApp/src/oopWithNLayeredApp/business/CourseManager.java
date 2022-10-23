package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.CourseDao;

import oopWithNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}


	public void add(Course course, Course[] courses) throws Exception {
		if (course.getUnitPrice() < 0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
		}
		
	//kurs ismi aynı olmama if kodu gelecek
			
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}

	}

}

