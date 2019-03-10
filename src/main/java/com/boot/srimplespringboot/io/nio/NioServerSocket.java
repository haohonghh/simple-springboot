package com.boot.srimplespringboot.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NioServerSocket {

    public static void main(String[] args)throws IOException {
        //1.通过serverSocketChannel的open方法创建一个serverSocketChannel对象
        ServerSocketChannel ssc = ServerSocketChannel.open();
        //2.绑定端口号和ip地址
        ssc.bind(new InetSocketAddress("127.0.0.1",3333));
        //通过ServerSocketChannelImpl的accept()方法创建一个SocketChannel对象用户从客户端读/写数据
        SocketChannel socketChannel = ssc.accept();
        //3.创建写数据的缓存区对象
        ByteBuffer writeBuffer = ByteBuffer.allocate(128);
        writeBuffer.put("hello this is from server".getBytes());
        writeBuffer.flip();
        socketChannel.write(writeBuffer);
        //创建读数据的缓存区对象
        ByteBuffer readBuffer = ByteBuffer.allocate(128);
        socketChannel.read(readBuffer);
        StringBuilder stringBuilder = new StringBuilder();
        readBuffer.flip();
        while (readBuffer.hasRemaining()){
            stringBuilder.append((char)readBuffer.get());
        }
        System.out.println("从客户端收到的数据:"+stringBuilder);
        socketChannel.close();
        ssc.close();
    }
}
