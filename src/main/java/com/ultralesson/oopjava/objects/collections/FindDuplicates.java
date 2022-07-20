package com.ultralesson.oopjava.objects.collections;

import java.util.*;

public class FindDuplicates {
    public static void main(String args[]) {
        int[] numbers = {1,55,666,43434,11212,11323, 55,22,33,546,64342,232,5432,2444,113,333,666,4533,232};
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        //logic
        for(int i =0;i<numbers.length;++i){
            if(set.contains(numbers[i])){
                duplicates.add(numbers[i]);
            }
            else{
                set.add(numbers[i]);
            }
        }

        //print all duplicates
        for(Integer num:duplicates)
            System.out.println(num);

    }
}
