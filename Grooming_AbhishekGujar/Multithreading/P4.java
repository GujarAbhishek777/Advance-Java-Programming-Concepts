package Grooming_AbhishekGujar.Multithreading;
// start() method
//The start method of thread class is used to begin the execution of thread
//The start method internally calls run() method of Runnable interface to execute the code specified in
// the run() method in a separate thread.

//run() Method
//The run() method of a thread class has to be overridden in the subclass which will be called by
// the start method of a thread class

//CONSTRUCTORS OF A THREAD CLASS
//1) Thread()- No arguement constructor
//2) Thread(String s)
//3) Thread(Runnable r)
//4) Thread (Runnable r, String s)


public class P4 implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        P4 ref =new P4();
        Thread t1 = new Thread(ref);
        t1.start();
        Thread t2 = new Thread(ref);
        t2.start();
    }
}
