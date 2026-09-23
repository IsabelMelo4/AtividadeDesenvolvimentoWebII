package com.example.AtividadeDaw2.Repository;

import com.example.AtividadeDaw2.Model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryModel, Integer> {
    CategoryModel findCategoryModelById(Integer id);
}
