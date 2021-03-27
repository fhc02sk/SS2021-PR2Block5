package threading01;

public class ConsolePrinterDemoApp {

    public static void main(String[] args) throws InterruptedException {

        ConsolePrinter cpA = new ConsolePrinter("printer A");
        ConsolePrinter cpB = new ConsolePrinter("printer B");

        cpA.start(); // Erstellt den Thread, startet (irgendwann) die run-Methode
        cpB.start();
        System.out.println("Beide Threads erstellt!");

        /* 100 ... Sekunden Zeit */

        Thread.sleep(12_000);
        System.out.println("12 Sekunden sind vergangen");
        // Benutzer "Abbrechen"
        cpA.shouldStop();
        Thread.sleep(1_000);
        cpB.shouldStop();

        // interrupt()

        cpB.join();
        System.out.println("Thread B ist beendet");
        cpA.join(); // Wartet bis die Arbeit vom Thread (ConsolePrinter) abgeschlossen
        System.out.println("Thread A ist beendet");
    }
}
