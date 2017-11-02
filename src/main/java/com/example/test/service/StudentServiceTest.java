package com.example.test.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springboot.entity.Student;
import com.example.springboot.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Student测试服务
 *
 * @author hp
 * @data 2017/11/2
 */
@Component
public class StudentServiceTest {

    @Reference(version = "1.0.0")
    private StudentService studentService;

    public void printStudnet(){
        List<Student> studentList = studentService.findAll();
        studentList.stream().forEach(student -> System.out.println(student));

    }

}
