class MyThreadRunnable implements Runnable{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Runnable Thread: "+ i);
        }
    }
}

public class ThreadRunnableExample {
    public static void main(String[] args) {
        Runnable runnble = new MyThreadClass();
        Thread t1 = new Thread(runnble);
        t1.start(); 
    }
    
}



//Sleep
//Thread priority