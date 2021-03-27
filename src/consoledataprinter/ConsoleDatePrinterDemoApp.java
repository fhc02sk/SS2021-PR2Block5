package consoledataprinter;

import java.util.Scanner;

public class ConsoleDatePrinterDemoApp {
    public static void main(String[] args) {

        Thread thread = new Thread(new BackgroundWorker());
        thread.start();

        System.out.println("Press ENTER to stop . . .");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // warten bis jemand ENTER

        thread.interrupt();
        System.out.println("Thread interrupted");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread beendet");
    }
}
