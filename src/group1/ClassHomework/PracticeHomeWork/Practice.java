package group1.ClassHomework.PracticeHomeWork;

public class Practice {
    long convert(int minutes) {
        return (long) minutes * 60;
    }

    int calcAge(int years) {
        return years * 366;
    }

    int nextNumber(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        boolean t = a == b ? true : false;
        return t;
    }

    boolean lessThanOrEqualToZero(int number) {
        return number >= 0;

    }

    boolean reverseBool(boolean value) {
        return !value;
    }

    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }
}
