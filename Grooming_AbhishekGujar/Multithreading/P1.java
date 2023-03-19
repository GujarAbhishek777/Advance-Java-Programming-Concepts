package Grooming_AbhishekGujar.Multithreading;
//******MULTITHREADING****


//THREAD:::: Thread is a lightweight process in other words It is a smallest unit which is used to execute
// the program.

//ATTRIBUTES OF THREAD
//1)ID
//2)Name
//3) Priority

//When multiple thread are executed together it is known as multithreading..

//THREAD SHEDULER::::
//Which shedules and give priority to thread bt itself or from program..

//info:: methods access it one by one until now e.g. at a time one method has access of resources.



public class P1 {
    public static void main(String[] args) {
        Thread t= new Thread();
        System.out.println(Thread.currentThread());

        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}


//CURRENT THREAD METHOD
// It is a static method present inside thread class used for returning reference of a current thread.

//GETID METHOD
//It is a non static method present inside thread class which is used to return the id of thread.

//GETNAME METHOD
//It is non static method present inside thread class which is used to return the name of thread.

//GETPRIORITY METHOD
//It is non static method present inside thread class which is used to return priority of the thread.