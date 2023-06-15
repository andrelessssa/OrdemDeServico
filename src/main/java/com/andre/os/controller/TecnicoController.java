package com.andre.os.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import com.andre.os.domain.Tecnico;
import com.andre.os.repository.TecnicoRepository;
import com.andre.os.services.TecnicoServices;

@RestController
@RequestMapping(value = "/tecnico")
public class TecnicoController {

    @Autowired
    private TecnicoServices services;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Tecnico> findBEntity(@PathVariable Integer id) {
        Tecnico obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
