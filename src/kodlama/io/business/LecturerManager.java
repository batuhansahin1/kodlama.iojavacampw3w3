package kodlama.io.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.LecturerDao;
import kodlama.io.entities.Lecturer;

public class LecturerManager {

	 private Logger[] loggers;
	private LecturerDao lecturerDao;
	 List<Lecturer> lecturers=new ArrayList<>();
	 
	


	public LecturerManager(LecturerDao lecturerDao,Logger[] loggers,List<Lecturer> lecturers) {
		super();
		this.lecturerDao = lecturerDao;
		this.loggers=loggers;
		
	}


	public void add(Lecturer lecturer) {
	
		this.lecturerDao.add(lecturer);
		lecturers.add(lecturer);
		for(Logger log:loggers) {
			log.log(lecturer.getFirsName()+" "+lecturer.getLastName());
		}
		
}
}
