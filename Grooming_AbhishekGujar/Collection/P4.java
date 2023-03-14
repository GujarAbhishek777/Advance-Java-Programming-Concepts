package Grooming_AbhishekGujar.Collection;


//WAP TO DISPLAY EMPLOYEE DETAILS IN ASCENDING ORDER BASED ON THE AGE

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emp implements Comparable{
    int id;
    String name;
    String sal;
    int age;

    public Emp(int id, String name, String sal, int age) {
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


    @Override
    public int compareTo(Object o) {
        Emp e= (Emp) o; //Downcasting
        if(this.age>e.age){
            return 1;
        } else if (this.age<e.age) {
            return -1;
        }else{
            return 0;
        }
    }
}
public class P4 {
    public static void main(String[] args) {

        List<Emp> a= new ArrayList<>();
        a.add(new Emp(1,"abhi","12345",12));
        a.add(new Emp(2,"abhi5","32420",10));
        a.add(new Emp(4,"abhi2","264363",32));
        a.add(new Emp(3,"abhi3","6453737",45));
        a.add(new Emp(5,"abhi7","8464837",21));

        Collections.sort(a);
        System.out.println(a);

    }
}
