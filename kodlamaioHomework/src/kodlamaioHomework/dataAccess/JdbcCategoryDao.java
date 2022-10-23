package kodlamaioHomework.dataAccess;

import kodlamaioHomework.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC İLE KATEGORİ EKLENDİ");
		
	}

}
