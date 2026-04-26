package ru.wingchunclub.api.servises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.wingchunclub.api.dto.CategoryTreeDto;
import ru.wingchunclub.api.entity.Category;
import ru.wingchunclub.api.repositories.CategoryRepository;

import java.util.*;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryTreeDto> getCategories() {
        var categories = categoryRepository.findAll();

        // Создаём карту: parentId → список дочерних категорий
        Map<UUID, List<Category>> childrenMap = new HashMap<>();

        for (Category category : categories) {
            var parentId = category.getParent() != null
                    ? category.getParent().getId()
                    : null;
            childrenMap.computeIfAbsent(parentId, k -> new ArrayList<>()).add(category);
        }
        return buildTree(null, childrenMap);
    }

    private List<CategoryTreeDto> buildTree(UUID parentId, Map<UUID, List<Category>> childrenMap) {
        List<Category> children = childrenMap.getOrDefault(parentId, List.of());

        return children.stream()
                .map(category -> new CategoryTreeDto(
                        category.getId(),
                        category.getName(),
                        buildTree(category.getId(), childrenMap)
                ))
                .toList();
    }
    public List<UUID> getCategoryIds() {
        return categoryRepository.getAllIds();
    }
}
