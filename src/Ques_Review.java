import java.util.ArrayList;

//Write a program in which you declare a list and take some element of the list and it in another list.
public class Ques_Review {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(2);
        l1.add(10);

        System.out.println("Element in the first list: " +l1);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(7);
        l2.add(8);

        System.out.println("Elements added in the second list: " + "");
        System.out.println(l2);
    }
}

class phonenum{
    int num;

    phonenum(int n){
        this.num = n;
    }

    @Override
    public String toString() {
        return "phonenum{" +
                "num=" + num +
                '}';
    }
}


