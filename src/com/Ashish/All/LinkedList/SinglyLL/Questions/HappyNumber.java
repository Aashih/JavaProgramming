package com.Ashish.All.LinkedList.SinglyLL.Questions;

//https://leetcode.com/problems/happy-number/

//in this problem we use fast and slow pointer method
//and use the linkedList cycle approch
public class HappyNumber {
    public boolean happy(int n){
        int slow = n; // initailly both slow and fast point to
        int fast = n;
       do {
           slow = SqreSum(slow); // move slow by one
           fast = SqreSum(SqreSum(fast)); // nd move fast two
       }while (slow!=fast); // do this till slow == fast
       if (slow == 1){
           return true;
       }
       return false;
    }
    public int SqreSum(int n){
        int ans = 0;
        while (n>0){
            int rem = n % 10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 19;
        HappyNumber h1 = new HappyNumber();
        System.out.println(h1.happy(n));
    }
}
