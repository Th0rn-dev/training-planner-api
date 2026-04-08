package ru.wingchunclub.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.wingchunclub.api.entity.Card;

import java.util.List;
import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {

    /**
     * Поиск всех карточек в определённой категории
     */
    List<Card> findByCategoryId(UUID categoryId);

    /**
     * Поиск видимых карточек в определённой категории
     */
    List<Card> findByCategoryIdAndInvisibleFalse(UUID categoryId);

}