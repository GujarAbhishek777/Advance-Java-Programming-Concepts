package Grooming_AbhishekGujar.Multithreading01;

public class P1 {
    public synchronized void demo1(P2 ref){
        System.out.println("Inside demo1 method");
        try {
            Thread.sleep(2000);
            wait(3000);  //Inter Thread Communication...
        }catch (Exception e){
            System.out.println("Hii");
        }
        ref.baby1();
    }

    public synchronized void baby2(){
        System.out.println("Hi Baby2");
    }
}
