package com.smer.actas.service;

import com.smer.actas.domain.Persona;

public interface PersonaService {
    Iterable<Persona> findByIdentificadorElectronico(String identificadorElectronico);
    Iterable<Persona> findAll();

     void save(Persona persona);

     void update(Persona persona);

     void delete(Persona persona);
}
