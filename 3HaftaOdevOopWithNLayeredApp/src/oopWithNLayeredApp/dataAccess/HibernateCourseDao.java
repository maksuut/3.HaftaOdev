package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println(course.getName() + " kursu Hibernate ile veritabanına eklendi");
	}

}
