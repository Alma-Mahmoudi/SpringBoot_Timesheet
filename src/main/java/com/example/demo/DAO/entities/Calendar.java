package com.example.demo.DAO.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
@Entity
public class Calendar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    
    private String dayOfWeek;

    @ManyToMany
    @JoinTable(
        name = "calendar_tasks",
        joinColumns = @JoinColumn(name = "calendar_id"),
        inverseJoinColumns = @JoinColumn(name = "task_id")
    )
    private List<Task> tasks;

	@Override
	public String toString() {
		return "Calendar [id=" + id + ", date=" + date + ", dayOfWeek=" + dayOfWeek + ", tasks=" + tasks + "]";
	}
    
    
	    
}
