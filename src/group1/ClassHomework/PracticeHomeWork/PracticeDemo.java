package group1.ClassHomework.PracticeHomeWork;

public class PracticeDemo {
    public static void main(String[] args) {
        Practice practice = new Practice();
        System.out.println(practice.convert(60));
        System.out.println(practice.calcAge(47));
        System.out.println(practice.nextNumber(25));
        System.out.println(practice.isSameNum(10, 8));
        System.out.println(practice.lessThanOrEqualToZero(-9));
        System.out.println(practice.reverseBool(true));

        int[] array1 = {3, 8, 4, 7, 2, 1, 5, 16};
        int[] array2 = {2, 8, 7, 36, 14, 22, 44, 7, 8, 15};
        System.out.println(practice.maxLength(array1, array2));


    }
}
