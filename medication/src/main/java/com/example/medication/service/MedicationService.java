package com.example.medication.service;
import com.example.medication.model.*;
import com.example.medication.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class MedicationService {
	// Automatically injects the MedicationRepository (your data access interface).
	@Autowired
    private MedicationRepository repository;
// Fetches all medications from the database.
// Uses JPA’s findAll() method.
    public List<Medication> getAllMedications() {
        return repository.findAll();
    }
//Fetches a single medication by its ID., if no medication is found then retuen null
    public Medication getMedication(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Medication not found"));
    }
// Saves a new medication or updates an existing one in the database.Uses JPA’s save() method.
    public Medication saveMedication(Medication med) {
        return repository.save(med);
    }
// Deletes a medication entry from the database by ID.
    public void deleteMedication(Long id) {
        repository.deleteById(id);
    }
}



