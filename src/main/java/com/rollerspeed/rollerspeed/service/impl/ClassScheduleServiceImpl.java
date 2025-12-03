package com.rollerspeed.rollerspeed.service.impl;

import com.rollerspeed.rollerspeed.model.ClassSchedule;
import com.rollerspeed.rollerspeed.repository.ClassScheduleRepository;
import com.rollerspeed.rollerspeed.service.ClassScheduleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassScheduleServiceImpl implements ClassScheduleService {

    private final ClassScheduleRepository repository;

    public ClassScheduleServiceImpl(ClassScheduleRepository repository) {
        this.repository = repository;
    }

    @Override
    public ClassSchedule save(ClassSchedule classSchedule) {
        return repository.save(classSchedule);
    }

    @Override
    public List<ClassSchedule> findAll() {
        return repository.findAll();
    }
}
