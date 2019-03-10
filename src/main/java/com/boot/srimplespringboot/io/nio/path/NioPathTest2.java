package com.boot.srimplespringboot.io.nio.path;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class NioPathTest2 {

    public static void main(String[] args) throws IOException {
       /* //.表示当前目录
        Path currentDir = Paths.get(".");
        System.out.println(currentDir.toAbsolutePath());
        Path currentDir2 = Paths.get(".\\a.txt");
        System.out.println("原始路径格式："+currentDir2.toAbsolutePath());
        System.out.println("折行normalize方法后："+currentDir2.toAbsolutePath().normalize());
        System.out.println("折行toRealPath方法后:"+currentDir2.toRealPath());*/

    //   Path p = Paths.get("D:\\Java\\testfile\\pathdata.txt");
      /* if (!Files.exists(p,new LinkOption[]{LinkOption.NOFOLLOW_LINKS})){
            Files.createFile(p);
       }*/

     /* System.out.println(Files.getLastModifiedTime(p));
      System.out.println(Files.size(p));
      System.out.println(Files.isSymbolicLink(p));
      System.out.println(Files.isDirectory(p));
      System.out.println(Files.readAttributes(p,"*"));*/
      //遍历一个文件夹
        Path dir = Paths.get("D:\\Java");
        DirectoryStream<Path> paths = Files.newDirectoryStream(dir);
            for (Path e:paths){
                System.out.println(e.getFileName());
            }

    }
}
