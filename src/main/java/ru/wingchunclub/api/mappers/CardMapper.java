package ru.wingchunclub.api.mappers;

import org.mapstruct.Mapper;
import ru.wingchunclub.api.dto.CardDto;
import ru.wingchunclub.api.entity.Card;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CardMapper {
    List<CardDto> toDtos(List<Card> cards);
}