package com.boot.srimplespringboot.io.nio;

import java.nio.ByteBuffer;

public class NioTest {

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(33);
        System.out.println("---------begin nio test-------------");
        //clear方法，position将被设回0，limit被设置成capacity的值
        byteBuffer.clear();
        //设置这个缓冲区的位置
        byteBuffer.position(5);
        //将此缓冲区的标记设置在其位置、没有Buffer.mark()这句话会报错
        byteBuffer.mark();
        byteBuffer.position(10);
        System.out.println("before reset:   " + byteBuffer);
        //重置缓冲区为先前标记的位置
        byteBuffer.reset();
        System.out.println(" reset:   " + byteBuffer);
        byteBuffer.clear();
        byteBuffer.position(10);
        //返回次缓冲区的限制
        byteBuffer.limit(15);
        System.out.println(" before rewind:   " + byteBuffer);
        //把position设为0，mark设为-1，不改变limit的值
        byteBuffer.rewind();
        System.out.println("  rewind:   " + byteBuffer);

        byteBuffer.clear();
        byteBuffer.put("abbbb".getBytes());
        System.out.println(byteBuffer);
        System.out.println(new String(byteBuffer.array()));
        byteBuffer.flip();
        System.out.println(byteBuffer);
      /*  System.out.println((char)byteBuffer.get());
        System.out.println((char)byteBuffer.get());
        System.out.println((char)byteBuffer.get());
        System.out.println((char)byteBuffer.get());
        System.out.println((char)byteBuffer.get());*/
        System.out.println(new String(byteBuffer.array()));
        byteBuffer.compact();
        System.out.println(byteBuffer);
        System.out.println("---------end nio test-------------");

    }
}
