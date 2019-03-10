package com.boot.srimplespringboot.patterns.single;

/**
 * 简单单例模式，但把它放入多线程的环境下，会出现问题
 */
public class Singleten {

    private Singleten(){

    }

    private static Singleten singleten = null;

    public static Singleten getInstance(){
        if (singleten ==null){
            singleten = new Singleten();
            return singleten ;
        }
        return singleten;
    }

}
