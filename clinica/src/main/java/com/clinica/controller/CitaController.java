package com.clinica.controller;
import com.clinica.repository.citaRepository;
import com.clinica.models.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
public class CitaController {
    @Autowired //Instanciar el repositorio dentro de la clase
    private citaRepository CitaRepository;

    @GetMapping(value="/") //la barra indica que al abrir la aplicacion será lo primero que verás
    public String holamundo() {
        return "Hola";
    }
    //Ver las citas
    @GetMapping(value = "/citas")
    public List<Cita> getCitas(){
        return CitaRepository.findAll();
    }
    //crear cita
    @PostMapping(value = "/savedCita")
    public String saveCita(@RequestBody Cita cita){
        CitaRepository.save(cita);
        return "Saved cita";
    }
    @PutMapping(value = "/updateCita/{id}")
    public String updateCita(@PathVariable long id,@RequestBody Cita cita){
        Cita updatedCita=CitaRepository.findById(id).get();

        updatedCita.setDoctor(cita.getDoctor());
        updatedCita.setPatient(cita.getPatient());
        updatedCita.setCitaDateTime(cita.getCitaDateTime());
        CitaRepository.save(updatedCita);
        return "Updated Cita";
    }
    @DeleteMapping(value = "/deleteCita/{id}")
    public String deleteCita(@PathVariable long id){
        Cita deletedCita=CitaRepository.findById(id).get();
        CitaRepository.delete(deletedCita);
        return "Delete Task";
    }

}
