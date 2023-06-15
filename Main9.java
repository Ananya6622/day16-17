package day16;

//public class BinarySearch<T extends Comparable<T>> {
//    public int binarySearch(T[] array, T target) {
//        int low = 0;
//        int high = array.length - 1;
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            int comparison = target.compareTo(array[mid]);
//
//            if (comparison == 0) {
//                return mid; // Element found at index mid
//            } else if (comparison < 0) {
//                high = mid - 1; // Target is in the left half
//            } else {
//                low = mid + 1; // Target is in the right half
//            }
//        }
//
//        return -1; // Element not found
//    }
//}
//public class InsertionSort<T extends Comparable<T>> {
//    public void insertionSort(T[] array) {
//        for (int i = 1; i < array.length; i++) {
//            T key = array[i];
//            int j = i - 1;
//
//            while (j >= 0 && array[j].compareTo(key) > 0) {
//                array[j + 1] = array[j];
//                j--;
//            }
//
//            array[j + 1] = key;
//        }
//    }
//}
//public class Main9 {
//    public static void main(String[] args) {
//        Integer[] numbers = { 5, 2, 8, 1, 9, 3 };
//        String[] words = { "banana", "apple", "pear", "orange" };
//
//        BinarySearch<Integer> binarySearch = new BinarySearch<>();
//        int index = binarySearch.binarySearch(numbers, 8);
//        System.out.println("Index of element 8: " + index);
//
//        InsertionSort<String> insertionSort = new InsertionSort<>();
//        insertionSort.insertionSort(words);
//        System.out.println("Sorted words: " + Arrays.toString(words));
//    }
//}
