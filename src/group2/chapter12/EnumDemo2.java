package group2.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Here are all Apple Constants");

        //use Values();
        Apple allApples[] = Apple.values();
        for (Apple a : allApples)
            System.out.println(a);

            System.out.println();

            //use ValueOf()
            ap = Apple.valueOf("Winesap");
            System.out.println("ap contains: " + ap);


    }
}
