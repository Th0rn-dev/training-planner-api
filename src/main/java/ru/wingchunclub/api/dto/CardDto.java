package ru.wingchunclub.api.dto;


import java.util.UUID;

public record CardDto(
        UUID id,
        String title,
        String preview_image_url,
        String video_url,
        String description,
        boolean invisible){}