package HomeWork.ArrayUntilHW;

public class ArayUtil {
    public static void main(String[] args) {
        int[] aray = {25, 78, 58, 41, 2, 4, 36, 24, 13, 7};

        //Տպել մասիվի բոլոր էլէմնտները
        for (int i = 0; i < aray.length; i++) {
            System.out.print(aray[i] + " ");
        }
        //Տպել մասիվի ամենամեծ թիվը

        System.out.println();
        int max = aray[0];
        for (int i = 1; i < aray.length; i++) {
            if (aray[i] > max) {
                max = aray[i];
            }
        }
        System.out.println("max = " + max);

        //Տպել մասիվի ամենափոքր թիվը

        int min = aray[0];
        for (int i = 1; i < aray.length; i++) {
            if (aray[i] < min) {
                min = aray[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("զույգերը։");
        //Տպել բոլոր զույգերը

        for (int i = 0; i < aray.length; i++) {
            if (aray[i] % 2 == 0) {
                System.out.print(aray[i] + " ");
            }
        }
        System.out.println();
        System.out.println("կենտերը։");
        // Տպել բոլոր կենտերը
        for (int i = 0; i < aray.length; i++) {
            if (aray[i] % 2 != 0) {
                System.out.print(aray[i] + " ");
            }
        }
        System.out.println();
        //Տպել զույգերի քանակը
        int countOfEvens = 0;
        for (int i = 0; i < aray.length; i++) {
            if (aray[i] != 0 && aray[i] % 2 == 0) {
                countOfEvens++;
            }
        }
        System.out.println("զույգերի քանակը->" + countOfEvens);

        //Տպել կենտերի քանակը
        int countOfOdds = 0;
        for (int i = 0; i < aray.length; i++) {
            if (aray[i] % 2 != 0) {
                countOfOdds++;
            }
        }
        System.out.println("կենտերի քանակը->" + countOfOdds);
        double sum = 0;
        for (int i = 0; i < aray.length; i++) {
            sum += aray[i];
        }
        System.out.println("sum->" + sum);
        double avg = sum / aray.length;
        System.out.println(avg);


    }
}
