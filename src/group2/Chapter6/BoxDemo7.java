package group2.Chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        vol = mybox1.Volume();
        System.out.println("Volume is: " + vol);
        vol = mybox2.Volume();
        System.out.println("Volume is: " + vol);
    }
}
