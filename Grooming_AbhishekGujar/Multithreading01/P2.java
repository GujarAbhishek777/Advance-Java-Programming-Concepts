package Grooming_AbhishekGujar.Multithreading01;

public class P2 {
    public synchronized void demo2( P1 ref) {
        System.out.println("Inside demo 2 method");

        try {
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Bye..");
        }
        ref.baby2();
    }

    public synchronized void baby1(){
        System.out.println("Hii Baby 1");
    }
}
