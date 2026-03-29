package ru.wingchunclub.api.dto;

import java.util.List;
import java.util.UUID;

// DTO с полной иерархией родителей
public record CategoryWithParentsDto(
        UUID id,
        String name,
        List<CategoryDto> parents
) {}
