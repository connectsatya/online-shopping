package com.satyajeet.shoppingbackend.dao;

import java.util.List;

import com.satyajeet.shoppingbackend.dto.Category;

public interface CategoryDao {
	
	List<Category> list();
	Category get(int id);
}
