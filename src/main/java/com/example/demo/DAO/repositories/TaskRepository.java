package com.example.demo.DAO.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository <Task, Long> {

}
