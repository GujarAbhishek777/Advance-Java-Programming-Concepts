package Grooming_AbhishekGujar.Collection;

//*****ANONYMOUS INNER CLASS ******

//1) It is used to override method only for particular class. The class that does not have any name is known as
//Anonymous Inner class

//2) FOr a anonymous inner class a single object is created.

//3) This class can be used only once.
 interface I
 {
     void test();
 }
public class P8 {
    public static void main(String[] args) {
        I ref = new I() {

            public void test()
            {
                System.out.println("I am Anonymous Class..");
            }
        };
        ref.test();
    }
}
