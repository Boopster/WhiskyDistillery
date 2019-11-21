package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/year/{year}")
    public List<Whisky> findWhiskiesByYear(@PathVariable int year) {
        return whiskyRepository.findWhiskiesByYear(year);
    }

    @GetMapping(value = "/distillery/{distillery}")
    public List<Whisky> findWhiskiesByDistillery(@PathVariable Distillery distillery) {
        return whiskyRepository.findWhiskiesByDistillery(distillery);
    }

    @GetMapping(value = "/distillery/{distillery}/{age}")
    public List<Whisky> findWhiskiesByAgeAndDistillery(@PathVariable Distillery distillery, @PathVariable int age) {
        return whiskyRepository.findWhiskiesByDistilleryAndAge(distillery, age);
    }

    @GetMapping(value = "/distilleries/{region}")
    public List<Whisky> findWhiskiesByRegion(@PathVariable String region) {
        return whiskyRepository.findWhiskiesByRegion(region.toLowerCase());
    }

}
