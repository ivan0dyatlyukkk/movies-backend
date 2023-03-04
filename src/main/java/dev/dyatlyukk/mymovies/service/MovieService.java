package dev.dyatlyukk.mymovies.service;

import dev.dyatlyukk.mymovies.entity.Movie;
import dev.dyatlyukk.mymovies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
