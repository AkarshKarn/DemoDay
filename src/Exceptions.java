public class Exceptions {
    public static void main(String[] args) throws ArithmeticException {
        int a = 10;
        int b = 0;
        int c = a/b;

        try {
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        }



    }


}
