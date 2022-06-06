package group1.HomeWork.ArrayUntilHW;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int x : array) {
            System.out.print(x + " ");

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;

                }
            }
        }
        for (int x : array) {
            System.out.print(x + " ");

        }
    }
}

