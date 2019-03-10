package com.boot.srimplespringboot.io.nio;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Scanner;

public class CharsetTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String[] charsetNames = {"US-ASCII", "ISO-8859-1", "UTF-8", "UTF-16BE",
                "UTF-16LE", "UTF-16"
        };

        for (int i = 0; i < charsetNames.length; i++) {
            doEncode(Charset.forName(charsetNames[i]), str);
        }
    }

    private static void doEncode(Charset cs, String input) {
        ByteBuffer bb = cs.encode(input);
        System.out.println("Charset: " + cs.name());
        System.out.println(" Input: " + input);
        System.out.println("Encoded: ");
        for (int i = 0; bb.hasRemaining(); i++) {
            int b = bb.get();
            int ival = ((int) b) & 0xff;
            char c = (char) ival;
            // Keep tabular alignment pretty
            if (i < 10) System.out.print(" ");
            // 打印索引序列
            System.out.print(" " + i + ": ");
            // Better formatted output is coming someday...
            if (ival < 16)
                System.out.print("0");
            // 输出该字节位值的16进制形式
            System.out.print(Integer.toHexString(ival));
            // 打印出刚才我们输入的字符，如果是空格或者标准字符集中没有包含
            //该字符输出空格，否则输出该字符
            if (Character.isWhitespace(c) || Character.isISOControl(c)) {
                System.out.println("");
            } else {
                System.out.println(" (" + c + ")");
            }
        }
        System.out.println("");
    }

}
