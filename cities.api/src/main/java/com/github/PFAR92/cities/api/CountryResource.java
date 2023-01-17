package com.github.PFAR92.cities.api;

import com.github.PFAR92.cities.api.countries.Country;
import com.github.PFAR92.cities.api.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/countries")
public class CountryResource {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping
    public Page<Country> countries(Pageable page){
        return countryRepository.findAll(page);
    }
}
