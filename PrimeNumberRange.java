package day16;

public class PrimeNumberRange {
    public static void main(String[] args) {
        int[][] primeArray = new int[10][];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int lowerRange = i * 100;
            int upperRange = (i + 1) * 100 - 1;
            int rangeSize = upperRange - lowerRange + 1;
            int[] primes = new int[rangeSize];
            int primeCount = 0;

            for (int num = lowerRange; num <= upperRange; num++) {
                if (isPrime(num)) {
                    primes[primeCount] = num;
                    primeCount++;
                }
            }

            primeArray[i] = new int[primeCount];
            System.arraycopy(primes, 0, primeArray[i], 0, primeCount);
            count += primeCount;
        }


        for (int i = 0; i < 10; i++) {
            System.out.print("Range " + (i * 100) + "-" + ((i + 1) * 100 - 1) + ": ");
            for (int j = 0; j < primeArray[i].length; j++) {
                System.out.print(primeArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Total prime numbers: " + count);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
