import java.util.Scanner;














// Paramaterized :

 /*  // 1)
            class Car{
            String name;
            String model;
            String color;
            int price;

            Car(String n, String m, String c, int p){
                name = n;
                model = m;
                color = c;
                price = p;
            }

            public static void main(String[] args) {
                Car c1 = new Car("Tata", "ABC1", "White", 1100000);
                Car c2 = new Car("Maruti","ABC2", "Red",800000);
                Car c3 = new Car("Honda", "ABC3", "Black", 100000);
                Car c4 = new Car("Tesla", "ABC4", "Grey", 4000000);
                Car c5 = new Car("Volkswagon", "ABC5", "Blue", 3000000);
                System.out.println(c1);
                System.out.println();
                System.out.println(c2);
                System.out.println();
                System.out.println(c3);
                System.out.println();
                System.out.println(c4);
                System.out.println();
                System.out.println(c5);

            }


            public String toString(){
                System.out.println("List of different Car manufacturing companies:" + "\n");
                return "Name : "+name + "\nModel : "+ model+ "\nColor : " + color+ "\nPrice : "+ price;
            }


        }

  */


 /*  // 2)
     class MotorCycle {
         String name;
         String model;
         String color;
         int price;

         MotorCycle(String n, String m, String c, int p) {
             name = n;
             model = m;
             color = c;
             price = p;
         }

         public static void main(String[] args) {
             MotorCycle b1 = new MotorCycle("Hero", "ABC1", "White", 120000);
             MotorCycle b2 = new MotorCycle("Bajaj", "ABC2", "Red", 130000);
             MotorCycle b3 = new MotorCycle("Honda", "ABC3", "Black", 100000);
             MotorCycle b4 = new MotorCycle("Royal Enfield", "ABC4", "Grey", 225000);
             MotorCycle b5 = new MotorCycle("Harley Davidson", "ABC5", "Blue", 400000);
             System.out.println(b1);
             System.out.println();
             System.out.println(b2);
             System.out.println();
             System.out.println(b3);
             System.out.println();
             System.out.println(b4);
             System.out.println();
             System.out.println(b5);

         }

         public String toString() {
         System.out.println("List of different MotorCycle manufacturing companies:" + "\n");
             return "Name : " + name + "\nModel : " + model + "\nColor : " + color + "\nPrice : " + price;
         }
     }

  */

  /* // 4)
   class ElectricVehicle {
       String name;
       String model;
       String color;
       int price;

       ElectricVehicle(String n, String m, String c, int p) {
           name = n;
           model = m;
           color = c;
           price = p;
       }

       public static void main(String[] args) {
           ElectricVehicle ev1 = new ElectricVehicle("Ola", "ABC1", "White", 125000);
           ElectricVehicle ev2 = new ElectricVehicle("Ather", "ABC2", "Red", 135000);
           ElectricVehicle ev3 = new ElectricVehicle("Sahara", "ABC3", "Black", 80000);
           ElectricVehicle ev4 = new ElectricVehicle("Hero", "ABC4", "Grey", 115000);
           ElectricVehicle ev5 = new ElectricVehicle("Tata", "ABC5", "Blue", 1200000);
           System.out.println(ev1);
           System.out.println();
           System.out.println(ev2);
           System.out.println();
           System.out.println(ev3);
           System.out.println();
           System.out.println(ev4);
           System.out.println();
           System.out.println(ev5);

       }

       public String toString() {
       System.out.println("List of different ElectricVehicle manufacturing companies:" + "\n");
           return "Name : " + name + "\nModel : " + model + "\nColor : " + color + "\nPrice : " + price;
       }
   }

   */


  /*   // 4)
     class Mobile {
     String name;
     String model;
     String color;
     int price;

      Mobile(String n, String m, String c, int p) {
         name = n;
         model = m;
         color = c;
         price = p;
     }

     public static void main(String[] args) {
         Mobile m1 = new Mobile("Apple", "ABC1", "White", 180000);
         Mobile m2 = new Mobile("Samsung", "ABC2", "Red", 100000);
         Mobile m3 = new Mobile("Nokia", "ABC3", "Black", 50000);
         Mobile m4 = new Mobile("OnePlus", "ABC4", "Grey", 65000);
         Mobile m5 = new Mobile("Vivo", "ABC5", "Blue", 25000);
         System.out.println(m1);
         System.out.println();
         System.out.println(m2);
         System.out.println();
         System.out.println(m3);
         System.out.println();
         System.out.println(m4);
         System.out.println();
         System.out.println(m5);

     }

     public String toString() {
     System.out.println("List of different Mobile manufacturing companies:" + "\n");
         return "Name : " + name + "\nModel : " + model + "\nColor : " + color + "\nPrice : " + price;
     }
 }

   */

 /*  // 5)

 class Laptop {
     String name;
     String model;
     String color;
     int price;

     Laptop(String n, String m, String c, int p) {
         name = n;
         model = m;
         color = c;
         price = p;
     }

     public static void main(String[] args) {
         Laptop l1 = new Laptop("Apple", "ABC1", "White", 150000);
         Laptop l2 = new Laptop("Dell", "ABC2", "Red", 70000);
         Laptop l3 = new Laptop("HP", "ABC3", "Black", 55000);
         Laptop l4 = new Laptop("Lenovo", "ABC4", "Grey", 45000);
         Laptop l5 = new Laptop("Asus", "ABC5", "Blue", 35000);
         System.out.println(l1);
         System.out.println();
         System.out.println(l2);
         System.out.println();
         System.out.println(l3);
         System.out.println();
         System.out.println(l4);
         System.out.println();
         System.out.println(l5);

     }

     public String toString() {
     System.out.println("List of different Laptop manufacturing companies:" + "\n");
         return "Name : " + name + "\nModel : " + model + "\nColor : " + color + "\nPrice : " + price;
     }
 }

  */



import java.util.SortedMap;

public class practice {

    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.move();

    }
}
class Animal{
    String type;

    void breathe(){
        System.out.println("Animal is breathing");
    }

    void eat(){
        System.out.println("Animal is eating");
    }

    void sleep(){
        System.out.println("Animal is sleeping");
    }

    void move(){
        System.out.println("Animal is moving");
    }
}

class Dogs extends Animal{
    @Override
    void move() {
        System.out.println("Dog is moving");
        //Objects of other non parent class can only be created using inside function
        //It concludes in a has-a relationship
        Human f1 = new Human();
        f1.play();
    }

    @Override
    void breathe(){
        System.out.println("Dog is breathing");
    }

    @Override
    void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    void sleep(){
        System.out.println("Dog is sleeping");
    }


}

class Human{
    void play(){
        System.out.println("Human Playing");
    }
}