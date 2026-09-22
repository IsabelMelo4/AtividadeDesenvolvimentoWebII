package com.example.AtividadeDaw2.Controller;

import com.example.AtividadeDaw2.DtoCreate.DtoCreateCategory;
import com.example.AtividadeDaw2.Model.CategoryModel;
import com.example.AtividadeDaw2.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}

@DeleteMapping("/{id}")
    public void voidDeleteCategory(){

}
}
