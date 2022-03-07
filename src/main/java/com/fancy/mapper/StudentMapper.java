package com.fancy.mapper;

import com.fancy.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectStudentsByClass(String sBatch);
}
