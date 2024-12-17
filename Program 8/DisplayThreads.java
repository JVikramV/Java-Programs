 class CollegeThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted: " + e.getMessage());
        }
    }
}

class CSEThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted: " + e.getMessage());
        }
    }
}

public class DisplayThreads {
    public static void main(String[] args) {
        // Creating threads
        CollegeThread t1 = new CollegeThread();
        CSEThread t2 = new CSEThread();

        // Starting threads
        t1.start();
        t2.start();
    }
}
 
    

