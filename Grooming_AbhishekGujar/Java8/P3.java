package Grooming_AbhishekGujar.Java8;

import java.util.ArrayList;
import java.util.List;


class Emp {
    int id;
    String name;
    double sal;
    int age;

    public Emp(int id, String name, double sal, int age) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", age=" + age +
                '}';
    }
}

public class P3 {
    public static void main(String[] args) {

        List<Emp> a= new ArrayList<>();
        a.add(new Emp(1,"abhi",12345,12));
        a.add(new Emp(2,"abhi5",32420,10));
        a.add(new Emp(4,"abhi2",264363,32));
        a.add(new Emp(3,"abhi3",6453737,45));
        a.add(new Emp(5,"abhi7",8464837,21));

        for (int i=0;i<a.size();i++){

            if(a.get(i).sal >20000){
                System.out.println(a.get(i));
            }
        }

    }
}
