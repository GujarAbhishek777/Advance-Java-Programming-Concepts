package Grooming_AbhishekGujar.Collection;
//write a program to find sum of all the numbers present in the collection

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P2 {

    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        a.add(54);
        a.add(10);
        a.add(30);
        a.add(21);
        a.add(2);
       int sum=0;
        Iterator  i= a.iterator();
        while(i.hasNext()){
            int b=(Integer)i.next();
            sum=sum+b;
        }
        System.out.println(sum);
    }
}
