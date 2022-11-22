package com.example.springpractice.controllers;

import com.example.springpractice.repositories.ParksRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parks")
public class NationalParksController {

    private final ParksRepository parksDao;

    public NationalParksController (ParksRepository parksDao){
        this.parksDao = parksDao;
    }


    @GetMapping("/parks")
    public String parksHome(){
        return "parks/parks";
    }



    @GetMapping("/create")
    public String createPark(){
        return "parks/create";
    }



}
