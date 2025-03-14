package com.example.project.Binary_Search;
public class BinarySearchRunner{
    public static void main(String[] args) {
        int[] elements = {5};
        int target = 10;
        int actualIndex = BinarySearch.binarySearch(elements, target);
        System.out.println(actualIndex);
    }
}