package kodlama.io.dataAccess;

import kodlama.io.entities.Lecturer;

public class HibernateLecturerDao implements LecturerDao {

	@Override
	public void add(Lecturer lecturer) {
		System.out.println("Hibernate ile eklendi"+lecturer.getFirsName()+" "+lecturer.getLastName());
		
	}

}
