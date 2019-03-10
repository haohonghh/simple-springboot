package com.boot.srimplespringboot.controller;

import com.boot.srimplespringboot.dao.StudentRepository;
import com.boot.srimplespringboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping("/all")
    public List<Student> all(){

        return  studentRepository.findAll();
    }

    @RequestMapping("/findOne/{id}")
    public Student getOne(@PathVariable Long id){
        return studentRepository.getOne(id);
    }

    @RequestMapping("/saveOrUpdateStudent")
    public String saveOrUpdateStudent(Student student){
       if (student.getId()!=0){
           studentRepository.saveAndFlush(student);
           return "success";
       }else{
           studentRepository.save(student);
           return "success";
       }
    }


    @RequestMapping("/list")
    public Page<Student> test(){
        Page<Student> pageInfo = studentRepository.findAll(new PageRequest(1, 3, Sort.Direction.ASC,"id"));
    return  pageInfo;
    }


    @RequestMapping("/byNameAndPassword")
    public Student byNameAndPassword(){
        return  studentRepository.findByUserNameAndPassword("123","456");
    }


    @RequestMapping("/byNameOrPassword")
    public List<Student> byNameOrPassword(Integer age,String password){
        return  studentRepository.findAllByAgeOrPassword(age,password);
    }

}
