package com.example.springpractice.controllers;

import com.example.springpractice.models.NationalPark;
import com.example.springpractice.repositories.ParksRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/parks")
public class NationalParksController {

    private final ParksRepository parksDao;

    public NationalParksController (ParksRepository parksDao){
        this.parksDao = parksDao;
    }


    @GetMapping("/parks")
    public String parksHome(Model model){
        List<NationalPark> parkList = parksDao.findAll();
        model.addAttribute("allParks", parkList);
        return "parks/parks";
    }

    @GetMapping("/create")
    public String createParkForm(){
        return "parks/create";
    }

    @PostMapping("/create")
    public String addAPark(@RequestParam(name = "name")String name){
        NationalPark park = new NationalPark(name);
        parksDao.save(park);
        return "redirect:/parks/parks";
}

}
