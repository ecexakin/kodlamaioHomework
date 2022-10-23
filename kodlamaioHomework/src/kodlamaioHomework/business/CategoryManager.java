package kodlamaioHomework.business;

import kodlamaioHomework.core.Logging.ILogger;
import kodlamaioHomework.dataAccess.CategoryDao;
import kodlamaioHomework.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private ILogger[] loggers;
	public CategoryManager(CategoryDao categoryDao, ILogger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	public void add(Category category) {
		categoryDao.add(category);
		System.out.println("KATEGORİ EKLENDİ");
		
		
		for (ILogger logger : loggers) {
			logger.log(category.getName());
		}
	}
	
	
	
}
