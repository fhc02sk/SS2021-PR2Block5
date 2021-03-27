package threading01;

public class ConsolePrinter extends Thread {

    private String identifier;

    public ConsolePrinter(String identifier) {
        this.identifier = identifier;
    }

    public void logic() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": [identifier: " + identifier + ']');

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
