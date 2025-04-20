import java.lang.Thread;

class MyThreadClass extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class ThreadClassExample {

    public static void main(String[] args) {
        MyThreadClass t1 = new MyThreadClass();
        t1.start();
    }
}

