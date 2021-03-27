package threading02;

public class ConsolePrinter implements Runnable {

    private String identifier;

    public ConsolePrinter(String identifier) {
        this.identifier = identifier;
    }

    public void logic() {
        for (int i = 0; i < 1_000; i++) {
            System.out.println(i + ": [identifier: " + identifier + ']');

            if (Thread.currentThread().isInterrupted()) {
                System.out.println(identifier +  ": interrupted");
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    @Override
    public void run() {
        logic();
    }
}
