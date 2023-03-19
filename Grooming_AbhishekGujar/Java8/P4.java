package Grooming_AbhishekGujar.Java8;
//****stream API********

//1) Stream API is used to process the collections of object
//2) Stream is a sequence of object where various method can be arranged together to produce the desired result.


//3) Advantage of stream
///::::::
//  1) stream is not a data structure it takes the input from the collection.
//   2) stream does not change original data structure.
//    3) They only provide result as per the arranged methods


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp1 {
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

public class P4 {
    public static void main(String[] args) {

        List<Emp1> a= new ArrayList<>();
        a.add(new Emp1(1,"abhi",12345,12));
        a.add(new Emp1(2,"abhi5",32420,10));
        a.add(new Emp1(4,"abhi2",264363,32));
        a.add(new Emp1(3,"abhi3",6453737,45));
        a.add(new Emp1(5,"abhi7",8464837,21));


        List<Emp1> res = a.stream().filter(e-> e.sal<200000).collect(Collectors.toList());

        System.out.println(res);

    }
}


