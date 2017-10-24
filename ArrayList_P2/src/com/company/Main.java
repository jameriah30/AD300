package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    static ArrayList<String> removeDuplicates(ArrayList<String> list) {

        // Store unique items in result.
        ArrayList<String> result = new ArrayList<>();

        // Record encountered Strings in HashSet.
        HashSet<String> set = new HashSet<>();

        // Loop over argument list.
        for (String item : list) {

            // If String is not in set, add it to the list and the set.
            if (!set.contains(item)) {
                result.add(item);
                set.add(item);
            }


        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<String>();

        try (Scanner input = new Scanner(new File("words.txt"))) {

            while (input.hasNext()) {
                String word = input.next();
                list.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Remove duplicates from ArrayList of Strings.
        ArrayList<String> unique = removeDuplicates(list);

        System.out.println(unique.toString());
//        for (String element : unique) {
//            System.out.println(element);
//        }
    }
}
