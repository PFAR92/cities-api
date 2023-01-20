package com.github.PFAR92.cities.api.states;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/states")
public class StateResource {

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    public List<State> states(){
        return stateRepository.findAll();
    }


}
