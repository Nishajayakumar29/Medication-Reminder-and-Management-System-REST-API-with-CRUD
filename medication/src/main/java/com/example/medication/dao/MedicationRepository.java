package com.example.medication.dao;
import com.example.medication.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
	


