package com.Ashish.All.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("out/production/First/Ashish/note.txt",true)){
            fw.write("Me Ashish");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
