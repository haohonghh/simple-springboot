package com.boot.srimplespringboot.io;


import com.alibaba.fastjson.JSON;

import java.io.*;

public class ObjectTest {
    /**
     * 写入对象
     */
    public static void writeObject(){
        OutputStream outputStream=null;
        BufferedOutputStream buf=null;
        ObjectOutputStream obj=null;
        DataOutputStream dos = null;
        try {
            //序列化文件輸出流
            outputStream=new FileOutputStream("D:\\Java\\testfile\\iotest.txt");
            //构建缓冲流
            buf=new BufferedOutputStream(outputStream);
            //构建字符输出的对象流
         //   obj=new ObjectOutputStream(buf);
            dos = new DataOutputStream(buf);
            //序列化数据写入
            dos.writeUTF(new Person("aaA", 121).toString());//Person对象
            //关闭流
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取对象
     */
    public static Person readObject() throws IOException {
        Person tempPerson = null;
        try {
            InputStream inputStream=new FileInputStream("D:\\Java\\testfile\\iotest.txt");
            //构建缓冲流
            BufferedInputStream buf=new BufferedInputStream(inputStream);
            //构建字符输入的对象流
          //  ObjectInputStream obj=new ObjectInputStream(buf);
            DataInputStream dis = new DataInputStream(buf);

            System.out.println("Person对象为："+dis.readUTF());
            //关闭流
            dis.close();
            buf.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  tempPerson;
    }


    public static void main(String[] args) throws IOException {
     // writeObject();
      System.out.println(JSON.toJSONString(readObject()));
    }

}

class Person  implements Serializable{
     String name;
     int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}