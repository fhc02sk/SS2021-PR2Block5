package threading01;

public class ConsolePrinterDemoApp {

    public static void main(String[] args) throws InterruptedException {

        ConsolePrinter cpA = new ConsolePrinter("printer A");
        ConsolePrinter cpB = new ConsolePrinter("printer B");

//        cpA.logic();
//        cpB.logic();

        cpA.start(); // Erstellt den Thread, startet (irgendwann) die run-Methode
        cpB.start();
        System.out.println("Beide Threads erstellt!");

        /* 10 Sekunden Zeit */
        /*for (int i = 0; i < 80; i++){
            System.out.println("Hauptthread: " + i);
            Thread.sleep(100);
        }*/

        cpB.join();
        System.out.println("Thread B ist beendet");
        cpA.join(); // Wartet bis die Arbeit vom Thread (ConsolePrinter) abgeschlossen
        System.out.println("Thread A ist beendet");
    }
}
