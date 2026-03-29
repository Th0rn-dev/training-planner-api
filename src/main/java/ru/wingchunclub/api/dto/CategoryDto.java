package ru.wingchunclub.api.dto;

import java.util.UUID;

// Базовый DTO для категории
public record CategoryDto(
        UUID id,
        String name,
        UUID parentId
) {}