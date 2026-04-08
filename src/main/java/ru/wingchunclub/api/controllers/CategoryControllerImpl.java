package ru.wingchunclub.api.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.wingchunclub.api.dto.CategoryTreeDto;
import ru.wingchunclub.api.servises.CategoryService;

import java.util.List;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CategoryControllerImpl implements CategoryController {

    private final CategoryService categoryService;

    @Override
    public List<CategoryTreeDto> getTreeCategories() {
        return categoryService.getCategories();
    }
}