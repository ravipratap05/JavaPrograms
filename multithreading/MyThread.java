package multithreading;

import java.lang.Thread;

class A extends Thread {
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println("Running thread A " + i);
            i++;
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println("Running thread B " + i);
            i++;
        }
    }
}

class C extends Thread {
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println("Running thread C " + i);
            i++;
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        B b = new B();
        Thread t = new Thread(b);

        // start the threads..
        a.start();
        try {
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.start();
        t.start();
    }

}
