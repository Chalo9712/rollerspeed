package com.rollerspeed.rollerspeed.service.impl;

import com.rollerspeed.rollerspeed.model.Student;
import com.rollerspeed.rollerspeed.repository.StudentRepository;
import com.rollerspeed.rollerspeed.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Student save(Student student) {
        return repo.save(student);
    }

    @Override
    public List<Student> findAll() {
        return repo.findAll();
    }

    @Override
    public Student findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
