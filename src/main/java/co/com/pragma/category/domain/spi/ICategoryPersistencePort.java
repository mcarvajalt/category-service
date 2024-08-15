package co.com.pragma.category.domain.spi;

import co.com.pragma.category.domain.model.Category;
import lombok.RequiredArgsConstructor;

public interface ICategoryPersistencePort {
    void saveCategory(Category category);
}
