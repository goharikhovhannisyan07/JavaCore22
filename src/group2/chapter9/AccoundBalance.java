package group2.chapter9;

public class AccoundBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];
        current[0] = new Balance("K. J Fielding", 123.23);
        current[1] = new Balance("Will Tell", 157.02);
        current[3] = new Balance("Tom Jakson", -12.33);
        for (int i = 0; i < 3; i++) current[i].show();
        {

        }
    }
}
