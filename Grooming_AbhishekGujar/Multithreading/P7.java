package Grooming_AbhishekGujar.Multithreading;

import java.io.FileNotFoundException;

public class P7 extends Thread{
    P6 ref;
    P7(P6 ref){
        this.ref=ref;
    }

    @Override
    public void run() {
        try {
            ref.write();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
