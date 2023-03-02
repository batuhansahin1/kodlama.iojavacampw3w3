package kodlama.io;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.business.CategoryManager;
import kodlama.io.business.CourseManager;
import kodlama.io.business.LecturerManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.HibernateCategoryDao;
import kodlama.io.dataAccess.JdbcCourseDao;
import kodlama.io.dataAccess.JdbcLecturerDao;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;
import kodlama.io.entities.Lecturer;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};

		
		Category category1=new Category(1,"Back-end");
		Category category2=new Category(2,"Front-end");
		Category category3= new Category(3,"ABX");
		 List<Category> categories = new ArrayList<>();
		
		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),categories,loggers);
		categoryManager.add(category3);
		System.out.println("-------------------------------------------------------------------------");
		
		
		
		Course course1=new Course(1," JAVA",5000);
		Course course2=new Course(2,"C",566);
		Course course3=new Course(3,"Phyton",3232);
		 List<Course> courses = new ArrayList<>();
		Course course4= new Course(4,"C++",66565);
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(), courses, loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		System.out.println("------------------------------------------------------------------------------");
		
		
		Lecturer lecturer=new Lecturer();
		List<Lecturer> lecturers=new ArrayList<>();
		
		lecturer.setFirsName("Engin");
		lecturer.setLastName("Demiroğ");
		
		LecturerManager lecturerManager=new LecturerManager(new JdbcLecturerDao(), loggers,lecturers);
		lecturerManager.add(lecturer);
		
		
		
		
		
	}

}
