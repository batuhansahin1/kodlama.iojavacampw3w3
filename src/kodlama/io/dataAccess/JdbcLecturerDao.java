package kodlama.io.dataAccess;

import kodlama.io.entities.Lecturer;

public class JdbcLecturerDao implements LecturerDao {

	@Override
	public void add(Lecturer lecturer) {
		System.out.println("Jdbc ile eklendi"+lecturer.getFirsName()+" "+lecturer.getLastName());
		
	}

}
