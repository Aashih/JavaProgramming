package com.Ashish.All.Array;

import java.util.Arrays;

public class C {
    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 7, 8, 10};
        int[] ans = new int[2];
        ans[0] = fol(arr,5);
        ans[1] = cei(arr,5);
       System.out.println(Arrays.toString(ans));
    }

    static int cei(int[] arr, int tar) {
        int cei = 0;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > tar) {
                cei = arr[mid];
                e = mid - 1;
            } else if (arr[mid] < tar) {
                s = mid + 1;
            } else {
                return arr[mid];
            }
        }

        return cei;
    }

    static int fol(int[] arr, int tar) {
        int fol = 0;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > tar) {
                e = mid - 1;
            } else if (arr[mid] < tar) {
                fol = arr[mid];
                s = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return fol;
    }
}