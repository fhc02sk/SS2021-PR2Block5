package threading01;

public class ConsolePrinter extends Thread {

    private String identifier;
    private boolean shouldRun = true;

    public ConsolePrinter(String identifier) {
        this.identifier = identifier;
    }

    public void shouldStop() {
        shouldRun = false;
    }

    public void logic() {
        for (int i = 0; i < 1_000; i++) {
            System.out.println(i + ": [identifier: " + identifier + ']');

            if (shouldRun == false) {
                System.out.println("Jemand signalisiert uns, dass beendet werden soll");
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        logic();
    }
}
