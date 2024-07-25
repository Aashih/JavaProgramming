package com.Ashish.All.String.StringBuffer;
import java.util.Random;
public class RandomString {
    class RS {
        static String generate(int size) {
            StringBuffer Sb = new StringBuffer(size);
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                int randomChar = 97 + (int) (random.nextFloat()*26);
                Sb.append((char) randomChar);
            }
            return Sb.toString();
        }
    }
    public static void main(String[] args) {
        int n =10;
        String ans = RS.generate(n);
        System.out.println(ans);
    }
   
}
