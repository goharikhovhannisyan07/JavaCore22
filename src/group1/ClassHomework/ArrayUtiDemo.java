package group1.ClassHomework;

public class ArrayUtiDemo {
    public static void main(String[] args) {
        ArrayUtil au=new ArrayUtil();
        int[] array={3,4,7,8,11,69,15,25};
        au.print(array);
        System.out.println();
        int max = au.max(array);
        System.out.println(max);
        int min=au.min(array);
        System.out.println(min);
        au.sortfromMin(array);
        au.print(array);



    }
}
