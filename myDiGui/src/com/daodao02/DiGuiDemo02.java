package com.daodao02;

import java.io.File;

public class DiGuiDemo02 {
    public static void main(String[] args) {
        File srcFile = new File("D:\\daodao\\learn\\Java\\IdeaProjects\\twoSemester\\myFile\\itcast");

        getAllFilePath(srcFile);
    }

    public static void getAllFilePath(File srcFile) {
        File[] fileArray = srcFile.listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                if (file.isDirectory()) {
                    getAllFilePath(file);
                }else{
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
