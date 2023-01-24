package com.github.PFAR92.cities.api.cities;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "cities")
public class CityResourse {

    private final CityRepository cityRepository;

    public CityResourse(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping
    public Page<City> cities(final Pageable page){
        return cityRepository.findAll(page);
    }
}
