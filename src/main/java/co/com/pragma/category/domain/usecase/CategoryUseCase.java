package co.com.pragma.category.domain.usecase;

import co.com.pragma.category.domain.api.ICategoryServicePort;
import co.com.pragma.category.domain.model.Category;
import co.com.pragma.category.domain.spi.ICategoryPersistencePort;
import org.springframework.stereotype.Component;

public class CategoryUseCase implements ICategoryServicePort {
    private final ICategoryPersistencePort categoryPersistencePort;

    public CategoryUseCase(ICategoryPersistencePort categoryPersistencePort) {
        this.categoryPersistencePort = categoryPersistencePort;
    }
    @Override
    public void saveCategory(Category category) {
        categoryPersistencePort.saveCategory(category);
    }
}
