package com.boot.srimplespringboot.io.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTxt {
    public static void main(String[] args) throws IOException {
        //1.创建一个randomAccessFile(随机访问文件)对象
        RandomAccessFile raf = new RandomAccessFile("D:\\Java\\testfile\\niosdata.txt","rw");
        //2.通过RandomAccessFile对象的getChannel方法。FileChannel是抽象类
        FileChannel inChannel = raf.getChannel();
        //3.创建一个读取数据缓冲区对象
        ByteBuffer byteBuffer = ByteBuffer.allocate(48);
        //4.从管道中读取数据
        int bytesRead = inChannel.read(byteBuffer);
        //5.创建一个写的缓冲区对象
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(48);
        //6.写入数据
        byteBuffer2.put("aaa test".getBytes());
        byteBuffer2.flip();
        inChannel.write(byteBuffer2);

        while (bytesRead!=-1){
            System.out.println("read" + bytesRead);

            //Buffer有两种模式，写模式和读模式。在写模式下调用flip()之后，Buffer从写模式变成读模式。
            byteBuffer.flip();

            while (byteBuffer.hasRemaining()){
                System.out.print((char)byteBuffer.get());
            }
            byteBuffer.clear();
            bytesRead =inChannel.read(byteBuffer);

        }
        raf.close();
    }
}
