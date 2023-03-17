package Lesson1;

public class Book {
    private String name;
    private String author;
    private int publishingYear;

    public Book(Author author,String name, int publishingYear) {
        this.author = String.valueOf(author);
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
