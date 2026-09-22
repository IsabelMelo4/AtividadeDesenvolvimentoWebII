package com.example.AtividadeDaw2.DtoResponse;

import com.example.AtividadeDaw2.Model.ProductModel;
import com.example.AtividadeDaw2.Repository.ProductRepository;

public record DtoResponseProduct(String name, float price, int quant, boolean disponivel, int idcategory) {

    public DtoResponseProduct(ProductModel productModel) {
        this(productModel.getName(), productModel.getPrice(), productModel.getQuant(), productModel.isDisponivel(), productModel.getId_category());

    }

}
