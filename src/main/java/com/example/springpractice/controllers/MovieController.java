package com.example.springpractice.controllers;


import com.example.springpractice.models.Movie;
import com.example.springpractice.repositories.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieDao;

    public MovieController (MovieRepository movieDao){
        this.movieDao = movieDao;
    }




    @GetMapping("showAll")
    public String showMovies(Model model){
        List<Movie> movieList = movieDao.findAll();
        model.addAttribute("allMovies", movieList);
        return "movies/showAll";
    }

    @GetMapping("addMovie")
    public String addMovieForm(){
        return "movies/addMovie";
    }

    @PostMapping("addMovie")
    public String addMovie(@RequestParam(name = "title")String title,@RequestParam(name = "genre")String genre){

        Movie movie = new Movie(title, genre);

        movieDao.save(movie);

        return "redirect:/movies/showAll";
    }


}
