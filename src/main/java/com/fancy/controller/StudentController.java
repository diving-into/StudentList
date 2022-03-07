package com.fancy.controller;

import com.fancy.pojo.Student;
import com.fancy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/show.action")
    @ResponseBody
    public void show(String sbatch, HttpSession session) {
        System.out.println(sbatch);
        List<Student> students = studentService.show(sbatch);
        session.setAttribute("students", students);
    }

}
