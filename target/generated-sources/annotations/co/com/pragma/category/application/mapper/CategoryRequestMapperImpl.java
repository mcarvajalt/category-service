package co.com.pragma.category.application.mapper;

import co.com.pragma.category.application.dto.CategoryRequest;
import co.com.pragma.category.domain.model.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-15T16:19:51-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class CategoryRequestMapperImpl implements CategoryRequestMapper {

    @Override
    public Category toCategory(CategoryRequest categoryRequest) {
        if ( categoryRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( categoryRequest.getName() );
        category.setDescription( categoryRequest.getDescription() );

        return category;
    }
}
