package Grooming_AbhishekGujar.Multithreading;
//HOW TO CREATE THREAD
//By extending thread class
public class P3 extends Thread{
   public void run(){
       for (int i= 1; i<=5 ; i++){
           System.out.println(i);
       }
   }

    public static void main(String[] args) {
        P3 ref1= new P3();
        P3 ref2= new P3();

        ref1.start();
        ref2.start();
    }
}
