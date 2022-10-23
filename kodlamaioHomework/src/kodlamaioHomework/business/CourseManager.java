package kodlamaioHomework.business;

import kodlamaioHomework.core.Logging.ILogger;
import kodlamaioHomework.dataAccess.CourseDao;
import kodlamaioHomework.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private ILogger[] loggers;
	
	public CourseManager(CourseDao courseDao, ILogger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	public void add(Course course) throws Exception {
		if (course.getPrice()<0) {
			throw new Exception("Ürün tl 0dan küçük olamaz");
		} 
		courseDao.add(course);
	
	for (ILogger logger : loggers) {
		logger.log(course.getName());

	}
	

}


	
}
