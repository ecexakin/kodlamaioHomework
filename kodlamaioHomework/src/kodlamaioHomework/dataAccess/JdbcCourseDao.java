package kodlamaioHomework.dataAccess;

import kodlamaioHomework.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC İLE KURS EKLENDİ");
		
	}

}
