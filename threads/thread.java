// threads - A thread is a small unit of a process that can run code independently. we use threads to run mutiple tasks like downloading files while playing music.
// there are multiple threads in one process/task
// we use threads To keep apps responsive (like a UI thread handling clicks while background threads load data).
// a thread is also the smallest unit of execution in a process/task. 
class A extends Thread {
    public void run(){
        for(int i = 1; i<=10;i++){
            System.out.println("hii");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1; i<=10;i++){
            System.out.println("hello");
        }
    }
}

public class thread {
    public static void main(String[] args) {
        
        A obj = new A();
        B obj1 = new B();

        // obj.show();
        // obj1.show();

        // start() - When you call start(), the thread moves from being just an idea (new) to ready for battle (runnable). The JVM then schedules it, and the thread’s run() method begins executing on its own path.
        obj.start();
        obj1.start();


    }
}
