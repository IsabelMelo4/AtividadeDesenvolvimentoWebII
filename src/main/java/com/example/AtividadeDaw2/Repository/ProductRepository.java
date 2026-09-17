package com.example.AtividadeDaw2.Repository;

import com.example.AtividadeDaw2.Model.ProductModel;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
ProductModel  findProductById(Integer id);
}
