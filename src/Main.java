import Lesson1.Author;
import Lesson1.Book;

public class Main {
    public static void main(String[] args) {
        Author authorName1 = new Author("Лев", "Толстой");
        Book book1 = new Book(authorName1,"Война и Мир",1996);
        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.authorName1 = " + authorName1.getFirstName() + " " + authorName1.getLastName());
        System.out.println("book1.publishingYear = " + book1.getPublishingYear());
        book1.setPublishingYear(2000);
        System.out.println("book1.getPublishingYear() = " + book1.getPublishingYear());
    }
}