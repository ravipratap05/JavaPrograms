// This is sample code to understanding the logic of inter-exchange communication between thread.

// A inter-exchange communication, is the exchange the message between two thread who use the shared resoureces.

package multithreading;

import java.lang.Thread;
// import java.util.Scanner;

// Creating thread by using extending Thread class.
class MyThread extends Thread {
    String name = "Ravi";

    public void run() {
        // for (int i = 0; i <= 5; i++) {
        // System.out.println("Hello " + name + ", I am " + i);
        // }
        System.out.println("I am " + getName());
        synchronized (this) {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello " + name + ", I am " + i);
                this.notify();
            }
        }
    }

}

public class InterExchangeCommunication {
    public static void main(String[] args) throws InterruptedException {
        MyThread th = new MyThread();
        th.start();
        th.setName("thread-1");

        // System.out.println("Hi there! I am main thread.");

        synchronized (th) {
            th.wait();
            System.out.println("Hi there! I am main thread and I am running after the execution of thread-1");

        }

    }

}
