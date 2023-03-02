package kodlama.io.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager {

	 List<Course> courses = new ArrayList<>();
	private CourseDao courseDao;
	private Logger[] loggers;
	
	
	public CourseManager(CourseDao courseDao,List<Course> courses,Logger[] loggers) {
		super();
		this.courseDao = courseDao;
	this.courses=courses;
	this.loggers=loggers;
	
	}


	public void add(Course course) throws Exception {
		
		for(Course i:courses) {
			
			if(i.getName()==course.getName()) {
				throw new Exception("Kurs ismi mevcuttur");
			}
		}
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0 dan az olamaz");
		}
		this.courseDao.add(course);
	
	for(Logger log:loggers) {
		log.log(course.getName());
	}
	courses.add(course);
	
	}
	
	
	
}
