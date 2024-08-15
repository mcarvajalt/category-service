package co.com.pragma.category.domain.api;

import co.com.pragma.category.domain.model.Category;

public interface ICategoryServicePort {
    void saveCategory(Category category);
}
