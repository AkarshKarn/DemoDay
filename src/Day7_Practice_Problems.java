import java.util.Scanner;

public class Day7_Practice_Problems {
    public static void main(String[] args) {

       /*  //1.1) Write a program to display any message:

        System.out.println("Hi, Welcome to my program.");

       */

       /*  //1.2) Write a Java program to display the default value of all primitive data types of Java.

        System.out.println("Following is the default value of all primitive data types of Java");
        System.out.println("\n");

        int a = 12;
        float b = 1.01f;
        double c = 32.26532;
        byte d = 2;
        short e = 25;
        long f = 25646;
        char g = 'x';

        System.out.println("The default value of int dataType variable: " + a);
        System.out.println("The default value of float dataType variable: " + b);
        System.out.println("The default value of double dataType variable: " + c);
        System.out.println("The default value of byte dataType variable: " + d);
        System.out.println("The default value of short dataType variable: " + e);
        System.out.println("The default value of long dataType variable: " + f);
        System.out.println("The default value of char dataType variable: " + g);

        */

        /* // 1.3) Write a program to check two strings are equal or not.

        String s1 = "Akarsh";
        String s2 = "Akarsh";

        if (s1 == s2){
            System.out.println("Both the strings are equal");
        }else {
            System.out.println("Both the strings are unequal");
        }

        */

        //1.7) Write a LeapYear java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide your input as year");

        int user = sc.nextInt();


            boolean leap;

            if (user >= 1582) {

                if (user % 4 == 0 && user % 100 == 0 && user % 400 == 0) {
                    leap = true;
                } else
                    leap = false;

                if (leap)
                    System.out.println(user + " is a leap year.");
                else
                    System.out.println(user + " is not a leap year.");

            } else {
                System.out.println("Invalid Option, Please enter year after 1581");
            }


        }
    }






