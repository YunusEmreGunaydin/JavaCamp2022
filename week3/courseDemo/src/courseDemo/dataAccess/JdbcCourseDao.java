package courseDemo.dataAccess;

import courseDemo.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi."+course.getCourseName());
		
	}

}
