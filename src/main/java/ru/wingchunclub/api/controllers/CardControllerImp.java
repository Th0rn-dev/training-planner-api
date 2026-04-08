package ru.wingchunclub.api.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.wingchunclub.api.dto.CardDto;
import ru.wingchunclub.api.servises.CardService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CardControllerImp implements CardController {

    private final CardService cardService;

    @Override
    public List<CardDto> getCard(UUID categoryId) {
        return cardService.getCards(categoryId);
    }
}