package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;
        int average = 0;

        System.out.println("Please enter 10 numbers: ");

        for (int i=0; i<10; i++)
        {
            numbers[i] = in.nextInt();
        }

        for( int totalNums : numbers) {
            sum = sum + totalNums;
            switch (average = sum / totalNums) {
            }
        }

        System.out.println("The sum of your 10 numbers is: " + sum);

        System.out.println("The average of your 10 numbers is: " + average);









//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter a list of numbers: ");
//
//        while (in.hasNextInt())
//        {
//            int input = in.nextInt();
//            numbers.add(input);
//        }
//
//        if (numbers.size() == 0)
//        {
//            System.out.println("No average.");
//
//        }
//
//        else if(numbers.size() == 10)
//        {
//            int total = 0;
//            for (int element : numbers)
//            {
//                total = total + element;
//            }
//            int average = total / numbers.size();
//            System.out.println("The average is: " + average);
//
//        }
    }
}
