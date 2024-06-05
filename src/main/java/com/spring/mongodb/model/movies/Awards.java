package com.spring.mongodb.model.movies;

import lombok.Data;

@Data
public class Awards {
    private Integer wins;
    private Integer nominations;
    private String text;
}
