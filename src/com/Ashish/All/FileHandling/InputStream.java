package com.Ashish.All.FileHandling;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public static void main(String[] args) throws IOException {
        try(InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter letter :");
            int letters = isr.read();
            while (isr.ready()){
                System.out.println((char)letters);
                letters = isr.read();
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
