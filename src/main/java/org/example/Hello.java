package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Hello
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in); //create scanner variable

        Person myPerson = new Person(); //create

        System.out.print("What is your name?");
        String theName = input.next();
        myPerson.setName(theName);

        System.out.printf("%s%s%s", "Hello, ", myPerson.getName(), ", nice to meet you!");
    }
}
