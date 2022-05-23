package group2.chapter5;

public class TypeInferenceInFor {
    public static void main(String[] args) {
        System.out.print("Values of x: ");
        for (double x = 2.5; x < 100.0; x = x * 2)
            System.out.print(x + " ");
        System.out.println();
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.print("Values int nums array: ");
        for (int v : nums)
            System.out.print(v + " ");
        System.out.println();

    }
}
