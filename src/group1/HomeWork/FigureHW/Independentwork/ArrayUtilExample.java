package group1.HomeWork.FigureHW.Independentwork;

public class ArrayUtilExample {
    public static void main(String[] args) {
        int[] array = {25, 78, 58, 41, 2, 4, 36, 24, 13, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        //Տպել մասիվի ամենամեծ թիվը
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];


        }
        System.out.println("max -> " + max);
        //Տպել մասիվի ամենափոքր թիվը
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("min -> " + min);
        System.out.println("զույգերը");

        //Տպել բոլոր զույգերը
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("կենտերը։");
        // Տպել բոլոր կենտերը
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        //Տպել զույգերի քանակը
        int countOfEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                countOfEvens++;
            }
        }
        System.out.println("զույգերի քանակը -> " + countOfEvens);
        //Տպել կենտերի քանակը
        int countOfodds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfodds++;
            }
        }
        System.out.println("կենտերի քանակը —> " + countOfodds);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum->" + sum);
        double avg = sum / array.length;
        System.out.println(avg);
    }


}
