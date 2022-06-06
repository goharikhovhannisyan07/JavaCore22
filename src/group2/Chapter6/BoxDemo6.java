package group2.Chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        vol = mybox1.Volume();
        System.out.println("Volume is:" + vol);
        vol = mybox2.Volume();
        System.out.println("Volume is: " + vol);

    }
}
