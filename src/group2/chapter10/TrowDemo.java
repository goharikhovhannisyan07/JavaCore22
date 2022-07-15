package group2.chapter10;

public class TrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException ("demo");
        }catch (NullPointerException e){
            System.out.println("cought inside demoproc");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("recaught: " + e);
        }
    }

}
