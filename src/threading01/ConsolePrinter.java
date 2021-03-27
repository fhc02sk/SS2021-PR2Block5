package threading01;

public class ConsolePrinter {

    private String identifier;

    public ConsolePrinter(String identifier) {
        this.identifier = identifier;
    }

    public void logic() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "[identifier: " + identifier + ']');
        }
    }
}
