package kodlamaioHomework.dataAccess;

import kodlamaioHomework.entities.Category;

public class HibernateCateegoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate İLE KATEGORİ EKLENDİ");
		
	}

}
