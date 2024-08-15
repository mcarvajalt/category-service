package co.com.pragma.category.application.handler;

import co.com.pragma.category.application.dto.CategoryRequest;
import co.com.pragma.category.application.mapper.CategoryRequestMapper;
import co.com.pragma.category.domain.api.ICategoryServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryHandler implements  ICategoryHandler{
    private final ICategoryServicePort categoryServicePort;
    private final CategoryRequestMapper categoryRequestMapper;
    @Override
    public void saveCategory(CategoryRequest categoryRequest) {
        categoryServicePort.saveCategory(categoryRequestMapper.toCategory(categoryRequest));
    }
}
