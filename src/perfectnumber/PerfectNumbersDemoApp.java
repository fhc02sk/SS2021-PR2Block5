package perfectnumber;

public class PerfectNumbersDemoApp {

    // Summe der echten Teiler einer Zahl wissen
    //  6 => 1 + 2 + 3
    // 28 => 1 + 2 + 4 + 7 + 14



    public static void main(String[] args) {

        for (int i = 1; i < 40_000_000; i++) {
            if (isPerfectNumber(i) == true){
                System.out.println(i + " is a perfect number!");
            }
            if (i % 100_000 == 0) {
                System.out.println("completed " + i);
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number == calculateSumRealDivisors(number)) {
            return true;
        }

        return false;
    }

    public static int calculateSumRealDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}