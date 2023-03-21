package com.example.demo.controller;

import com.example.demo.bo.Trainer;
import com.example.demo.services.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TrainerController {
    @Autowired
    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    public void afficherTousLesTrainers() {
        List<Trainer> liste = trainerService.trouverTous();
        System.out.println(liste);
    }
//    @Autowired
//    public void setTrainerService(TrainerService trainerService) {
//        this.trainerService = trainerService;
//    }
}