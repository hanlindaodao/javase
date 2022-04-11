package com.daodao01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 构造方法：
 * FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
 * FileOutputStream​(File file)：创建文件输出流以写入由指定的 File对象表示的文件
 * <p>
 * 写数据的三种方式：
 * void write​(int b)：将指定的字节写入此文件输出流
 * 一次写一个字节数据
 * <p>
 * void write​(byte[] b)：将 b.length字节从指定的字节数组写入此文件输出流
 * 一次写一个字节数组数据
 * <p>
 * void write​(byte[] b, int off, int len)：将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
 * 一次写一个字节数组的部分数据
 */

public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
//        FileOutputStream fos = new FileOutputStream(new File("myByteStream\\fos.txt"));
        // 第二个是第一个的实质，可以看源码


//        File file = new File("myByteStream\\fos.txt");
//        FileOutputStream fos = new FileOutputStream(file);
        // 上等价于：
//        FileOutputStream fos = new FileOutputStream(new File("myByteStream\\fos.txt"););

//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);

        byte[] bys = {97, 98, 99, 100, 101};
        fos.write(bys);

        //byte[] getBytes()：返回字符串对应的字节数组

        byte[] bytes = "abcdefg".getBytes();
        fos.write(bytes);

        fos.write(bys, 1, 3);

        fos.close();
    }

}
