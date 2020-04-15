import java.util.Scanner;

public class Run {
    public static int getTotalPrice(Book[] books) {
        int totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    public static int getNumberofBooksInTheSameLanguage(Book[] books, String language) {
        int number = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equalsIgnoreCase(language)) {
                    number++;
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("#1", "book1", 150, "author1", "Ruby", "framework1");
        books[1] = new ProgrammingBook("#2", "book2", 140, "author2", "java", "framework2");
        books[2] = new ProgrammingBook("#3", "book3", 150, "author1", "Python", "framework3");
        books[3] = new ProgrammingBook("#4", "book4", 170, "author1", "java", "framework4");
        books[4] = new ProgrammingBook("#5", "book5", 190, "author1", "PHP", "framework5");
        books[5] = new FictionBook("123456789", 200);
        books[6] = new FictionBook("12345678", 180);
        books[7] = new FictionBook("1234567", 80);
        books[8] = new FictionBook("123456", 90);
        books[9] = new FictionBook("12345", 210);
        System.out.printf("the total price is %d $\n", Run.getTotalPrice(books));
        System.out.print("enter a language to find the number of books involve: ");
        String language = new Scanner(System.in).nextLine();
        System.out.printf("the number of %s books is %d", language, Run.getNumberofBooksInTheSameLanguage(books, language));
    }
}