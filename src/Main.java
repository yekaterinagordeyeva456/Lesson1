import Lesson1.Author;
import Lesson1.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Книга 1:");
        Author authorName1 = new Author("Лев", "Толстой");
        Book book1 = new Book(authorName1, "Война и Мир", 1996);
        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.authorName1 = " + authorName1.getFirstName() + " " + authorName1.getLastName());
        System.out.println("book1.publishingYear = " + book1.getPublishingYear());
        book1.setPublishingYear(2000);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
        System.out.println("Книга 2: ");
        Author authorName2 = new Author("Константин", "Циолковский");
        Book book2 = new Book(authorName2, "Звезда КЭЦ", 1986);
        System.out.println("book2.name = " + book2.getName());
        System.out.println("book2.authorName1 = " + authorName2.getFirstName() + " " + authorName2.getLastName());
        System.out.println("book2.publishingYear = " + book2.getPublishingYear());
        book2.setPublishingYear(1998);
        System.out.println("book2.getPublishingYear() = " + book2.getPublishingYear());
    }
}