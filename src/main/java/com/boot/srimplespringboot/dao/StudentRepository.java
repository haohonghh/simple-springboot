package com.boot.srimplespringboot.dao;

import com.boot.srimplespringboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//User表示该Repository与实体User关联,主键类型为Integer
public interface StudentRepository extends JpaRepository<Student,Long> {

     Student findByUserNameAndPassword(String userName,String password);


     List<Student> findAllByAgeOrPassword(Integer age,String password);
}