// Ques 1) Write a program and take 10 input from user and store it in an array, then display the array and sort the array and again display the array.

import java.util.Scanner;

public class Gambler_Problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 10;
        int ar[] = new int[a];

        System.out.println("Enter the input of the array");
        for (int i = 0; i < a; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i+1; j<ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int x = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = x;
                }
            }
        }
        System.out.println("Displaying the sorted array");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }

    }
}