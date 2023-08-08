
// Write a program to add the books in a list which have 10 different books which has the following properties:
//Author Name, Book Name, Price, Genre , Publication

//Write a programme to add the books in a cart and calculate the total price of the cart.


import java.util.*;

public class Ques_08_08_Books {
    public static void main(String[] args) {
        HashMap<Integer, Book> h1 = new HashMap<>();
        Book b1 = new Book("ShivKhera", "YouCanWin", "Bloomsbury", "Motivation", 399);
        Book b2 = new Book("NapoleanHill", "ThinkAndGrowRich", "Manjul", "Motivation", 499);
        Book b3 = new Book("ChetanBhagat", "HalfGirlfriend", "Abc", "LoveStory", 299);
        Book b4 = new Book("Sam", "LetsGo", "Bloomsbury", "Motivation", 249);
        Book b5 = new Book("JNehru", "TheDiscoveryOfIndia", "PQR", "Biography", 399);
        Book b6 = new Book("Robert", "Monster", "Manjul", "Horror", 599);
        Book b7 = new Book("ShivKhera", "YesYouCanWin", "Bloomsbury", "Motivation", 399);
        Book b8 = new Book("NapoleanHill", "ThinkAndGrowRich", "Manjul", "Motivation", 499);
        Book b9 = new Book("ChetanBhagat", "HalfGirlfriend", "Abc", "LoveStory", 299);
        Book b10 = new Book("AbhilashDutt","Bhavisyat", "Samdarshi", "SciFi", 199);

        ArrayList<Book> bk = new ArrayList<>();
        bk.add(b1);
        bk.add(b2);
        bk.add(b3);
        bk.add(b4);
        bk.add(b5);
        bk.add(b6);
        bk.add(b7);
        bk.add(b8);
        bk.add(b9);
        bk.add(b10);

        System.out.println(bk);

        ArrayList<Book> cart = new ArrayList<>();
        cart.add(b1);
        cart.add(b2);
        cart.add(b3);



//        HashMap<Integer,Book> cart = new HashMap<>();
//        cart.put(01,b1);
//        cart.put(02,b2);
//        cart.put(03,b3);

        System.out.println("The following books have been added to your cart");
        System.out.println(cart);

        System.out.println("Your final cart value is");
        System.out.println(" Total Price :" + (b1.Price+b2.Price+ b3.Price));

    }
}


        class Book {
            String authorName;
            String bookName;
            String publication;
            String genre;
            int Price;

            Book(String an, String bn, String pub, String gen, int pr) {
                this.authorName = an;
                this.bookName = bn;
                this.publication = pub;
                this.genre = gen;
                this.Price = pr;

            }

            @Override
            public String toString() {
                return "Book{" +
                        "authorName='" + authorName + '\'' +
                        ", bookName='" + bookName + '\'' +
                        ", publication='" + publication + '\'' +
                        ", genre='" + genre + '\'' +
                        ", Price=" + Price +
                        '}';
            }
        }