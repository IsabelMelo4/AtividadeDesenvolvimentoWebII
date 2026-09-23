package com.example.AtividadeDaw2.Controller;

import com.example.AtividadeDaw2.DtoCreate.DtoCreateProduct;
import com.example.AtividadeDaw2.DtoResponse.DtoResponseProduct;
import com.example.AtividadeDaw2.Model.ProductModel;
import com.example.AtividadeDaw2.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired ProductRepository productRepository;


@GetMapping
    public List<ProductModel>  getProducts(){
      return productRepository.findAll();
}

@PostMapping
    public ProductModel createProducts(@RequestBody DtoCreateProduct dtoCreate){
    ProductModel product = new ProductModel(dtoCreate);

    ResponseEntity.status(HttpStatus.OK).body("Produto Criado");
    return productRepository.save(product);
}

@PutMapping("/{id}")
    public ProductModel pullProduct(@PathVariable Integer id, @RequestBody ProductModel productModel){
    ProductModel product = productRepository.findProductById(id);
    product.setName(product.getName());
    product.setPrice(productModel.getPrice());
    product.setQuant(productModel.getQuant());
    product.setDisponivel(productModel.isDisponivel());
    return productRepository.save(product);


}

@DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id){
    productRepository.deleteById(id);


}

}
