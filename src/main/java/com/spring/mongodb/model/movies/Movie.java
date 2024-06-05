package com.spring.mongodb.model.movies;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("movies")
public class Movie {
    private String id;
    private String plot;
    private List<String> genres;
    private Integer runtime;
    private List<String> cast;
    private Integer numMflixComments;
    private String title;
    private String fullplot;
    private String languages;
    private LocalDateTime released;
    private List<String> directors;
    private String rated;
    private Awards awards;
    private String lastupdated;
    private Integer year;
    private Imdb imdb;
    private List<String> countries;
    private String type;
    private Tomatoes tomatoes;
}
