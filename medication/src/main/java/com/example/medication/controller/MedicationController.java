package com.example.medication.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.medication.model.*;
import com.example.medication.service.*;
//Marks this as a REST controller that handles HTTP requests and returns JSON responses
@RestController
@RequestMapping("/api/medications") // Base URL for all endpoints in this controller
public class MedicationController {

 // Injects the MedicationService to call business logic methods
 @Autowired
 private MedicationService service;

 // POST /api/medications
 // Creates a new medication entry (data is sent in JSON body)
 @PostMapping
 public String create(@RequestBody Medication med) {
      service.saveMedication(med);
     return "Reminder time is set successfully!";
 }
 // GET /api/medications
 // Fetches all medications from the database
 @GetMapping
 public List<Medication> getAll() {
     return service.getAllMedications();
 }

 // GET /api/medications/{id}
 // Fetches a single medication by its ID (e.g., /api/medications/1)
 @GetMapping("/{id}")
 public Medication getById(@PathVariable Long id) {
     return service.getMedication(id); // Already throws 404 if not found
 }


 // PUT /api/medications/{id}
 // Updates an existing medication (ID is in URL, new data is in JSON body)
 @PutMapping("/{id}")
 public ResponseEntity<Map<String, Object>> update(@PathVariable Long id, @RequestBody Medication med) {
     med.setId(id);
     Medication updatedMed = service.saveMedication(med);

     System.out.println("Updated Data: " + updatedMed);

     Map<String, Object> response = new HashMap<>();
     response.put("message", "Update is done successfully!");
     response.put("updatedData", updatedMed);

     return ResponseEntity.ok(response);
 }


 // DELETE /api/medications/{id}
 // Deletes a medication record by ID
 @DeleteMapping("/{id}")
 public String delete(@PathVariable Long id) {
     // Check if the item exists before deleting
     service.getMedication(id); // This will throw NOT_FOUND if it doesn't exist
     service.deleteMedication(id);
     return "Deleted successfully";
 }

}
