// This is all about thread methods...
package multithreading;

import java.lang.Thread;

class Thread2 extends Thread {
    public Thread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Running thread of class Thread 1 " + i);
            if (i == 4) {
                Thread.currentThread();
                Thread.yield();
            }
            // try {
            // Thread.sleep(2000);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
        }

        System.out.println("Thread 1 is finished.");

        // getting id of a particular thread...
        System.out.println("The id of Thread t1 is : " + threadId());

        // getting name of a thread...
        System.out.println("The name of Thread t1 is : " + getName());

    }
}

class Thread3 extends Thread {
    public void run() {

        int i = 8;
        while (i >= 1) {
            System.out.println("Running thread of class Thread 2 " + i);
            // try {
            // Thread.sleep(1000);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }

            i--;
        }
        System.out.println("Thread 2 is finished.");

        // getting id of a particular thread...
        System.out.println("The id of Thread t2 is : " + threadId());

        // getting state of a thread...
        System.out.println("The id of Thread t2 is : " + getState());

        // getting name of a thread...
        System.out.println("The name of Thread t1 is : " + getName());
        // return Thread-0 by default.

    }
}

public class MethodOfThreadClass {
    public static void main(String[] args) throws InterruptedException {
        // Creating an object of the derived class from base class
        Thread2 t1 = new Thread2("Mercy"); // first thread with name because we create a name as call the constructor.
        Thread3 t2 = new Thread3(); // second thread

        t2.setName("Mercyji");
        // Starting a thread by calling start() method
        t1.start();
        t1.join();
        t2.start();

    }
}
