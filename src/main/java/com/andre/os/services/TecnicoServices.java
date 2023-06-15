package com.andre.os.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.os.domain.Tecnico;
import com.andre.os.repository.TecnicoRepository;

@Service
public class TecnicoServices {
    @Autowired
    private TecnicoRepository repository;

    public Tecnico findById(Integer id) {
        Optional<Tecnico> obj = repository.findById(id);
        return obj.orElse(null);

    }

}
