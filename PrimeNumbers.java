package day16;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers in the range of 0 to 1000:");

        for (int number = 2; number <= 1000; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
