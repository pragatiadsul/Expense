package com.Expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Expense.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	Category findByCategoryId(int cid);

	Category findByCategory(String name);

	// void save(CategoryDto categoryDto);

}
