package com.example.AtividadeDaw2.Model;
import com.example.AtividadeDaw2.DtoCreate.DtoCreateProduct;
import com.example.AtividadeDaw2.DtoResponse.DtoResponseProduct;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Entity
@Table(name = "products")

public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private Integer id_category;
    private String name;
    private float price;
    private Integer quant;
    private boolean disponivel;

    public ProductModel(DtoCreateProduct dto) {
        this.name = dto.name();
        this.price = dto.quant();
        this.quant = dto.quant();
        this.disponivel = dto.disponivel();
        this.id_category = dto.id_category();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }


    public void setDiponivel(boolean diponivel) {
        this.disponivel = diponivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    public Integer getId_category() {
        return id_category;
    }

    public void setId_category(Integer id_category) {
        this.id_category = id_category;
    }
}

