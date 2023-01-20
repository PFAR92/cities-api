package com.github.PFAR92.cities.api.countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/countries")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public Page<Country> countries(Pageable page){
        return countryRepository.findAll(page);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Country> getOne(@PathVariable Long id){
        Optional<Country> optional = countryRepository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
