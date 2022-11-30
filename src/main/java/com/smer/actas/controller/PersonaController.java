package com.smer.actas.controller;

import com.azure.cosmos.implementation.guava25.collect.Lists;
import com.smer.actas.domain.Persona;
import com.smer.actas.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/acta")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping()
    public ResponseEntity<?> savePerson(@RequestBody Persona person){
        try{
            personaService.save(person);
            return ResponseEntity.ok("success");
        }catch (Exception e){
            return ResponseEntity.status(500).body("fail");
        }
    }


    @DeleteMapping()
    public void deletePerson(@RequestBody Persona person){
        personaService.delete(person);
    }

    @GetMapping("/{identificadorElectronico}")
    public ResponseEntity<?> getPerson(@PathVariable String identificadorElectronico){
        List<Persona> p = new ArrayList();
        if(!ObjectUtils.isEmpty(identificadorElectronico))
            p = Lists.newArrayList(personaService.findByIdentificadorElectronico(identificadorElectronico));

        if(!ObjectUtils.isEmpty(p))
            return  ResponseEntity.ok(p.get(0));
        else
            return  ResponseEntity.notFound().build();
    }

    @GetMapping()
    public List<Persona> getPersons(){
        return Lists.newArrayList(personaService.findAll());
    }
}
