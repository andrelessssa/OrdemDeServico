package com.andre.os;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.andre.os.domain.Cliente;
import com.andre.os.domain.OS;
import com.andre.os.domain.Tecnico;
import com.andre.os.domain.enuns.Prioridades;
import com.andre.os.domain.enuns.Status;
import com.andre.os.repository.ClienteRepository;
import com.andre.os.repository.OsRepository;
import com.andre.os.repository.TecnicoRepository;

@SpringBootApplication
public class OssApplication {

	public static void main(String[] args) {
		SpringApplication.run(OssApplication.class, args);
	}

}
