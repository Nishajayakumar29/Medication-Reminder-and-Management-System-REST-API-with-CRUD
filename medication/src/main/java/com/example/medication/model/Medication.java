package com.example.medication.model;
import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
public class Medication {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
		private String name;
	    private String dosage;
	    private String frequency;
	    private LocalTime reminderTime;
	    
	    Medication ()
	    {
	    	super();
	    	
	    }
	    Medication (Long id,String name,String dosage,String frequency,LocalTime reminderTime)
	    {
	    	super();
	    	this.id = id;
	    	this.name = name;
	    	this.dosage = dosage;
	    	this.frequency = frequency;
	    	this.reminderTime = reminderTime;
	    	
	    }
	    public Long getId() {
			return id;
		}
		  public void setId(Long id) {
			  this.id = id;
		  }
		  public String getName() {
			  return name;
		  }
		  public void setName(String name) {
			  this.name = name;
		  }
		  public String getDosage() {
			  return dosage;
		  }
		  public void setDosage(String dosage) {
			  this.dosage = dosage;
		  }
		  public String getFrequency() {
			  return frequency;
		  }
		  public void setFrequency(String frequency) {
			  this.frequency = frequency;
		  }
		  public LocalTime getReminderTime() {
			  return reminderTime;
		  }
		  public void setReminderTime(LocalTime reminderTime) {
			  this.reminderTime = reminderTime;
		  }

}
