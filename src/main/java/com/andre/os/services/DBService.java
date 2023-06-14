package com.andre.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.os.domain.Cliente;
import com.andre.os.domain.OS;
import com.andre.os.domain.Tecnico;
import com.andre.os.domain.enuns.Prioridades;
import com.andre.os.domain.enuns.Status;
import com.andre.os.repository.ClienteRepository;
import com.andre.os.repository.OsRepository;
import com.andre.os.repository.TecnicoRepository;

@Service
public class DBService {

    @Autowired
    private OsRepository osRepository;

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public void instaciaBD() {

        Tecnico t1 = new Tecnico(null, "André", "109.374.077-98", "(82) 98112-1510");
        Cliente c1 = new Cliente(null, "Rodrigo", "085.548.254-03", "(82) 98833-2738");
        OS os1 = new OS(null, Prioridades.ALTA, "Teste Os", Status.ANDAMENTO, t1, c1);

        t1.getList().add(os1);
        c1.getList().add(os1);

        tecnicoRepository.saveAll(Arrays.asList(t1));
        clienteRepository.saveAll(Arrays.asList(c1));
        osRepository.saveAll(Arrays.asList(os1));
    }

}
