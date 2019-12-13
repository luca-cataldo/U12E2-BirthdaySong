/*
Name: BirthdaySong
Purpose: Print my first name using methods.
Author: Luca Cataldo
Date: Dec 13, 2019
*/

import java.io.*;

public class BirthdaySong
{
    public static void main (String[] args) throws IOException
    {
	printBirthdaySong ("Jimmy");
	printBirthdaySong ("Marco");
	printBirthdaySong ("Mike");
    }


    public static void printBirthdaySong (String name)
    {
	System.out.println ("Happy Birthday to you!");
	System.out.println ("Happy Birthday to you!");
	System.out.println ("Happy Birthday dear " + name + "!");
	System.out.println ("Happy Birthday to you!");
	System.out.println (" ");
    }
}
