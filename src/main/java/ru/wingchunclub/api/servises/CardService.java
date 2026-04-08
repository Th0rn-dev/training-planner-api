package ru.wingchunclub.api.servises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.wingchunclub.api.dto.CardDto;
import ru.wingchunclub.api.mappers.CardMapper;
import ru.wingchunclub.api.repositories.CardRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;

    @Autowired
    CardMapper cardMapper;

    public List<CardDto> getCards(UUID categoryId) {
        var cards = cardRepository.findByCategoryIdAndInvisibleFalse(categoryId);
        return cardMapper.toDtos(cards);
    }
}