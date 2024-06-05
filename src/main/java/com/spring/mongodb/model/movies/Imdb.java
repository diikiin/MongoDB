package com.spring.mongodb.model.movies;

import lombok.Data;

@Data
public class Imdb {
    private Float rating;
    private Integer votes;
    private Integer id;
}
