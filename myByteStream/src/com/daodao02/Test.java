package com.daodao02;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myByteStream\\fos.txt");
        int by;
        while((by = fis.read()) != -1) {
            System.out.print((char)(by));
        }
        fis.close();

        System.out.println("**********");

        FileInputStream fis_2 = new FileInputStream("myByteStream\\fos.txt");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis_2.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }


        fis_2.close();
    }
}
