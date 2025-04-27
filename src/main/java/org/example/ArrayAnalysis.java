package org.example;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ArrayAnalysis {
    public static void main(String[] args){
        int[] arr = {1,4,5,3,2,5,3,4,8,5,4,3,6,0,4,3,2,1,5,9,9,4,3,1,3,0,2,2,4,6,2,4,7,4};

        // 1. Tampilkan angka unik dan total dari keseluruhan array
        Set<Integer> uniqueNumbers = new TreeSet<>();
        int totalSum = 0;
        for (int num : arr) {
            uniqueNumbers.add(num);
            totalSum += num;
        }

        System.out.println("Angka unik (tanpa duplikasi): " + uniqueNumbers);
        System.out.println("Total dari semua angka dalam array: " + totalSum);

        // 2. Tampilkan total dari masing-masing angka
        Map<Integer, Integer> countMap = new TreeMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nTotal kemunculan masing-masing angka:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Angka " + entry.getKey() + ": " + entry.getValue() + " kali");
        }
    }
}
