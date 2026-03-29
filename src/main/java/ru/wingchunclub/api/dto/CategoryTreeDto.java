package ru.wingchunclub.api.dto;

import java.util.List;
import java.util.UUID;

// DTO для древовидной структуры
public record CategoryTreeDto(
        UUID id,
        String name,
        List<CategoryTreeDto> children
) {}