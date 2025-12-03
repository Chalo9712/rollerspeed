package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.model.ClassSchedule;
import java.util.List;

public interface ClassScheduleService {

    ClassSchedule save(ClassSchedule classSchedule);

    List<ClassSchedule> findAll();
}
