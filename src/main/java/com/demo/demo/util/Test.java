package com.demo.demo.util;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        integerList.stream().filter(integer -> integer%2==0).forEach(System.out::println);
    }
}
