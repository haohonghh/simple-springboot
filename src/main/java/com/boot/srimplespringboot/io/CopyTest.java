package com.boot.srimplespringboot.io;

import java.io.*;

public class CopyTest {



    public static void copy(String resourceFile,String toPath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(resourceFile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toPath));
        String line =null;
        while ((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

    public static void fileCopy(String beginFilename, String endFilename) {
        FileInputStream input = null;
        FileOutputStream output = null;
        int length =0;
        // 创建输入输出流对象
        try {
            input = new FileInputStream(beginFilename);
            output = new FileOutputStream(endFilename);

            // 获取文件长度
            try {

                // 创建缓存区域
                byte[] buffer = new byte[1024];
                // 将文件中的数据写入缓存数组
                input.read(buffer);
                // 将缓存数组中的数据输出到文件
                output.write(buffer);

            } catch (IOException e) {

                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } finally {
            if (input != null && output != null) {
                try {
                    input.close(); // 关闭流
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }



    public static void main(String[] args) throws IOException{
        fileCopy("D:\\Java\\testfile\\iotest.txt","D:\\Java\\testfile\\copy.txt");
    }
}
