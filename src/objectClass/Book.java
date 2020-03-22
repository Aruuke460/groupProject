package objectClass;

public class Book {
    String title;
    String author;
    int pages;

    public Book() {

    }
    public Book(String title, String author, int age){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void info() {
        System.out.println("Name "+ this.title);
        System.out.println("Author " + this.author);
        System.out.println("Pages " + this.pages);
        System.out.println();
    }
}
