public class demo_20 {
    public static void main(String[] args) {


    }
}
    class Hospital {
        String firstname;
        String place;


        Hospital(String f, String l) {
            firstname = f;
            place = l;
        }

        class Patient {
            String name;
            int number;


            Patient(String n, int n1) {
                name = n;
                number = n1;
            }



            public String toString() {

                return "Name : " + firstname + "\nPlace : " + place;
            }
        }
    }







