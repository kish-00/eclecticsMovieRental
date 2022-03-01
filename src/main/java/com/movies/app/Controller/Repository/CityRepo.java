package com.movies.app.Controller.Repository;

import com.movies.app.Controller.model.City;
import com.movies.app.Controller.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<City,Integer> {
}