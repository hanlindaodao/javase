package com.daodao03;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("myByteStream\\bos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\bos.txt"));

        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());

        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myByteStream\\bos.txt"));

        // 一次读取一个字节数据
        int by;
        while((by = bis.read()) != -1) {
            System.out.print((char)by);
        }

        // 一次读取一个字节数组的数据
        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }


        bis.close();


    }
}
