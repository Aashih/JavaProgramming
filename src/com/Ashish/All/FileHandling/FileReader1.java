package com.Ashish.All.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) {
        File f1 = new File("out/production/First/Ashish/note.txt");
        System.out.println(f1.exists());
        try(FileReader fr = new FileReader("out/production/First/Ashish/note.txt")){
            int letter = fr.read();
            while (fr.ready()){
                System.out.print((char)letter);
                letter = fr.read();
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
