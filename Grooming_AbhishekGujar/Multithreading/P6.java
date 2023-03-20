package Grooming_AbhishekGujar.Multithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class P6 {
    String data= "Happy Gudi Padwa";
    public synchronized void write() throws FileNotFoundException, InterruptedException {
        String path="C:\\Users\\Vidya\\Desktop\\abhi.txt";

        FileOutputStream fs= new FileOutputStream(path);
        PrintWriter pw= new PrintWriter(fs);

        for (int i=0; i<data.length();i++){
            pw.write(data.charAt(i));
            System.out.println("writing");
            Thread.sleep(3000);
        }
        pw.flush();
    }
    public synchronized void modify(String s){
        data=s;
    }

}
