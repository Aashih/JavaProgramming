package com.Ashish.All.FileHandling;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStream1 {
    public static void main(String[] args) {
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello world  ");
            osw.write("\n");
            osw.write(100);
            osw.write(10);
            osw.write("\n");
            osw.write('V');

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
