package com.boot.srimplespringboot.io.nio.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioPathTest {

    public static void main(String[] args) {
        Path path = Paths.get("D:\\Java\\testfile\\pathdata.txt");
        System.out.println("文件名："+path.getFileName());
        System.out.println("名称元素的数量："+path.getNameCount());
        System.out.println("父路径："+path.getParent());
        System.out.println("根路径："+path.getRoot());
        System.out.println("是否是绝对路径："+path.isAbsolute());
        System.out.println("是否以给定的路径D:\\开始："+path.startsWith("D:\\"));
        System.out.println("该路径的字符串形式："+path.toString());

    }
}
