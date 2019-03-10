package com.boot.srimplespringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="target")  
public class Target {
    @Id 
    @GeneratedValue  
    private int tid;
    @Column(name="tname",length=20)  
    private String tname;
    
    public int getTid() {
        return tid;
    }
    public void setTid(int tid) {
        this.tid = tid;
    }
    public String getTname() {
        return tname;
    }
    public void setTname(String tname) {
        this.tname = tname;
    }
    @Override
    public String toString() {
        return "Target [tid=" + tid + ", tname=" + tname + "]";
    }
}