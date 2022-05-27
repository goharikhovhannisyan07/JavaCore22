package group1.HomeWork.ArrayUntilHW;

public class AraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int starIndex = 0;
        int endIndex = spaceArray.length - 1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[starIndex] == ' ') {
                starIndex++;
            } else {
                break;
            }

        }

        for (int i = endIndex; i > 0; i--) {
            if (spaceArray[endIndex] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }
        int newlength = (endIndex - starIndex) + 1;
        char[] resalt = new char[newlength];
        int j = 0;
        for (int i = starIndex; i <= endIndex; i++) {
            resalt[j++] = spaceArray[i];

        }


        for (char c : resalt) {
            System.out.print(c);

        }


    }
}
