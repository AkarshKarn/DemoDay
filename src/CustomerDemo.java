
import java.util.*;
public class CustomerDemo {
    public static void main(String[] args) {

        LinkedList<Rooms> rm = new LinkedList<>();
        rm.add(new Rooms(101, "Single", "Booked"));
        rm.add(new Rooms(102, "Double", "Booked"));
        rm.add(new Rooms(103, "Single", "Available"));
        rm.add(new Rooms(104, "Double", "Booked"));
        rm.add(new Rooms(105, "Single", "Available"));
        rm.add(new Rooms(106, "Double", "Booked"));
        rm.add(new Rooms(107, "Single", "Available"));
        rm.add(new Rooms(108, "Double", "Booked"));
        rm.add(new Rooms(109, "Single", "Booked"));
        rm.add(new Rooms(110, "Double", "Available"));

        rm.stream().forEach(b -> System.out.println(b));


        LinkedList<Customer> c = new LinkedList<>();
        c.add(new Customer( "Ishan", 23, "Male", "Jharkhand", "0123456789"));
        c.add(new Customer( "Nisha", 21, "Female", "Delhi", "0023456789"));
        c.add(new Customer( "Vikash", 24, "Male", "Mumbai", "0001236789"));
        c.add(new Customer( "Manish", 28, "Male", "Goa", "0123433789"));
        c.add(new Customer( "Shivani", 25, "Female", "Chennai", "0123422789"));

        c.stream().forEach(a -> System.out.println(a));








    }
}


class Customer{
  //  int room;
    String name;
    int age;
    String gender;
    String address;
    String phnumber;

    Customer(String n, int ag, String g, String ad, String ph){;
        this.name = n;
        this.age = ag;
        this.gender = g;
        this.address = ad;
        this.phnumber = ph;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phnumber='" + phnumber + '\'' +
                '}';
    }
}

class Rooms{
    int roomno;
    String type;
    String status;

    Rooms(int r, String t,String s){
        this.roomno = r;
        this.type = t;
        this.status = s;

    }

    @Override
    public String toString() {
        return "Rooms{" +
                "roomno=" + roomno +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
