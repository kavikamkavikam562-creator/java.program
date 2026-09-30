
class Book {
    private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

  
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Creating objects of the Book class
        Book b1 = new Book("Effective Java", "Joshua Bloch", 45.00);
        Book b2 = new Book("Clean Code", "Robert Martin", 40.00);

      
        System.out.println("Book 1: " + b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Book 2: " + b2.getTitle() + " by " + b2.getAuthor());
    }
}


