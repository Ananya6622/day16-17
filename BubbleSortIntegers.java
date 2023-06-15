package day16;

import java.util.Scanner;

public class BubbleSortIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the list of integers (space-separated): ");
        String intListInput = scanner.nextLine();

        String[] intStrings = intListInput.split(" ");
        int[] integers = new int[intStrings.length];

        for (int i = 0; i < intStrings.length; i++) {
            integers[i] = Integer.parseInt(intStrings[i]);
        }

        bubbleSort(integers);

        System.out.println("Sorted List of Integers:");
        for (int num : integers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

