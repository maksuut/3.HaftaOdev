package oopWithNLayeredApp;

import oopWithNLayeredApp.business.CourseManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateCourseDao;
import oopWithNLayeredApp.dataAccess.JdbcCourseDao;
import oopWithNLayeredApp.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1,"java",300);
		Course course2 = new Course(23,"python",0);
		Course[] courses = {};
		Logger[] loggers = {new DatabaseLogger(),new FileLogger()};
		
		CourseManager courseManager = 
				new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1, courses);
		courseManager.add(course2, courses);
		
	

	}

}
