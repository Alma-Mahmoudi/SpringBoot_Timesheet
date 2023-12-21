package com.example.demo.DAO.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
@Entity
public class ProjectProgress {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    private LocalDate date;
    
    private double completionPercentage;
    
    private String comments;

	@Override
	public String toString() {
		return "ProjectProgress [id=" + id + ", project=" + project + ", date=" + date + ", completionPercentage="
				+ completionPercentage + ", comments=" + comments + "]";
	}
    
    
}
