package com.smer.actas.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.smer.actas.domain.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CosmosRepository<Persona,String> {
    Iterable<Persona> findByIdentificadorElectronico(String identificadorElectronico);
}
