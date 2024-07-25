package com.Ashish.All.TREE.BinaryT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insertion tree = new Insertion();
        tree.populate(scanner);
        System.out.println(tree.height());
        tree.display();
        tree.prettyDisplay();
    }
}
