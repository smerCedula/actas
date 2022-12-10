package com.smer.actas;

import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import com.smer.actas.domain.Persona;
import com.smer.actas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.TimeZone;

@SpringBootApplication
@EnableCosmosRepositories(basePackageClasses = PersonaRepository.class)
public class ActasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActasApplication.class, args);
	}

	@PostConstruct
	public void init(){
		// Setting Spring Boot SetTimeZone
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}



}
