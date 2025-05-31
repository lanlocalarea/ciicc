package Activities;

public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943, 7.99);
        Book book2 = new Book("Charlotte's Web", "E. B. White", 1952, 6.99);
        Book book3 = new Book("The Alchemist", "Paulo Coelho", 1988, 9.99);
        System.out.println("\nBook 1: \n" + book1 + "\n");
        System.out.println("Book 2: \n" + book2 + "\n");
        System.out.println("Book 3: \n" + book3);

    }
}

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public String toString(){

        return "Title: " + '"' + this.title + '"' + "\n" +
                "Author: " + '"' + this.author + '"' + "\n" +
                "Year Published: " + this.yearPublished + "\n" +
                "Price: $" + this.price;
    }
}
