package com.example.demo.services;

import com.example.demo.bo.Trainer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainerServiceMock implements TrainerService {
    private final List<Trainer> listeTrainers;

    public TrainerServiceMock() {
        listeTrainers = new ArrayList<>();
        listeTrainers.add(new Trainer("Jean", "Dupont", "jdupont@email"));
        listeTrainers.add(new Trainer("Pierre", "Leon", "pLeon@email"));
    }

    @Override
    public void ajouter(String firstName, String lastName, String email) {
        Trainer nouveau = new Trainer(firstName, lastName, email);
        listeTrainers.add(nouveau);
    }

    @Override
    public List<Trainer> trouverTous() {
        return listeTrainers;
    }

}
