package ru.learnup.learnup.spring.mvc.homework29.model;

import ru.learnup.learnup.spring.mvc.homework29.entity.Author;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class BookDto {

    final private int id;
    final private String title;
    final private String publishing_year;
    final private int pages;
    final private int price;
    final private AuthorDto author;

}
