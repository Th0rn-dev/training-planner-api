package ru.wingchunclub.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.wingchunclub.api.dto.CardDto;

import java.util.List;
import java.util.UUID;


public interface CardController {

    @GetMapping("/cards")
    List<CardDto> getCard(@RequestParam UUID categoryId);
}