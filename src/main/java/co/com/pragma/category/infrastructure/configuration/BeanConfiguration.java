package co.com.pragma.category.infrastructure.configuration;

import co.com.pragma.category.domain.api.ICategoryServicePort;
import co.com.pragma.category.domain.spi.ICategoryPersistencePort;
import co.com.pragma.category.domain.usecase.CategoryUseCase;
import co.com.pragma.category.infrastructure.out.jpa.adapter.CategoryJpaAdapter;
import co.com.pragma.category.infrastructure.out.jpa.mapper.CategoryEntityMapper;
import co.com.pragma.category.infrastructure.out.jpa.repository.ICategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final ICategoryRepository categoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;
    @Bean
    public ICategoryPersistencePort CategoryPersistencePort() {
        return new CategoryJpaAdapter(categoryRepository, categoryEntityMapper);
    }
    @Bean
    public ICategoryServicePort pokemonServicePort() {
        return new CategoryUseCase(CategoryPersistencePort());
    }
}
