package group2.chapter3;

public class LongLight {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distace;
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distace = lightspeed * seconds;
        System.out.print("За" + days);
        System.out.print("дней свет пройдет окло " );
        System.out.println(distace+ "миль. ");




    }
}
