package com.movies.app.Controller.ApiControllers;

import com.movies.app.Controller.Repository.LanguageRepo;
import com.movies.app.Controller.Repository.PaymentRepo;
import com.movies.app.Controller.Repository.RentalRepo;
import com.movies.app.Controller.exception.ResourceNotFoundException;

//import com.movies.app.Controller.model.Language;
import com.movies.app.Controller.model.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/")
public class RentalController {
    @Autowired
    private RentalRepo rentalRepo;

    // get all countries
    @GetMapping(value = "/rental")
    public List<Rental> getAllLanguage(){
        return rentalRepo.findAll();

    }

    //create Employee Rest API
    @PostMapping("/rental")
    public Rental createFilm(@RequestBody Rental film){
        return rentalRepo.save(film);
    }

    //get countries by id
    @GetMapping(value = "/rental/{id}")
    public ResponseEntity<Rental> getFilmById(@PathVariable int id){
        Rental film=rentalRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Rental not exist with id:" + id));
        return ResponseEntity.ok(film);
    }

    // update country Rest API
    @PutMapping(value = "/rental/{id}")
    public ResponseEntity<Rental> updateFilms(@PathVariable int id,@RequestBody Rental filmDetails){
        Rental film=rentalRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Rental not exist with id:" + id));
        filmDetails.setRentalDate(film.getRentalDate());
        film.setReturnDate(film.getReturnDate());
//        customer.setActive(customer.getActive());
        rentalRepo.save(filmDetails);
        return ResponseEntity.ok(film);
    }

    // delete country from rest API
    @DeleteMapping(value = "/rental/{id}")
    public  ResponseEntity<HttpStatus> deleteFilms(@PathVariable int id){
        Rental film=rentalRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Rental not exist with id:" + id));
        rentalRepo.delete(film);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
