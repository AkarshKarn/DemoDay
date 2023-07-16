import java.util.Scanner;

public class DemoDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Please input your age");
        age = sc.nextInt();

        if (age >= 18 && age<=60){
            System.out.println("You are eligible");
        }else {
            System.out.println("You are not eligible");
        }

        int n=10;


    }
}


