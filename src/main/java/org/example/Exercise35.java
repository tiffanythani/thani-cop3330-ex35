package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Tiffany Thani
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Exercise35
    {
        public static void main(String[] args) {
            String str;
            ArrayList<String> contestant = new ArrayList<String>();
            Scanner z = new Scanner(System.in);
            Random rand = new Random();
            do {
                System.out.print("Enter a name : ");
                str = z.nextLine();
                contestant.add(str);
            }while(!str.isEmpty());
            contestant.remove(contestant.size() - 1);
            System.out.println("The winner is " + contestant.get(rand.nextInt(contestant.size())));
        }
    }
