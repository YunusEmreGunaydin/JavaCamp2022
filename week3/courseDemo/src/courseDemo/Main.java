package courseDemo;


import java.util.List;

import courseDemo.business.CategoryManager;
import courseDemo.business.CourseManager;
import courseDemo.core.logging.DatabaseLogger;
import courseDemo.core.logging.FileLogger;
import courseDemo.core.logging.Logger;
import courseDemo.core.logging.MailLogger;
import courseDemo.dataAccess.HibernateCourseDao;
import courseDemo.dataAccess.JdbcCategoryDao;
import courseDemo.entities.Category;
import courseDemo.entities.Course;
import courseDemo.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course = new Course(1,"Java Programlama",10);
		Course course2 = new Course(2,"C# Programlama",21);
		
		Course[] courses = {course,course2};
		
		
		Category category = new Category(1, "Kurslar");
		Category category2 = new Category(2, "Eğitmenler");
		
		Category[] categories = {category,category2};
		
		Educator educator = new Educator();
		educator.setId(3);
		educator.setEducatorFirstName("Engin");
		educator.setEducatorLastName("Demiroğ");
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers,categories);
		categoryManager.add(category);
		categoryManager.add(category2);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers,courses);
		courseManager.add(course);
		courseManager.add(course2);
		
		
		
		
		
		
		
	}

}
