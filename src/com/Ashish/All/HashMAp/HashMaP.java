package com.Ashish.All.HashMAp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMaP {
    public static void main(String[] args) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        String word = "abcde";
        for(int i = 0 ; i < word.length() ; i++){
           map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> mapE : map.entrySet()){
            char key = mapE.getKey();
            int val = mapE.getValue();
            if(val >9){
                int diff = val - 9;
                sb.append('9');
                sb.append(key);
                sb.append(diff);
                sb.append(key);
            }
            else{
                sb.append(val);
                sb.append(key);
            }

        }
        System.out.println(map);
        System.out.println(sb);
//        map.put("Ashish", 58);
//        map.put("Deekshant", 65);
//        map.put("Navneet", 75);
//
//        System.out.println(map);
//        System.out.println(map.get("Ashish"));
//        System.out.println(map.getOrDefault("Deekshant", 90)+1);
//        System.out.println(map.containsKey("vasu"));


    }
}
