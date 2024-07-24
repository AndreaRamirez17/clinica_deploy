package com.clinica.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //cada tarea va a tener una identificacion distinta y empeiza en 1 y se incrementa
    private long id;
    @Column
    private String patient;
    @Column
    private String doctor;
    @Column
    private String citaDateTime;

    //GETTERS & SETTERS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getCitaDateTime() {
        return citaDateTime;
    }

    public void setCitaDateTime(String citaDateTime) {
        this.citaDateTime = citaDateTime;
    }
}
