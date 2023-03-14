package Grooming_AbhishekGujar.Collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Emp1{
    int id;
    String name;
    double sal;
    int age;

    public Emp1(int id, String name, double sal, int age) {
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

class AgeComparator implements Comparator<Emp1>{


    @Override
    public int compare(Emp1 o1, Emp1 o2) {
        if (o1.age > o2.age){
            return 1;
        } else if (o1.age <o2.age) {
            return 2;
        }else{
            return 0;
        }
    }
}

class SalComparator implements Comparator<Emp1>{


    @Override
    public int compare(Emp1 o1, Emp1 o2) {
        if (o1.sal > o2.sal){
            return 1;
        } else if (o1.sal <o2.sal) {
            return 2;
        }else{
            return 0;
        }
    }
}
public class P5 {
    public static void main(String[] args) {
        List<Emp1> a= new ArrayList<>();
        a.add(new Emp1(1,"abhi",12345,12));
        a.add(new Emp1(2,"abhi5",42420,10));
        a.add(new Emp1(4,"abhi2",264363,32));
        a.add(new Emp1(3,"abhi3",6453737,45));
        a.add(new Emp1(5,"abhi7",8464837,21));

        Collections.sort(a, new  AgeComparator());
        System.out.println("Sorting based on the age");
        System.out.println(a);

        Collections.sort(a,new SalComparator());
        System.out.println("Sorting based on the Salary");
        System.out.println(a);
    }
}
