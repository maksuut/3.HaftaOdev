package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println(course.getName() + " kursu Jdbc ile veritabanına eklendi");
	}

}
