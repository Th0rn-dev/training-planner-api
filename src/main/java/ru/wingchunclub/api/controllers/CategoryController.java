package ru.wingchunclub.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import ru.wingchunclub.api.dto.CategoryTreeDto;

import java.util.List;
import java.util.UUID;

public interface CategoryController {
    @GetMapping("/categories")
    List<CategoryTreeDto> getTreeCategories();

    @GetMapping("/categories/ids")
    List<UUID> getCategoryIds();
}