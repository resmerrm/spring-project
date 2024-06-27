package org.example.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.springproject.Entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

