package Grooming_AbhishekGujar.Java8;


//WAP TO PRINT DETAILS OF THE EMPLOYEES WHO HAS ID AS EVEN NUMBER..

//WAP TO FIND SUM OF SALARIES OF ALL THE EMPLOYEES

//WAP TO FIND SUM OF SALARIES OF ALL THE EMPLOYEES WHOSE STARTING CHARACTER NA

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp2 {
    int id;
    String name;
    double sal;
    int age;

    public Emp2(int id, String name, double sal, int age) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", age=" + age +
                '}';
    }
}

public class P5 {
    public static void main(String[] args) {

        List<Emp2> a = new ArrayList<>();
        a.add(new Emp2(1, "naman", 10, 12));
        a.add(new Emp2(2, "nagesh", 20, 10));
        a.add(new Emp2(4, "abhi2", 264363, 32));
        a.add(new Emp2(3, "abhi3", 6453737, 45));
        a.add(new Emp2(5, "abhi7", 8464837, 21));

//  ANSWER OF FIRST PROGRAM
//        List<Emp2> res = a.stream().filter(e-> e.id%2==0).collect(Collectors.toList());
//
//        System.out.println(res);


//        ANSWER OF SECOND PROGRAM
//        double sum = 0;
//        for (int i = 0; i < a.size(); i++) {
//            sum = sum + a.get(i).sal;
//        }
//
//        System.out.println(sum);

        //ANOTHER APPROACH
//          double res =a.stream().collect(Collectors.summingDouble(e->e.sal));
//        System.out.println(res);


//        ANSWER OF THIRD PROGRAM
        double res =a.stream().filter(e->e.name.startsWith("na")).collect(Collectors.summingDouble(e->e.sal));
        System.out.println(res);

}
}

