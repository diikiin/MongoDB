package com.spring.mongodb.model.movies;

import lombok.Data;

@Data
public class Viewer {
    private Float rating;
    private Integer numReviews;
    private Integer meter;
}
