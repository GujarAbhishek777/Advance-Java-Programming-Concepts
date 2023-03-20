package Grooming_AbhishekGujar.Multithreading;

public class P8 extends Thread{
    P6 ref;
    P8(P6 ref){
        this.ref=ref;
    }

    @Override
    public void run() {
        ref.modify("Diwali");
    }
}
