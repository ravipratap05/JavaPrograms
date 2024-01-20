package multithreading;

import java.lang.Thread;

class ChlidThread1 extends Thread{
    // Thread is a subprocess of any process...
    // Thread is creating by extending the Thread class and override the run() method for perform any tasks.
    @Override
    public void run(){
        int i = 0;
        while(i <  100){
            System.out.println("This is child Thread 1.");
            i++;
        }
    }
}




public class ThreadByUsingExtendsThreadClass {
    public static void main(String[] args) {
        ChlidThread1 t1 = new ChlidThread1();
        
        t1.start();   // call run() method and starting the thread..
        
        
    }
    
    
}
