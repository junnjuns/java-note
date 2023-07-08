package ch11;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 10);

        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        arrPrint(arr2);
        arrPrint(arr3);
        arrPrint(arr4);
        arrPrint(arr5);
        arrPrint(arr6);
    }

    static void arrPrint(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
