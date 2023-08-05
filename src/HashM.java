import java.util.*;


    class milk {
        int id;
        String mfd;
        String brand;
        String quantity;
        String price;

        milk(int id, String mfd, String brand, String quantity, String price) {
            this.id = id;
            this.mfd = mfd;
            this.brand = brand;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return "milk{" +
                    "id=" + id +
                    ", mfd='" + mfd + '\'' +
                    ", brand='" + brand + '\'' +
                    ", quantity='" + quantity + '\'' +
                    ", price='" + price + '\'' +
                    '}';
        }
    }
public class HashM {

    public static void main(String[] args) {
        HashMap<Integer, milk> h1 = new HashMap<>();
        milk m1 = new milk(1, "01/08/23", "Amul", "1L", "46");
        milk m2 = new milk(2,"02/08/23", "Sudha", "500ML", "23");


        h1.put(m1.id, m1);
        h1.put(m2.id, m2);
        System.out.println(h1);

        System.out.println("Size: " +h1.size());

        int id= 1;
        milk m4 = h1.get(id);
        if (m4!=null){
            System.out.println();
        }

        }


    }
