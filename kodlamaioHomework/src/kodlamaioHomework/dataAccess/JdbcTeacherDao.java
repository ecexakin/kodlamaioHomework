package kodlamaioHomework.dataAccess;

import kodlamaioHomework.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("JDBC İLE ÖĞRETMEN EKLENDİ");
		
	}

}
