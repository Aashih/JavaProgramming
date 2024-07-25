package com.Ashish.All.BitwiseOperator;

import java.awt.*;
import java.math.BigInteger;

public class covertBinaryToDecimal {
    public static void main(String[] args) {
        long sum;
        String bin = "1111110011101010110011100100101110010100101110111010111110110010";
        sum = 0;
        for (int i = 0; i < bin.length(); i++) {
            char a = bin.charAt(i);
            if (a == '1') {
                sum |= 0x01;
            }
            sum <<= 1;
        }
        sum >>= 1;
        System.out.println(sum);
    }
}
