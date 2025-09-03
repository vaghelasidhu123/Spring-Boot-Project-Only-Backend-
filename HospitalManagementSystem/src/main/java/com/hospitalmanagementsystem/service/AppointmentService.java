package com.hospitalmanagementsystem.service;

import com.hospitalmanagementsystem.models.Appointment;

import com.hospitalmanagementsystem.repository.AppointmentRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class AppointmentService
{
    private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);
    @Autowired
    private AppointmentRepository appointmentRepository;

    public Page<Appointment> getAllAppointments(int page, int size) {
        try {
            System.out.println("into service layer");
            //interact with the repository layer
            Pageable pageable = PageRequest.of(page,size);
            return appointmentRepository.findAll(pageable);
        } catch (Exception e) {
            System.out.println("Error message: "+e.getMessage());
            logger.error("An error occurred while fetching all patients: {}", e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentId(Long id){
        try{
            Optional<Appointment> patient = appointmentRepository.findById(id);
            return appointment.orElse(null);
        }catch(Exception e){
            System.out.println("Error message: "+e.getMessage());
            logger.error("An error occurred while fetching patient with Id {} : {}", id, e.getMessage());
            return null;
        }
    }

    public Appointment createPatient(Appointment appointment){
        try{
            appointmentRepository.save(appointment);
            return appointment;
        }catch(Exception e){
            System.out.println("Error message: "+e.getMessage());
            logger.error("An error occurred while creating a patient: {}",e.getMessage());
            return null;
        }
    }

    public void deleteParient(Long id){
        try{
            logger.info("Deleting patient with id : {}",id);
            appointmentRepository.deleteById(id);
        }catch(Exception e){
            System.out.println("Error message: "+e.getMessage());
            logger.error("An error occurred while deleting patient with ID {}: {}", id,e.getMessage());
        }
    }

    public Appointment updateAppointment(Long id, Appointment updateAppointment){
        try{
            Optional<Appointment> existingAppointment = appointmentRepository.findById(id);
            if(existingAppointment.isPresent())
            {
                Appointment a = existingAppointment.get();
                a.setId(updateAppointment.getId());
                a.setPatientId(updateAppointment.getPatientId());
                a.setDoctorId(updateAppointment.getDoctorId());
                a.setDate(updateAppointment.getDate());
                appointmentRepository.save(a);

                return updateAppointment;
            }else{
                logger.error("Appointment with ID {} not found",id);
                return null;
            }
        }catch(Exception e){
            System.out.println("Error message: "+e.getMessage());
            logger.error("An error occurred while updating appointment with ID {}: {}", id, e.getMessage());
            return null;
        }
    }
}
