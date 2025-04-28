class FirstThread extends Thread{
    public void run(){
        System.out.println(
            getName() + "(Priority: " + getPriority()+ ") is running"
        );
    }
}
class SecondThread extends Thread{
    public void run(){
        System.out.println(
            getName() + "(Priority: " + getPriority()+ ") is running"
        );
    }
}

public class ThreadPrioritiesExample {
    public static void main(String[] args) {

        // Create instances of threads
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();

        // Set Priority
        firstThread.setPriority(Thread.MIN_PRIORITY); // Minimum Priority = 1
        secondThread.setPriority(Thread.MAX_PRIORITY); // Maximum Priority = 10

        // Set the names first thread
        firstThread.setName("First Thread");
        secondThread.setName("Second Thread");

        // Start threads
        firstThread.start();
        secondThread.start();

        try{
            //wait for threads to finish
            firstThread.join();
            secondThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All threads execution completed");
    }
}


