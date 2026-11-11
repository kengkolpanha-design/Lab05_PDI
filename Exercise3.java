class Book {
    String title;
    String author;
    double price;

    // First constructor: overrides the default constructor and sets default values
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Second constructor: sets the specific information of a book
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display the book's details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("-------------------------");
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        // Instantiate using the default constructor
        Book book1 = new Book();
        System.out.println("Book 1 Details:");
        book1.displayDetails();

        // Instantiate using the parameterized constructor
        Book book2 = new Book("Ego Is The Enemy", "Ryan Holiday", 19.99);
        System.out.println("Book 2 Details:");
        book2.displayDetails();
    }
}