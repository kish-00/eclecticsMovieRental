package com.movies.app.Controller.Repository;

import com.movies.app.Controller.model.Country;
import com.movies.app.Controller.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepo extends JpaRepository<Language,Integer> {
}
