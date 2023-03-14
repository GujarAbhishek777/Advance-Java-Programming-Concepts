package Grooming_AbhishekGujar.Collection;
//*********MARKER INTERFACE ********

//The Interface which does not contaim anything is known as marker interface
//Marker interface are used to access special properties for a class.

//*********Clone() METHOD **********
//It is non static method present inside object class
//The return type of this method is instance of object class..
//This method is used to create a clone (duplicate) Of an existing object.

public class P10 implements Cloneable
{
 int i=10;

    public static void main(String[] args) throws CloneNotSupportedException {
        P10 ref1= new P10();
        ref1.i=15;

        System.out.println(ref1.i);
        Object o= ref1.clone();
        System.out.println(o);
        P10 ref2= (P10) o;

        System.out.println(ref2.i);
    }

}
