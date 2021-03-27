package threading03;

public class PrimValidation implements Runnable {

    private final long number;
    private ValidationState isPrim;
    // 0 ... nicht begonnen, 1 heißt completed & isPrim=true; 2 heißt completed&isPrime=false
    // 4 ... running

    public PrimValidation(long number) {
        this.number = number;
        isPrim = ValidationState.NotStarted;
    }


    public ValidationState isPrim() {
        return isPrim;
    }


    private void validate(){

        isPrim = ValidationState.Running;
        boolean isPrimHelper = true;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrimHelper = false;
                break;
            }
        }
        // hier sind wir uns sicher
        isPrim = isPrimHelper ? ValidationState.CompletedNumberIsPrim
                : ValidationState.CompletedNumberIsNotPrim;


        System.out.println(number + " is a prim number: " + isPrim);
    }

    @Override
    public void run() {
        validate();
    }
}
