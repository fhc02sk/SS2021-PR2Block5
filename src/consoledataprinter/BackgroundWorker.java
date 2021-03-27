package consoledataprinter;

import java.util.Date;

public class BackgroundWorker implements Runnable {

    @Override
    public void run() {
        System.out.println("BackgroundWorker started...");
        while (!Thread.currentThread().isInterrupted()){
            Date d = new Date();
            System.out.println(d.toString());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("BackgroundWorker stopped...");
    }
}
