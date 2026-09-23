package com.example.AtividadeDaw2.Model;

import com.example.AtividadeDaw2.DtoCreate.DtoCreateCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Category")
public class CategoryModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String category;

    public CategoryModel(DtoCreateCategory dto) {
        this.category = dto.name();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String name) {
        this.category = name;
    }
}
