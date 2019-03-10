package com.boot.srimplespringboot.io;

import java.io.*;

public class TestIO {
    public static void FileInputStreamTest() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java\\testfile\\iotest.txt");
        byte[] buf = new byte[1024];
        int hasRead = 0;
        
        //read()返回的是单个字节数据（字节数据可以直接专程int类型)，但是read(buf)返回的是读取到的字节数，真正的数据保存在buf中
        while ((hasRead = fis.read(buf)) > 0) {
            //每次最多将1024个字节转换成字符串，这里tmp2.txt中的字符小于1024，所以一次就读完了
            //循环次数 = 文件字符数 除以 buf长度
            System.out.println(new String(buf, 0 ,hasRead));
            /*
             * 将字节强制转换成字符后逐个输出，能实现和上面一样的效果。但是如果源文件是中文的话可能会乱码
             
            for (byte b : buf)    {
                char ch = (char)b;
                if (ch != '\r')
                System.out.print(ch);
            }
            */
        }
        //在finally块里close更安全
        fis.close();
    }
    
    public static void FileReaderTest() throws IOException {
        
        try (
                // 在try() 中打开的文件， JVM会自动关闭
                FileReader fr = new FileReader("tmp2.txt")) {
            char[] buf = new char[32];
            int hasRead = 0;
            // 每个char都占两个字节，每个字符或者汉字都是占2个字节，因此无论buf长度为多少，总是能读取中文字符长度的整数倍,不会乱码
            while ((hasRead = fr.read(buf)) > 0) {
                // 如果buf的长度大于文件每行的长度，就可以完整输出每行，否则会断行。
                // 循环次数 = 文件字符数 除以 buf长度
                System.out.println(new String(buf, 0, hasRead));
                // 跟上面效果一样
                // System.out.println(buf);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void FileOutputStreamTest() throws FileNotFoundException, IOException {
        try (    
                //在try()中打开文件会在结尾自动关闭
                FileInputStream fis = new FileInputStream("tmp2.txt");
                FileOutputStream fos = new FileOutputStream("tmp3.txt");
                ) {
            byte[] buf = new byte[4];
            int hasRead = 0;
            while ((hasRead = fis.read(buf)) > 0) {
                //每读取一次就写一次，读多少就写多少
                fos.write(buf, 0, hasRead);
            }
            System.out.println("write success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void FileWriterTest() throws IOException {
        try (FileWriter fw = new FileWriter("tmp4.txt")) {
            fw.write("天王盖地虎\r\n");
            fw.write("宝塔镇河妖\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mytest() throws IOException {             //需要对IO异常进行处理

        //创建一个FileWriter对象，该对象一被初始化就必须要明确被操作的文件。
        //而且该文件会被创建到指定目录下。如果该目录有同名文件，那么该文件将被覆盖。

        FileWriter fw = new FileWriter("D:\\Java\\testfile\\iotest.txt");//目的是明确数据要存放的目的地。

        //调用write的方法将字符串写到流中
        fw.write("hello 123world!");

        //刷新流对象缓冲中的数据，将数据刷到目的地中
        fw.flush();

        //关闭流资源，但是关闭之前会刷新一次内部缓冲中的数据。当我们结束输入时候，必须close();
        fw.append("55555511111111111111");
        fw.close();
        //flush和close的区别：flush刷新后可以继续输入，close刷新后不能继续输入。

    }


    private static void mytest2() throws IOException{
        FileReader fileReader = new FileReader("D:\\Java\\testfile\\iotest.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while((line=bufferedReader.readLine())!=null) {
            System.out.println(line);
        }

    }





    public static void main(String[] args) throws IOException {
        mytest2();
        //FileReaderTest();
        //FileOutputStreamTest();
       // FileWriterTest();
    }
}