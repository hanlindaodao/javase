package com.daodao;

import java.io.File;
import java.io.IOException;

/**
 * File类创建功能：
 *         public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
 *             如果文件不存在，就创建文件，并返回true
 *             如果文件存在，就不创建文件，并返回false
 *
 *         public boolean mkdir()：创建由此抽象路径名命名的目录
 *             如果目录不存在，就创建目录，并返回true
 *             如果目录存在，就不创建目录，并返回false
 *
 *         public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
 *             自己补齐
 */

public class FileDemo02 {
    // D:\daodao\learn\Java\IdeaProjects\twoSemester\myFile
    public static void main(String[] args) throws IOException {
        //需求1：我要在E:\\itcast目录下创建一个文件java.txt
        File f1 = new File("D:\\daodao\\learn\\Java\\IdeaProjects\\twoSemester\\myFile\\java.txt");
        System.out.println(f1.createNewFile());

        //需求2：我要在E:\\itcast目录下创建一个目录JavaSE
        File f2 = new File("D:\\daodao\\learn\\Java\\IdeaProjects\\twoSemester\\myFile\\JavaSE");
        System.out.println(f2.mkdir());

        //需求3：我要在E:\\itcast目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("D:\\daodao\\learn\\Java\\IdeaProjects\\twoSemester\\myFile\\JavaWEB\\HTML");
//        System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs());


        //需求4：我要在E:\\itcast目录下创建一个文件javase.txt
        File f4 = new File("D:\\daodao\\learn\\Java\\IdeaProjects\\twoSemester\\myFile\\javase.txt");
        System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());

    }
}
