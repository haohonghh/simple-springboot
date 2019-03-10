package com.boot.srimplespringboot.service;

import com.boot.srimplespringboot.entity.Target;

import java.util.List;

public interface TargetService {

    public void save(Target target);

    //删除
    public void deleteById(Integer id);

    //查询
    public List<Target> findAll();


}
