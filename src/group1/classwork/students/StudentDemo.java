package group1.classwork.students;

import group1.classwork.students.command.Command;
import group1.classwork.students.model.Lesson;
import group1.classwork.students.model.Student;
import group1.classwork.students.storage.LessonStorage;
import group1.classwork.students.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson Java = new Lesson("Java", "Karen", 7, 35000);
        lessonStorage.add(Java);
        Lesson PHP = new Lesson("PHP", "Narek", 5, 25000);
        lessonStorage.add(PHP);
        Lesson English = new Lesson("English", "Mrs Zina", 6, 30000);
        lessonStorage.add(English);
        studentStorage.add(new Student("Poxos", "Poxosyan", 25, "097558877", "Gyumri", Java));
        studentStorage.add(new Student("Martiros", "Martirosyan", 23, "096557744", "Erevan", PHP));
        studentStorage.add(new Student("Narek", "Boyajyan", 24, "098373781", "Gyumri", English));

        boolean run = true;
        while (run) {
            System.out.println("Please input " + EXIT + " for Exit");
            System.out.println("Please input " + ADD_STUDENT + " for add student");
            System.out.println("Please input " + PRINT_ALL_STUDENTS + " for print all students");
            System.out.println("Please input " + DELETE_STUDENT_BY_INDEX + " for delete student by index");
            System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
            System.out.println("Please input " + PRINT_STUDENT_COUNT + " for print students count");
            System.out.println("Please input " + CHANGE_STUDENT_LESSON + " for change student's lesson");
            System.out.println("Please input " + ADD_LESSON + " for Add lesson");
            System.out.println("Please input " + PRINT_ALL_LESSON + " for print all lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    System.out.println("Process Finished");
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case PRINT_STUDENT_COUNT:
                    studentsCount();
                    break;
                case CHANGE_STUDENT_LESSON:
                    chnageStudentsLesson();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSON:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("invalid command");
            }
        }


    }

    private static void addLesson() {
        System.out.println("please input lesson name");
        String name = scanner.nextLine();

        System.out.println("please input lesson teacherName");
        String teacherName = scanner.nextLine();

        System.out.println("please input lesson diration by month");
        int duration = Integer.parseInt(scanner.nextLine());

        System.out.println("please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson(name, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("lesson was make!");
    }

    private static void chnageStudentsLesson() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getstudentByIndex(index);
        if (student != null) {
            System.out.println("Please input new Lesson index");
            lessonStorage.print();
            System.out.println("please choos lesson");
            int lessoIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessoIndex);
            if (lesson == null) {
                System.out.println("please input coorect index");
                chnageStudentsLesson();
            } else {
                student.setLesson(lesson);
                System.out.println("Lesson changed");
            }


        }
    }

    private static void studentsCount() {
        System.out.println("students count");
        System.out.println(studentStorage.getSize());
    }

    private static void printStudentsByLessonName() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {
        if (lessonStorage.getSize() == 0) {
            System.out.println("Please add lessons");
            addLesson();
        } else {
            lessonStorage.print();
            System.out.println("please choos lesson");
            int lessoIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessoIndex);
            if (lesson == null) {
                System.out.println("please input coorect index");
                addStudent();
            } else {
                System.out.println("Please input Student's name");
                String name = scanner.nextLine();
                System.out.println("Please input Student's surname");
                String surname = scanner.nextLine();
                System.out.println("Please input Student's age");
                String agestr = scanner.nextLine();
                System.out.println("Please input Student's phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input Student's city");
                String city = scanner.nextLine();
                int age = Integer.parseInt(agestr);

                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("Student created");

            }

        }


    }
}
