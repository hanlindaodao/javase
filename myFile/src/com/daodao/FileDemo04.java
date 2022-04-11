package com.daodao;

import java.io.File;

/**
 * File类的判断和获取功能：
 *         public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
 *         public boolean isFile()：测试此抽象路径名表示的File是否为文件
 *         public boolean exists()：测试此抽象路径名表示的File是否存在
 *
 *         public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
 *         public String getPath()：将此抽象路径名转换为路径名字符串
 *         public String getName()：返回由此抽象路径名表示的文件或目录的名称
 *
 *         public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
 *         public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
 *
 */

public class FileDemo04 {
    public static void main(String[] args) {
        File f = new File("E:\\daodao");

        String[] strArray = f.list();
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("-----------");

        File[] fileArray = f.listFiles();
        for (File file : fileArray) {
//            System.out.println(file);
//            System.out.println(file.getName());
            if (file.isFile()) {    // 可以只显示文件或者目录
                System.out.println(file);
            }
        }
        System.out.println("****************");

        // 2021.12.20测试后边几个方法
        File[] fileArray2 = f.listFiles();
        for (File file : fileArray2) {
            System.out.println("getAbsolutePath(): " + file.getAbsolutePath());
            System.out.println("getPath(): " + file.getPath());
            System.out.println("getName(): " + file.getName());
            System.out.println("getAbsoluteFile(): " + file.getAbsoluteFile());

        }
    }
}
