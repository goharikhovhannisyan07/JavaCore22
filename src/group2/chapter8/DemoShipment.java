package group2.chapter8;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15);
        Shipment shipment2 = new Shipment(2, 3, 4);
        double vol;
        vol=shipment1.volume();
        System.out.println("Volume is shipment1 is " + vol);
        System.out.println("Weight is shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();
        vol=shipment2.volume();
        System.out.println("Volume is shipment2 is " + vol);
        System.out.println("Weight is shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);



    }

}
