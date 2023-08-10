
 import java.util.*;

  public class Customer_Hotel {
      public static void main(String[] args) {
        HashMap<Integer,Customer1> h1= new HashMap<>();

        Customer1 c1 =  new Customer1( "Ishan", 23, "Male", "Jharkhand", "0123456789");
        Customer1 c2 =  new Customer1( "Nisha", 21, "Female", "Delhi", "0023456789");
        Customer1 c3 =  new Customer1( "Vikash", 24, "Male", "Mumbai", "0001236789");
        Customer1 c4 =  new Customer1( "Manish", 28, "Male", "Goa", "0123433789");
        Customer1 c5 =  new Customer1( "Shivani", 25, "Female", "Chennai", "0123422789");

        ArrayList<Integer> Rooms = new ArrayList<>();
        Rooms.add(101);
        Rooms.add(102);
        Rooms.add(103);
        Rooms.add(104);
//        Rooms.add(105);
//        Rooms.add(106);
//        Rooms.add(107);
//        Rooms.add(108);
//        Rooms.add(109);
//        Rooms.add(110);
//        Rooms.add(111);
//        Rooms.add(112);
//        Rooms.add(113);
//        Rooms.add(114);
//        Rooms.add(115);

        HashMap<Integer, Customer1> Booking = new HashMap<>();
        Customer_Hotel ch = new Customer_Hotel();


        ch.putCustomer1(101,Rooms,Booking);
        System.out.println(Booking);


//        ch.putCustomer1(102, Rooms, Booking);
//
//        ch.putCustomer1(103, Rooms, Booking);
//
//        ch.putCustomer1(101, Rooms, Booking);
//          ch.putCustomer1(102, Rooms, Booking);
//
//          ch.putCustomer1(103, Rooms, Booking);

         // ch.putCustomer1(110, Rooms, Booking);




    }

        public void putCustomer1(Integer RoomNo, ArrayList r, HashMap<Integer, Customer1> Booking){
        if (r.isEmpty()){
            System.out.println("Rooms are not available");

        }
        if (r.contains(RoomNo)){
           Booking.put(101, new Customer1("Ishan", 23, "Male", "Jharkhand", "0123456789"));
            r.remove(RoomNo);

//            ch.put(102, new Customer1( "Vikash", 24, "Male", "Mumbai", "0001236789"));
//            r.remove(RoomNo);
//
//            ch.put(103, new Customer1("Sam", 25, "Male", "Satna", "153469872663"));
//            r.remove(RoomNo);
//
//            ch.put(104, new Customer1( "Shivani", 25, "Female", "Chennai", "0123422789"));
//            r.remove(RoomNo);

           // ch.put(110, new Customer1( "Nisha", 21, "Female", "Delhi", "0023456789"));
          //  r.remove(RoomNo);

        }
        else {

            System.out.println("This Room is already occupied");

        }
    }

}

   class Customer1{
    String name;
    int age;
    String gender;
    String address;
    String phnumber;

    Customer1(String n, int ag, String g, String ad, String ph){;
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
