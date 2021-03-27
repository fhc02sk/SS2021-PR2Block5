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
        cpA.join();
        System.out.println("Thread A ist beendet");
        cpB.join();
        System.out.println("Thread B ist beendet");
    }
}
