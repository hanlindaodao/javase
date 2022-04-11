package com.daodao;

import java.io.File;
import java.io.IOException;

/**
 * File类删除功能：
 *         public boolean delete()：删除由此抽象路径名表示的文件或目录
 */

public class FileDemo03 {
    // D:\daodao\learn\Java\IdeaProjects\twoSemester\myFile
    public static void main(String[] args) throws IOException {
//        File f1 = new File("D:\\daodao\\learn\\Java\\IdeaProjects\\twoSemester\\myFile\\java.txt");
        // 默认在项目里创建，也就是模块的同级目录
//        File f1 = new File("java.txt");
        File f1 = new File("myFile\\mokuaili.txt");

        System.out.println(f1.createNewFile());

        // 删除
        System.out.println(f1.delete());

        // 如果删除目录的时候目录下有内容，是不可以直接删除的，需要先删除目录下的内容
    }
}
