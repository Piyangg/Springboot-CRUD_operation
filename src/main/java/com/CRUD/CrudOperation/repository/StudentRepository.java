package com.CRUD.CrudOperation.repository;

import com.CRUD.CrudOperation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
