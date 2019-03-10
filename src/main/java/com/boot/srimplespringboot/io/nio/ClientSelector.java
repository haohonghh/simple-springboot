package com.boot.srimplespringboot.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientSelector {

    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("127.0.0.1",1234));
        ByteBuffer writeBuffer = ByteBuffer.allocate(128);
        ByteBuffer readBuffer = ByteBuffer.allocate(32);
        writeBuffer.put("hello i am from client".getBytes());
        writeBuffer.flip();
        while (true){
            writeBuffer.rewind();
            socketChannel.write(writeBuffer);
            readBuffer.clear();
            socketChannel.read(readBuffer);
        }
    }
}
