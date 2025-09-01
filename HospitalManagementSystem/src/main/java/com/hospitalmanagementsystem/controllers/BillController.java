package com.hospitalmanagementsystem.controllers;

import com.hospitalmanagementsystem.models.Appointment;
import com.hospitalmanagementsystem.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BillController
{

    public List<Bill> getAllBills(){
        System.out.println("Fetching the appointments");
        return null;
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill){
        System.out.println("Creating bill");
        return bill;
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id){
        System.out.println("Fetching id by ID");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id){

    }

    @PutMapping("/{id}")
    public void updateAppointment(@PathVariable Long id){

    }
}


