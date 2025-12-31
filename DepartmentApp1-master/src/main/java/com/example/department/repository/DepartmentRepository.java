package com.example.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.department.model.Department;

public interface DepartmentRepository
        extends JpaRepository<Department, Integer> {
}

