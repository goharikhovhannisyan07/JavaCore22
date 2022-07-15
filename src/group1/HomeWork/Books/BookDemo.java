package group1.HomeWork.Books;

import java.util.Scanner;

public class BookDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean step = true;
        while (step) {
            System.out.println("please input 0 for Exit");
            System.out.println("Please input 1 for add book");
            System.out.println("Please input 2 for print all books");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    step = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    bookStorage.print();
                    break;
                default:
                    System.out.println("invalid command");

            }
        }


    }

    private static void addBook() {
        System.out.println("Please input Book's title");
        String title = scanner.nextLine();
        System.out.println("Please input Book's autorName");
        String autorName = scanner.nextLine();
        System.out.println("Please input Book's price");
        String pricestr = scanner.nextLine();
        System.out.println("Please input Book's count");
        String countstr = scanner.nextLine();
        System.out.println("Please input Book's gentre");
        String gentre = scanner.nextLine();

        double price = Double.parseDouble(pricestr);
        int count = Integer.parseInt(countstr);

        Book book = new Book(title, autorName, price, count, gentre);
        bookStorage.add(book);
        System.out.println("Book created");

    }
}
