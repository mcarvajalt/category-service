package co.com.pragma.category.infrastructure.out.jpa.adapter;

import co.com.pragma.category.domain.model.Category;
import co.com.pragma.category.domain.spi.ICategoryPersistencePort;
import co.com.pragma.category.infrastructure.exception.CategoryAlreadyExistsException;
import co.com.pragma.category.infrastructure.out.jpa.mapper.CategoryEntityMapper;
import co.com.pragma.category.infrastructure.out.jpa.repository.ICategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryJpaAdapter implements ICategoryPersistencePort {
    private final ICategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;
    @Override
    public void saveCategory(Category category) {
        if(categoryRepository.findByName(category.getName()).isPresent()){
            throw new CategoryAlreadyExistsException();
        }
        categoryRepository.save(categoryEntityMapper.toEntity(category));
    }
}
