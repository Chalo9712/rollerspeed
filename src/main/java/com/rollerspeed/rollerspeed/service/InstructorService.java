package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.model.Instructor;
import java.util.List;

public interface InstructorService {

    Instructor save(Instructor instructor);

    List<Instructor> findAll();
}
