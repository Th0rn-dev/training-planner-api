package ru.wingchunclub.api.dto;

import java.util.UUID;

public record CreateCategoryRequest (
    String name,
    UUID parentId
) {}
