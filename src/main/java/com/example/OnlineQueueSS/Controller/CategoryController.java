package com.example.OnlineQueueSS.Controller;

import com.example.OnlineQueueSS.Entity.Category;
import com.example.OnlineQueueSS.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/category")
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @DeleteMapping("/category/{categoryId}")
    public void removeCategory(@PathVariable long categoryId) {
        categoryService.removeCategory(categoryId);
    }

    @PostMapping("/postCategory")
    @ResponseStatus(HttpStatus.CREATED)
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

    @PutMapping("/category/{categoryId}")
    public ResponseEntity<?> updateCategory(@RequestBody Category category, @PathVariable long categoryId) {
        Category currentCategory = categoryService.changeCategory(category, categoryId);
        currentCategory.setName(category.getName());
        categoryService.changeCategory(currentCategory, categoryId);
        return new ResponseEntity<Category>(currentCategory, HttpStatus.OK);
    }
}
