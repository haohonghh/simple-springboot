package com.boot.srimplespringboot.patterns.single;

public class Singleten2 {

    private static class Holder {
        private static Singleten2 singleton = new Singleten2();
    }

    private Singleten2(){}

    public static Singleten2 getSingleton(){
        return Holder.singleton;
    }
}
