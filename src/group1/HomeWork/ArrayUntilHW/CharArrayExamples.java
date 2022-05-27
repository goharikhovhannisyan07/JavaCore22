package group1.HomeWork.ArrayUntilHW;

public class CharArrayExamples {
    public static void main(String[] args) {
//1
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("count = " + count);
//2
        int middleindex = chars.length / 2;
        System.out.print(chars[middleindex - 1] + " ");
        System.out.println(chars[middleindex]);
//3
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char x = chars3[chars.length - 2];
        char y = chars3[chars.length - 1];
        boolean result = false;
        if (x == 'l' && y == 'y') {
            result = true;
        }
        System.out.println(result);
//4
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean bobresult = false;
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                bobresult = true;
                break;

            }

        }
        System.out.println("bobresult = " + bobresult);
//5
        char[] spaceArray = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (char c1 : spaceArray) {
            if (c1 != ' ') {
                System.out.print(c1);

            }

        }

    }

}

