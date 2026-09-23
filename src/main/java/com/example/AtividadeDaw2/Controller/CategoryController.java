package com.example.AtividadeDaw2.Controller;

import com.example.AtividadeDaw2.DtoCreate.DtoCreateCategory;
import com.example.AtividadeDaw2.Model.CategoryModel;
import com.example.AtividadeDaw2.Repository.CategoryRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

@Autowired CategoryRepository categoryRepository;

@GetMapping
public List<CategoryModel> getCategory(){
    return categoryRepository.findAll();
}

@PostMapping
public void delCategory(@RequestBody DtoCreateCategory categoryModel){
    CategoryModel newCategory = new CategoryModel(categoryModel);
    ResponseEntity.status(HttpStatus.OK).body("Categoria adicionada");
    categoryRepository.save(newCategory);
}

@DeleteMapping("/{id}")
    public void DeleteCategory(@PathVariable Integer id){
    categoryRepository.deleteById(id);
}

@PutMapping("/{id}")
    public void updateCategory(@PathVariable Integer id, @RequestBody CategoryModel categoryModel){
    CategoryModel categoryRename = categoryRepository.findCategoryModelById(id);
    categoryRename.setCategory(categoryModel.getCategory());
    ResponseEntity.status(HttpStatus.OK).body("Produto atualizado e salvo com sucesso");
    categoryRepository.save(categoryRename);
}
}