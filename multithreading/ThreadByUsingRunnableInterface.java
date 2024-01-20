package multithreading;

import java.lang.Thread;

class NewThread implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i < 50){
            System.out.println("This thread is using runnable interface and line is " + i);
            i++;
        }
    }
}

public class ThreadByUsingRunnableInterface {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        Thread t = new Thread(nt);

        t.start();
    }
}
