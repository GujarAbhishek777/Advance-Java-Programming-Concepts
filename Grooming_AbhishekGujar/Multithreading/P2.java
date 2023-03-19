package Grooming_AbhishekGujar.Multithreading;
//PROGRAM TO MODIFY NAME OF A THREAD..


public class P2 {
    public static void main(String[] args) {
        Thread t =new Thread();
        System.out.println(t.getName());
        t.setName("baby 1");

        System.out.println(t.getName());

        Thread t1 =new Thread("baby 2");
        System.out.println(t1.getName());
    }
}
