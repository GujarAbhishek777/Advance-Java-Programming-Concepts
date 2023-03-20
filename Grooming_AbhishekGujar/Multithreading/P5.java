package Grooming_AbhishekGujar.Multithreading;

//*********LIFECYCLE OF A THREAD ********

//There are total 5 statges:

//1) New :  This stage new thread is created.

//start() between

//2)Runnable : By calling the start() method thread goes to the runnable stage where it is ready to execute.
//3) Running stage: When the thread sheduler selects the thread for execution we say thread is under execution.
//4) Waiting stage: A thread which is under execution if interrupted by methods such as sleep() , wait(),yield(),
// join() ,etc.,
// A thread also goes to eaiting stage if the required resource is not available.
//5) Terminated stage:: onace the execution of a thread is successfully completed it goes to the dead stage
//


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class P5 {
    public void write() throws FileNotFoundException {
        String path="C:\\Users\\Vidya\\Desktop\\abhi.txt";
        String data= "Happy Gudi Padwa";
        FileOutputStream fs= new FileOutputStream(path);
        PrintWriter pw= new PrintWriter(fs);

        for (int i=0; i<data.length();i++){
            pw.write(data.charAt(i));
            System.out.println("writing");
        }
        pw.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        P5 ref = new P5();

        ref.write();
    }
}
