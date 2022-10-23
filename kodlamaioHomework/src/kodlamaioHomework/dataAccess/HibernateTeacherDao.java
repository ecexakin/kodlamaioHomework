package kodlamaioHomework.dataAccess;

import kodlamaioHomework.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Hibernate İLE ÖĞRETMEN EKLENDİ");
	}

}
