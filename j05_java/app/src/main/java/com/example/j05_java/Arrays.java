package com.example.j05_java;

import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
       //set
        HashSet<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("orange");
        System.out.println(mySet);
        mySet.remove("banana");
        System.out.println(mySet);
        System.out.println(mySet.contains("apple"));
        System.out.println(mySet.size());
        mySet.clear();
        System.out.println(mySet);

        //
        HashMap<String,String > myMap = new HashMap<>();
        myMap.put("apple", "red");
        myMap.put("banana", "yellow");
        myMap.put("orange", "orange");
        System.out.println(myMap);
        System.out.println(myMap.get("apple"));
        myMap.remove("banana");
        System.out.println(myMap);
        System.out.println(myMap.containsKey("apple"));
        System.out.println(myMap.containsValue("red"));

    }
}
