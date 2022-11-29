package com.smer.actas.service;

import com.smer.actas.domain.Persona;
import com.smer.actas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("personaService")
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Iterable<Persona> findByIdentificadorElectronico(String identificadorElectronico) {
        return personaRepository.findByIdentificadorElectronico(identificadorElectronico);
    }

    public Iterable<Persona> findAll(){
        return personaRepository.findAll();
    }

    public void save(Persona persona){
        personaRepository.save(persona);
    }

    public void update(Persona persona){
        save(persona);
    }

    public void delete(Persona persona){
        personaRepository.delete(persona);
    }
}
