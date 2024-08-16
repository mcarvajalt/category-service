package co.com.pragma.category.infrastructure.out.jpa.mapper;

import co.com.pragma.category.domain.model.Category;
import co.com.pragma.category.infrastructure.out.jpa.entity.CategoryEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-15T16:19:51-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class CategoryEntityMapperImpl implements CategoryEntityMapper {

    @Override
    public CategoryEntity toEntity(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setName( category.getName() );
        categoryEntity.setDescription( category.getDescription() );

        return categoryEntity;
    }

    @Override
    public Category toCategory(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( categoryEntity.getName() );
        category.setDescription( categoryEntity.getDescription() );

        return category;
    }

    @Override
    public List<Category> toCategoryList(List<CategoryEntity> categoryEntityList) {
        if ( categoryEntityList == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( categoryEntityList.size() );
        for ( CategoryEntity categoryEntity : categoryEntityList ) {
            list.add( toCategory( categoryEntity ) );
        }

        return list;
    }
}
