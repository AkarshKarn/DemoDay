
import java.util.*;
public class ques {
    public static void main(String[] args) {
        HashMap<Integer, Employee> h1 = new HashMap<>();
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Ravi");
        e1.setSalary(250000);



       h1.put(e1.id, e1);

        System.out.println(h1);
    }
}

 class Employee{
int id;
String name;
int salary;

     public void setId(int id) {
         this.id = id;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }

     public int getId(){
     return id;
     }

     public String getName(){
         return name;
     }

     public int getSalary(){
         return salary;
     }
 }

