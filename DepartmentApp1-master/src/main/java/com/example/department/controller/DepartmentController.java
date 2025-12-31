package com.example.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.department.model.Department;
import com.example.department.repository.DepartmentRepository;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repo;

    // POST
    @PostMapping
    public Department addDepartment(@RequestBody Department d) {
        return repo.save(d);
    }

    // GET
    @GetMapping
    public List<Department> getAllDepartments() {
        return repo.findAll();
    }

    // PUT
    @PutMapping("/{id}")
    public Department updateDepartment(
            @PathVariable int id,
            @RequestBody Department d) {
        d.setId(id);
        return repo.save(d);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable int id) {
        repo.deleteById(id);
        return "Department Deleted Successfully";
    }
}

