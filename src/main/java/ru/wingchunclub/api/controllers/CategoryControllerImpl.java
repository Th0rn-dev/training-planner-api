package ru.wingchunclub.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.wingchunclub.api.dto.CategoryTreeDto;
import ru.wingchunclub.api.servises.CategoryService;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CategoryControllerImpl implements CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Override
    public ResponseEntity<List<CategoryTreeDto>> getTreeCategories() {
        var tree = categoryService.getCategories();
        return ResponseEntity.ok(tree);
    }
}
