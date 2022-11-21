package com.example.springpractice.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @GetMapping("showAll")
    public String showMovies(){
        return "movies/showAll";
    }

    @GetMapping("addMovie")
    public String addMovieForm(){
        return "movies/addMovie";
    }


}
