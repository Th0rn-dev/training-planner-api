package ru.wingchunclub.api.dto;


public record CardDto(
        String title,
        String preview_image_url,
        String video_url,
        String description
){}