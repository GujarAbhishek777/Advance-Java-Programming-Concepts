package Grooming_AbhishekGujar.Collection;
//wap to print the even number from the collection


import java.util.ArrayList;
import java.util.List;

public class P3 {
    public static void main(String[] args) {

        List<Integer> a= new ArrayList<>();
        a.add(54);
        a.add(10);
        a.add(30);
        a.add(21);
        a.add(2);

        for (int i=0;i<a.size();i++){

            if ((a.get(i) % 2 == 0)) {

                System.out.println(a.get(i));

            }
        }
    }
}
