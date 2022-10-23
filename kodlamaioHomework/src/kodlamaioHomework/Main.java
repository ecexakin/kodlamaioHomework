package kodlamaioHomework;

import kodlamaioHomework.business.CategoryManager;
import kodlamaioHomework.business.CourseManager;
import kodlamaioHomework.business.TeacherManager;
import kodlamaioHomework.core.Logging.DatabaseLogger;
import kodlamaioHomework.core.Logging.FileLogger;
import kodlamaioHomework.core.Logging.ILogger;
import kodlamaioHomework.core.Logging.MailLogger;
import kodlamaioHomework.dataAccess.HibernateCateegoryDao;
import kodlamaioHomework.dataAccess.HibernateCourseDao;
import kodlamaioHomework.dataAccess.HibernateTeacherDao;
import kodlamaioHomework.entities.Category;
import kodlamaioHomework.entities.Course;
import kodlamaioHomework.entities.Teacher;


public class Main {

	public static void main(String[] args) throws Exception {
		//TEACHER CONTROL 
		
		Teacher teacher = new Teacher(2,"ece");
		ILogger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};

		TeacherManager teacherManager =
				new TeacherManager(new HibernateTeacherDao(), loggers);
		
		teacherManager.add(teacher);
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("--------------------");

		
		//COURSE CONTROL
		
		Course course = new Course(5,"java",500);
		ILogger[] loggers2= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers2);
		courseManager.add(course);
		
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("--------------------");

		//CATEGORY CONTROL
		
		Category category = new Category(5,"ABC");
		ILogger[] loggers3= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		CategoryManager categoryManager = new CategoryManager(new HibernateCateegoryDao(), loggers3);

		categoryManager.add(category);
		
	}

}
