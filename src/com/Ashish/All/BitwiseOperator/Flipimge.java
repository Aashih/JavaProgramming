package com.Ashish.All.BitwiseOperator;

public class Flipimge {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        for (int[] row:image){
            //reverse the element
            for(int i = 0 ; i < (image[0].length + 1)/2 ; i++){
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length-i-1] ^1;
                row[image[0].length-i-1] = temp;
            }
        }
        for (int i = 0 ; i < image.length ; i++){
            for (int j = 0 ; j<image[0].length ; j++){
                System.out.print(image[i][j]);
            }
            System.out.print(" ");
        }
    }
}
