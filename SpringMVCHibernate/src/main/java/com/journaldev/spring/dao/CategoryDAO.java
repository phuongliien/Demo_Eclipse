package com.journaldev.spring.dao;

import java.util.*;

import com.journaldev.spring.model.Category;


public interface CategoryDAO {
	public void addCategory(Category c);
	public void updateCategory(Category c);
	public List<Category> listCategories();
	public Category getCategoryById(int Id);
	public void removeCategory(int Id);
}
