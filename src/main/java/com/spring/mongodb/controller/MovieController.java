package com.spring.mongodb.controller;

import com.spring.mongodb.model.movies.Movie;
import com.spring.mongodb.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieRepository movieRepository;

    @GetMapping
    public Page<Movie> getPage(Pageable pageable) {
        return movieRepository.findAll(pageable);
    }

    @GetMapping("/all")
    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public Movie getById(@PathVariable String id) {
        return movieRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Movie create(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @PutMapping
    public Movie update(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        movieRepository.deleteById(id);
    }
}
