package Ashish;

public class Main {
    public static void main(String[] args) {
       int n = 6 , m = 4096;
        System.out.println(NthRoot(n,m));
    }
    public static int NthRoot(int n, int m)
    {
        // code here
        int s = 1;
        int e = m;
        while(s<=e){
            int mid = (s+e)/2;
            int multi = product(mid,n,m);
            if(multi == 1){
                return mid;
            }
            else if(multi == 0){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }

    // return 1 if == m
    //return 0  if < m
    // return 2 if > m
    public static int product(int mid,int n,int m){
        int ans = 1;
        for(int i = 1 ; i<= n ;i++){
            ans*=mid;
        }
        if(ans > m){
            return 2;
        }
        else if(ans == m){
            return 1;
        }
        return 0;
    }
}