package Grooming_AbhishekGujar.Java8;
//*****Lambda Expression******

//1) Lambda expression is a feature of java8 .It provides a clear way to represent one method iinterface
//  using an expression iterate , filter and extract data from collection.
//2)  The lambda expression is used to provide implementation of functional interface

//3) In case of lambda expression we dont need to define again here we just write implementation code.
//4) Java lambda expression is trated as function so the compiler does not have to creste .class file.

//*****SYNTAX****

// () -> {}

//Q.]]  Wht to use lambda expression ?
//1) TO provide implementation of functional interface.
//2) Less coding

@FunctionalInterface
interface  I
{
 void baby();
}

interface  I3
{
    void sum(int a, int b);
}
public class P2 {
    public static void main(String[] args) {
       I ref =() ->{
           System.out.println("Bye Baby");
       };
       ref.baby();

       I3 ref1 = (x,y)->{
           System.out.println("The sum of numbers is :");
           System.out.println(x+y);
       };

       ref1.sum(10,20);
    }
}
