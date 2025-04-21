public class ThreadSleepExample {

    public static void main(String[] args) {

        // First thread
        Thread firstThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("First Thread -Count: " + i);
                    Thread.sleep(500); // sleep for 500 milliseconds
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        // Second thread
        Thread secondThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("second Thread -Count: " + i);
                    Thread.sleep(1000); // sleep for 1000 milliseconds
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        firstThread.start();
        secondThread.start();
    }
}


// 4-core CPU (Concurrently runs 8 threads)
// 8-core CPU (Concurrently runs 16 threads)
