package group1.classwork.Students;

public class StudentStorage {
    private static Student[] array = new Student[10];
    private static int size = 0;

    public static void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[index] = array[index + 1];
            }
            size--;
            System.out.println("student deleted");
        }else {
            System.out.println("Index out of bounds");
        }
    }

    public void add(Student student) {
        if (size == array.length) {
            extend();
        }
        array[size++] = student;
    }

    private void extend() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void println() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }
    }

    public int getSize() {
        return size;
    }

    public void printStudentsByLessons(String lessonName) {
        for (int i = 0; i <size ; i++) {
            if (array[i].getLesson().equals(lessonName)){
                System.out.println(array[i]);
            }

        }
    }


    }

