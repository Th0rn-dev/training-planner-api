package ru.wingchunclub.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import ru.wingchunclub.api.dto.CategoryTreeDto;

import java.util.List;

public interface CategoryController {
    @GetMapping("/categories")
    ResponseEntity<List<CategoryTreeDto>> getTreeCategories();
}
