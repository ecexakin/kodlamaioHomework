package kodlamaioHomework.dataAccess;

import kodlamaioHomework.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate İLE KURS EKLENDİ");
		
	}

}
