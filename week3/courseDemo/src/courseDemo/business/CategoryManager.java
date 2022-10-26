package courseDemo.business;

import java.util.List;

import courseDemo.core.logging.Logger;
import courseDemo.dataAccess.CategoryDao;
import courseDemo.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Category[] categories;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers,Category[]categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	public void add(Category category)throws Exception {
		
		for(Category category2:categories) {
			if(category.equals(category2.getCategoryName())) {
				throw new Exception("Kategori isimleri aynı olamaz.");
			}
		}
		
		categoryDao.add(category);
		
		for(Logger logger:loggers) {
			logger.log(category.getCategoryName());
		}
		
	}
	

}
