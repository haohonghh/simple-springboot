package com.boot.srimplespringboot.dao;

import com.boot.srimplespringboot.entity.Target;
import org.springframework.data.repository.CrudRepository;

public interface TargetRepository extends CrudRepository<Target,Integer> {
     
}