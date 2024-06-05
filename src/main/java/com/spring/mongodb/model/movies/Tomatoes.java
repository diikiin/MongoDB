package com.spring.mongodb.model.movies;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Tomatoes {
    private Viewer viewer;
    private LocalDateTime lastUpdated;
}
