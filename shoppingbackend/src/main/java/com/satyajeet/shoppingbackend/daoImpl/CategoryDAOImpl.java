package com.satyajeet.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.satyajeet.shoppingbackend.dao.CategoryDao;
import com.satyajeet.shoppingbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDao {
	
	private  static List<Category> categorys=new ArrayList<>();
	
	static{
		Category category=new Category();
		category.setId(1);
		category.setDescription("This is a Television");
		category.setImageUrl("Image_1.png");
		category.setName("Television");
		categorys.add(category);
		
		category=new Category();
		category.setId(2);
		category.setDescription("This is a Porn");
		category.setImageUrl("Image_2.png");
		category.setName("Digital Playground");
		categorys.add(category);
		
		category=new Category();
		category.setId(3);
		category.setDescription("This is a site");
		category.setImageUrl("Image_2.png");
		category.setName("Digital Sins");
		categorys.add(category);
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categorys;
	}
	@Override
	public Category get(int id) {
		// Fetch category based on id
		for (Category category : categorys) {
			if(category.getId()==id)
				return category;
		}
		
		return null;
	}


}
