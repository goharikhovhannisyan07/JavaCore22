package group2.chapter12;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple2 ap, ap2, ap3;
        System.out.println("Here are all Apple constants " + "and their ordinal values ");
        for (Apple2 a : Apple2.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        ap = Apple2.RedDel;
        ap2 = Apple2.GoldeDel;
        ap3 = Apple2.RedDel;
        System.out.println();
        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + "comes before " + ap2);
        if (ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " comes before " + ap);
        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);
        System.out.println();
        if (ap.equals(ap2))
            System.out.println("Error! ");
        if (ap.equals(ap3))
            System.out.println(ap + " equals" + ap3);
        if (ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}
