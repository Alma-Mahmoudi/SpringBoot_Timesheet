package com.example.demo.DAO.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@Entity
public class Project {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;
    
    private String description;
    
    private LocalDate startDate;
    
    private LocalDate endDate;

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", description=" + description + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}
    
}
