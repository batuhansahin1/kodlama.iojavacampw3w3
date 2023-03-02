package kodlama.io.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CategoryDao;
import kodlama.io.entities.Category;

public class CategoryManager {

	 private List<Category> categories = new ArrayList<>();
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao,List<Category> categories,Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.categories=categories;
		this.loggers=loggers;
		
	}



	public void add(Category category) throws Exception {
	
		for(Category i:categories) {
			
			if(i.getName()==category.getName()) {
				throw new Exception("Bu isim mevcuttur");
			}
			
		}
		categories.add(category);
		this.categoryDao.add(category);
		
		
		
		for(Logger logger:loggers) {
			logger.log(category.getName());
		}
	}
	
}
