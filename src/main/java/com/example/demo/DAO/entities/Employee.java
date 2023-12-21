package com.example.demo.DAO.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // Génère un constructeur par défaut sans paramètres
@AllArgsConstructor // Génère un constructeur avec tous les champs de la classe
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;

	private String firstName;
	 
	private String lastName;
	 
	private String position;
	 
	private String department;
	 
	private LocalDate hireDate;
	 
	private String address;
	 
	private String email;
	 
	private String phoneNumber;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", position=" + position
				+ ", department=" + department + ", hireDate=" + hireDate + ", address=" + address + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}	    
}
