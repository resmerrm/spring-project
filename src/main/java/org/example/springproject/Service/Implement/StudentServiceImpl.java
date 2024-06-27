package org.example.springproject.Service.Implement;

import org.example.springproject.Entities.Student;
import org.example.springproject.Repository.StudentRepository;
import org.example.springproject.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository _studentRepository;
    public StudentServiceImpl(StudentRepository _studentRepository) {
        super();
        this._studentRepository = _studentRepository;
    }
    @Override
    public List<Student> GetAllStudents() {
        return _studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return _studentRepository.save(student);
    }
}