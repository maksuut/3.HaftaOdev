package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.JdbcCategoryDao;
import oopWithNLayeredApp.entities.Category;

public class CategoryManager {
	public void add(Category category) {
		//kategori ismi aynı olmama if kodu gelecek
		
		JdbcCategoryDao categoryDao = new JdbcCategoryDao();
		categoryDao.add(category);
	}

}
