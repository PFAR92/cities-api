package com.github.PFAR92.cities.api.repository;

import com.github.PFAR92.cities.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}