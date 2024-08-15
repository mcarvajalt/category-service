package co.com.pragma.category.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryRequest {
    @NotBlank(message = "Name is required")
    @Size(max = 50, message = "Name cannot be more than 50 characters\"")
    private String name;
    @NotBlank(message = "Description is required")
    @Size(max = 90, message = "Description cannot be more than 90 characters")
    private String description;
}
