import java.util.Arrays;

public class OOPS_Demo{
    public static void main(String[] args) {
        Students1 s1 = new Students1("Arpit", 10,1234745);
        Students1 s2 = new Students1("Arpit", 10,1234745);
        Students1 s3 = new Students1("Arpit", 10,1234745);
        Students1 s4 = new Students1("Arpit", 10,1234745);
        Students1 s5 = new Students1("Arpit", 10,1234745);
        Students1 s6 = new Students1("Arpit", 10,1234745);
        Students1 s7 = new Students1("Arpit", 10,1234745);
        Students1 s8 = new Students1("Arpit", 10,1234745);
        Students1 s9 = new Students1("Arpit", 10,1234745);
        Students1 s10 = new Students1("Arpit", 10,1234745);


        Students1 [] sa1 = new Students1[6];
        sa1[0] = s1;
        sa1[1] = s2;
//        sa1[2] = s3;
//        sa1[3] = s1;
//        sa1[4] = s2;
//        sa1[5] = s3;

        Students1 [] sa2 = new Students1[4];
        sa2[0] = s4;
        sa2[1] = s5;
        sa2[2] = s6;
        sa2[3] = s7;

        University u1 = new University("Jnu",10001,sa1);
        University u2 = new University("Delhi Uni", 202222, sa2);

        System.out.println(u1);
        System.out.println(u2);

    }
}
class University1{
    String uniName;
    int regNo;
    //has a relationship
    Students1[] student;

    public University1(String uniName, int regNo, Students1[] student) {
        this.uniName = uniName;
        this.regNo = regNo;
        this.student = student;
    }

    @Override
    public String toString() {
        return "University{" +
                "uniName='" + uniName + '\'' +
                ", regNo=" + regNo +
                ", student=" + Arrays.toString(student) +
                '}';
    }
}
class Students{
    String name;
    int rollNo;
    int phnNumber;

    Students(String s, int r, int p){
        this.name = s;
        this.rollNo = r;
        this.phnNumber = p;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", phnNumber=" + phnNumber +
                '}';
    }
}