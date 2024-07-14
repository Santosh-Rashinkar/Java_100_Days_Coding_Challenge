package com.prowings.coding.challenge;
//WAJP to print even number array and size.
import java.util.Scanner;

public class Day_43 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter the size of array :-");

        int num = scan.nextInt();

        int array[] = new int[num];

        System.out.println("Enter value of array");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        // Count the number of even numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        // Create an array to store even numbers
        int[] evenArray = new int[count];
        int index = 0;

        System.out.println("Even numbers in the array:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[index++] = array[i];
            }
        }

        for (int i = 0; i < evenArray.length; i++) {
            System.out.println(evenArray[i]);
        }

        System.out.println("Count of even numbers: " + count);

        scan.close();
    }
}
