package com.hospitalmanagementsystem.controllers;

import com.hospitalmanagementsystem.models.Appointment;
import com.hospitalmanagementsystem.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController
{

    public List<Doctor> getAllDoctors(){
        System.out.println("Fetching the doctors");
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor){
        System.out.println("Creating doctor");
        return doctor;
    }

    @GetMapping("/{id}")
    public Appointment getDoctorById(@PathVariable Long id){
        System.out.println("Fetching id by ID");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id){

    }

    @PutMapping("/{id}")
    public void updateDoctor(@PathVariable Long id){

    }
}
