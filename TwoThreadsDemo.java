class Thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000); // 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("CSE");
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class TwoThreadsDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}