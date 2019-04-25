package com.example.OnlineQueueSS.Services;

import com.example.OnlineQueueSS.Entity.Category;
import java.util.List;

public interface CategoryService {

    Category addCategory(Category category);

    void removeCategory(long categoryId);

    Category changeCategory(Category category, long categoryId);

    List<Category> getAllCategory();

}
