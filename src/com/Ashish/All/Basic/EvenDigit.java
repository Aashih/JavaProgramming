package com.Ashish.All.Basic;

public class EvenDigit {
    public static void main(String[] args) {
       int[] arr = {12,345,2,6,7896};
//        System.out.println(findNumbers(arr));
        System.out.println(digits(3472));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int ans = digits(num);
        if (ans % 2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int nums){
        if (nums<0){
            nums = nums * -1;
        }
        return (int)(Math.log10(nums))+1;
    }
}
