package group1.classwork.Lesson15;

public class StringExample {
    public static void main(String[] args) {
        String name = new String("Poxos");
        String name1 = "Poxos";
        boolean result = name.equals (name1);
        System.out.println(result);
        //Այս դեպքում եթե դարակների պարունակությունը համնկավ ապա վերադարձնում է TRUE
        // եթե ոչ ապա FALSE։
        boolean result1=name==name1;
        System.out.println(result1);
        //Այս դեպքում եթե երկուսնել գտնվում են նույն դարակում վերադարձնում է TRUE
        //եթե նույն դարակում չէ վերադարձնում է FALSE։ (TRUE այն դեպքում երբ երկու սիմբվոլը
        //համնկնում է։
    }
}

