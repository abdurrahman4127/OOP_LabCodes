package Lab2;

class student {
    //properties of class
    double bangla;
    double english;
    double math;

    //methode of class
    double getSum() {
        double sum = bangla + math + english;
        return (sum);
    }

    //methode of class
    double average() {
        double sum = getSum();
        double ave = sum / 3;
        return ave;
    }
}


public class labClassTwo {
    public static void main(String []args)
    {
        student s1 = new student(); // seat = student s1; actual Lab2.student = new student();
        s1.bangla = 70;             // s1 is a reference of Lab2.student
        s1.english = 80;            // new student(); is an object od Lab2.student
        s1.math = 58;               // i.e. assigning an object to a reference

        System.out.println("total marks of s1 is : " + s1.getSum());
        System.out.println("average marks of s1 is : " + s1.average());
    }
}



