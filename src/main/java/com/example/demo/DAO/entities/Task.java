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
public class Task {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;
    
    private String description;
    
    private LocalDate startDate;
    
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + ", description=" + description + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", employee=" + employee + ", project=" + project + "]";
	}

}
