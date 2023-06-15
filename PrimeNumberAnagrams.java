package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberAnagrams {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        List<Integer> anagramNumbers = new ArrayList<>();
        List<Integer> nonAnagramNumbers = new ArrayList<>();

        for (int num = 0; num <= 1000; num++) {
            if (isPrime(num)) {
                primeNumbers.add(num);

                if (isAnagram(num)) {
                    anagramNumbers.add(num);
                } else {
                    nonAnagramNumbers.add(num);
                }
            }
        }


        int[] primeArray = toArray(primeNumbers);
        int[] anagramArray = toArray(anagramNumbers);
        int[] nonAnagramArray = toArray(nonAnagramNumbers);


        System.out.println("Prime numbers that are anagrams:");
        print2DArray(splitArray(anagramArray));


        System.out.println("Prime numbers that are not anagrams:");
        print2DArray(splitArray(nonAnagramArray));
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

    public static boolean isAnagram(int num) {
        String str1 = String.valueOf(num);
        char[] charArray1 = str1.toCharArray();
        Arrays.sort(charArray1);

        for (int i = num + 1; i <= 1000; i++) {
            String str2 = String.valueOf(i);
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2)) {
                return true;
            }
        }

        return false;
    }

    public static int[] toArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static int[][] splitArray(int[] array) {
        int numRows = (int) Math.ceil((double) array.length / 10);
        int[][] result = new int[numRows][];

        int startIndex = 0;
        for (int i = 0; i < numRows; i++) {
            int endIndex = Math.min(startIndex + 10, array.length);
            result[i] = Arrays.copyOfRange(array, startIndex, endIndex);
            startIndex += 10;
        }

        return result;
    }

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
