package com.fancy.service;

import com.fancy.mapper.StudentMapper;
import com.fancy.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> show(String sbatch) {

        List<Student> students = studentMapper.selectStudentsByClass(sbatch);
        return students;
    }
}
