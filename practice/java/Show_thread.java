import java.lang.*;

/**public class Show_thread
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
    }
}*/

//javac Show_thread.java
//java Show_thread
//javap Show_thread
//javadoc Show_thread

import java.util.*;
public class Show_thread extends Thread {
    public void run()
    {
        // gets the name of current thread
        System.out.println(
            "Current Thread Name: "
            + Thread.currentThread().getName());
        
        // gets the ID of the current thread
        System.out.println(
            "Current Thread ID: "
            + Thread.currentThread().getId());
    }
    public static void main(String[] args)
        throws InterruptedException
    {
        Scanner s = new Scanner(System.in);
        
        // creating first thread
        Show_thread t1 = new Show_thread();
        
        // creating second thread
        Show_thread t2 = new Show_thread();
        
        // Starting the thread
        t1.start(); //start() method inisiates run() method
        t2.start();
        
        // t2 does not start execution until t1 completes
        // execution
        t1.join();
    }
}