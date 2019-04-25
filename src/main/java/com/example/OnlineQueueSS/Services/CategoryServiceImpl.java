package com.example.OnlineQueueSS.Services;

import com.example.OnlineQueueSS.Entity.Category;
import com.example.OnlineQueueSS.Repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void removeCategory(long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    @Override
    public Category changeCategory(Category category, long categoryId) {
        Category categoryUpdate = categoryRepository.findById(categoryId).get();
        return categoryRepository.save(categoryUpdate);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }
}
