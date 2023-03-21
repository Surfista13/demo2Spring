package com.example.demo;

import com.example.demo.controller.TrainerController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final TrainerController tc;
    @Autowired //non obligatoire
    public DemoApplication(TrainerController tc) {
        this.tc = tc;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        TrainerController trainerController = context.getBean(TrainerController.class);
//        trainerController.afficherTousLesTrainers();
    }

    @Override
    public void run(String... args) throws Exception {
        tc.afficherTousLesTrainers();
    }
}
