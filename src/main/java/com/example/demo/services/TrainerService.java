package com.example.demo.services;

import com.example.demo.bo.Trainer;

import java.util.List;

public interface TrainerService {

    void ajouter(String firstName, String lastName, String email);
    List<Trainer> trouverTous();
}
