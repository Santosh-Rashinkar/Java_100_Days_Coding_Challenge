package com.prowings;

import java.util.Arrays;
import java.util.List;

public class OddNumber {
    public static void main(String[] args) {

        Integer[] numbres = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        CheckAndPrintOddNumber(numbres);
    }
    public static void CheckAndPrintOddNumber(Integer[] numbers){

        System.out.println("odd number in the list");

        for(Integer number : numbers){
            if(number % 2 !=0){
                System.out.println(number);
            }
        }
    }
}
