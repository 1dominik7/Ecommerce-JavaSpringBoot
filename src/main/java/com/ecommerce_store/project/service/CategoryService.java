package com.ecommerce_store.project.service;

import com.ecommerce_store.project.model.Category;
import com.ecommerce_store.project.payload.CategoryDTO;
import com.ecommerce_store.project.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO CategoryDTO, Long categoryId);
}
