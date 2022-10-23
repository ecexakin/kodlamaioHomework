package kodlamaioHomework.business;

import kodlamaioHomework.core.Logging.ILogger;
import kodlamaioHomework.dataAccess.TeacherDao;
import kodlamaioHomework.entities.Teacher;

public class TeacherManager {
	
	private TeacherDao teacherDao;
	private ILogger[] loggers;

	public TeacherManager(TeacherDao teacherDao, ILogger[] loggers) {
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	
	}
	
	public void add(Teacher teacher) {
		teacherDao.add(teacher);

		System.out.println("Öğretmen eklendi");
		

		for (ILogger logger : loggers) {
			logger.log(teacher.getName());

		}
	}
	
}
