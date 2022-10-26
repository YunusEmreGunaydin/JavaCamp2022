package courseDemo.dataAccess;

import courseDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına eklendi." +category.getCategoryName());
		
	}

}
