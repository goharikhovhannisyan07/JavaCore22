package group2.chapter3;

public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y ture" + y);
            y = 100;
            System.out.println("Y is right now" + y);
        }
    }
}
