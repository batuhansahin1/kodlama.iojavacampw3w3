package kodlama.io.dataAccess;

import kodlama.io.entities.Category;

public class JdcbcCategoryDao implements CategoryDao {
public void add(Category category) {
		
		System.out.println("Jdbc ile eklendi"+category.getName());
		
	}
}
