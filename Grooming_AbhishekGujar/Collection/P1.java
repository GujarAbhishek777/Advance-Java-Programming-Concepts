
//*******GENERIC COLLECTION ********

//Generic collection is a type of collection is used to store homogeneous objects..

//Syntax:::
//Collection <Datatype> var = new Collection <>();


package Grooming_AbhishekGujar.Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//
public class P1 {
    public static void main(String[] args) {
        List<String> a= new ArrayList<>();
        a.add("Thane");
        a.add("10");
        a.add("Alibaug");
        a.add("c");
        a.add("true");

        Collections.sort(a);
        System.out.println(a);

    }

}
