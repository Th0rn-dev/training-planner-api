package ru.wingchunclub.api.dto;

import java.util.UUID;

public record UpdateCategoryRequest(
        String name,
        UUID parentId
) {}
