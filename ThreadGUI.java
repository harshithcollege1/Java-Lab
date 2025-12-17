import javax.swing.*;
import java.awt.*;
public class ThreadGUI {
    public static void main(String[] args) {
        // Create GUI Frame
        JFrame frame = new JFrame("Thread Message Display");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
        // Thread 1: Prints message every 10 seconds
        Thread t1 = new Thread(() -> {
            while (true) {
                textArea.append("BMS College of Engineering\n");
                try {
                    Thread.sleep(10000); // 10 sec
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Thread 2: Prints message every 2 seconds
        Thread t2 = new Thread(() -> {
            while (true) {
                textArea.append("CSE\n");
                try {
                    Thread.sleep(2000); // 2 sec
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
