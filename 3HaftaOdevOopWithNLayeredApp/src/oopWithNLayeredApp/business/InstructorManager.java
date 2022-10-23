package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.JdbcInstructorDao;
import oopWithNLayeredApp.entities.Instructor;

public class InstructorManager {
	public void add(Instructor instructor) {
				
		JdbcInstructorDao instructorDao = new JdbcInstructorDao();
		instructorDao.add(instructor);
	}

}
