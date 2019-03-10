package com.boot.srimplespringboot;

import com.boot.srimplespringboot.dao.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SrimpleSpringbootApplicationTests {

    @Autowired
    private StudentRepository dao;

    @Test
    public void contextLoads() {
        System.out.println(dao.count());
    }

}
