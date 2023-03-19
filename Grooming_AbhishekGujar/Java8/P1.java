package Grooming_AbhishekGujar.Java8;


//1)From Java8 interface are allowed to have a concrete method known as default method.

//2_ The most impoertant use of default method in interface is to provide additional functionality to a given
//type without breaking the implemneting classes.

//3) Before java8 a new method was introduced in an inteface then all the implementing classes use to break.
//we would need to provide implementation of that method in all the implementing classes.


interface  I1
{

    default void test()
    {
        System.out.println("I am I2");
    }
}

interface  I2
{
    default void test() {
        System.out.println("I am I2");
    }
}

class c implements  I1,I2
{
    public void test(){
        System.out.println("I am Class c");
    }
}
public class P1 {
    public static void main(String[] args) {
        I2 ref1= new c();
        ref1.test();
    }
}
