package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCount {

    public static void main(String[] args) throws FileNotFoundException {

        //Scan and reads the file
        File file = new File("agile_manifesto.txt");
        Scanner scanner=new Scanner(file);

        //implement the Treemap class to sort(in ascending order) and store the strings
        TreeMap <String, Integer> words  = new TreeMap <String, Integer> ();

        while(scanner.hasNext())
        {
            String m = scanner.nextLine();
            //Use the split method to remove punctuation characters
            String [] input = m.split("[ \n\t\r,.;:!?(){}}]");

            for(int f = 0; f < input.length; f++) {
                String key = input[f].toUpperCase();
                if(input[f].length() > 1) {
                    if(words.get(key) == null) {
                        words.put(key, 1);
                    }
                    else {

                        words.put(key, (words.get(key))+1);
                    }
                }
            }
        }

        for(String entry : words.keySet()) {
            System.out.println(entry + " : "+ words.get(entry));
        }

    }

}
