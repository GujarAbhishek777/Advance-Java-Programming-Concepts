package Grooming_AbhishekGujar.Multithreading01;
//****Inter Thread Communication*****

//1)In java one thread can communicate with another thread with the help of object class methods such as
//wait() method with no formal arguenment., wait(long) FA, wait(long,int) FA , notif(), notifyAll() method.
//2) The main purpose of inter thread communication is to avoid dead lock.
//

//NOTE::::This methods can be used in synchronised block otherwise we will get a compile time error.

//******wait()****No formal Arguement
//1)if wait() method is called the thread which is currently having the lock will release the lock and move to the
//wait stage for infinite time.
//2) The thread becomes Runnable when notify using notify() method.

//***wait(Long)** Formal Arguement
//1) This wait() method accepts long arguement which behaves like milliseconds
//2) The thread which went to wait stage when the method was called will come back to runnable stage
//afetr the specified milliseconds of time.

//****notify()method***
//1) this method will notify the thread which went to wait stage.
//2) If there are more than one thread waiting on the same object then any one of the thread will be notify.

//****notifyAll() Method****
//1) It will notify and wake up all the threads that are waiting in the wait stage

public class P3_Driver extends Thread {
    P1 ref1= new P1();
    P2 ref2= new P2();
    @Override
    public void run(){
        ref1.demo1(ref2);
    }

    public void test(){
        this.start();
        ref2.demo2(ref1);
    }

    public static void main(String[] args) {
        P3_Driver d=new P3_Driver();
        d.test();
    }
}
