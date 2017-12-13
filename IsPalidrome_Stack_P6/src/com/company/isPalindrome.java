package com.company;
import java.util.*;

public class isPalindrome {




    public static void main(String[] args) {

        String quit;

        do{

            Scanner in=new Scanner(System.in);
            System.out.print("Enter any string:");
            String inputString = in.nextLine();
            Stack stack = new Stack();








         for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

         String reverseString = "";



            while (!stack.isEmpty()) {
                reverseString = reverseString+stack.pop();
            }
            System.out.println(reverseString);

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

        System.out.print("Please enter continue to move forward." +
                " To end program, enter quit \n");

            quit = in.next();}while(!quit.contains("quit"));


        System.exit(0);}
        }











