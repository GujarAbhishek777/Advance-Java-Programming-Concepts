package Grooming_AbhishekGujar.Multithreading;

public class P9Driver extends Thread {
    public static void main(String[] args) throws InterruptedException {
        P6 ref = new P6();
        P7 ref1= new P7(ref);
        P8 ref2 = new P8(ref);

//        Thread.sleep(3000);

        ref1.start();
        Thread.sleep(2000);
        ref2.start();
    }
}
