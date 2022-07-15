package group2.chapter7;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Firts line";
        String strOb2 = "Second line";
        String strob3 = strOb1;
        System.out.println("line lenght strOb1 " + strOb1.length());
        System.out.println("Character at index 3 in index " + strOb1.charAt(3));
        if (strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");
        if (strOb1.equals(strob3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}

