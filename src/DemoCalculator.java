import java.util.Scanner;

public class DemoCalculator {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first input");
        int a = sc.nextInt();
        System.out.println("Please enter your second input");
        int b = sc.nextInt();

        System.out.println("Enter \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division");
        int output = sc.nextInt();

        switch (output){
            case 1-> System.out.println("Addition:" + (a+b));
            case 2-> System.out.println("Addition:" + (a-b));
            case 3-> System.out.println("Addition:" + (a*b));
            case 4-> System.out.println("Addition:" + (a/b));
        }




       }
       }

