package com.example;

import com.example.logic.BubbleSort;
import com.example.logic.JavaSort;
import com.example.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sort<String> sort = new JavaSort<>();
        System.out.println("[result]"+sort.sort(Arrays.asList(args)));

    }
}
