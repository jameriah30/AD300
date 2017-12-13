package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static String contains(ArrayList<Integer> list, int value) //Uses the binary search algorithm to search for an element in the arrayList
    {
        int low=0;
        int high=list.size()-1;
        while (low<=high)
        {
            int mid = (high + low)/2;
            if (value==list.get(mid))
                return value+" is present in the given array(txt.file) at position "+(mid+1);
            else if(value<list.get(mid))
                high=mid-1;
            else
                low=mid+1;
        }
        return value+"is not present in the given array";
    }



    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        ArrayList<Integer> list= new ArrayList<>();

        try (Scanner input = new Scanner(new File("BS.txt"))) {

            while (input.hasNextInt()) {
                int number = input.nextInt();
                list.add(number);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //Collections class API to sort
        Collections.sort(list);


        System.out.println(list);
        System.out.println();

        System.out.print("Please enter a number to search for:");
        int value = console.nextInt();
        System.out.println(contains(list,value));







    }


}
