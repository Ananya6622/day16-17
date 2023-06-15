package day16;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the list of strings (space-separated): ");
        String stringListInput = scanner.nextLine();

        String[] strings = stringListInput.split(" ");

        mergeSort(strings);

        System.out.println("Sorted List of Strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }

    public static void mergeSort(String[] array) {
        if (array.length <= 1) {
            return; // Base case: already sorted
        }

        int mid = array.length / 2;
        String[] leftArray = Arrays.copyOfRange(array, 0, mid);
        String[] rightArray = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(leftArray); // Recursively sort the left subarray
        mergeSort(rightArray); // Recursively sort the right subarray

        merge(array, leftArray, rightArray); // Merge the sorted subarrays
    }

    public static void merge(String[] array, String[] leftArray, String[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
