package courseDemo.business;

import java.util.List;

import courseDemo.core.logging.Logger;
import courseDemo.dataAccess.CourseDao;
import courseDemo.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses;
	
	public CourseManager(CourseDao courseDao , Logger[]loggers,Course[] courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void add(Course course) throws Exception {
		
		if(course.getPrice()<0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
		}
		
		for(Course course2:courses) {
			if(course.getCourseName() == course2.getCourseName()) {
				throw new Exception("Aynı isimde 1'den fazla kurs olamaz.");
			}
		}
		
		courseDao.add(course);
		
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		
		
		
		
		
		
		
		
	}
	
	

}
