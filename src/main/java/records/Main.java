package records;

public class Main {
    public static void main(String[] args) {
        //Create a few sample authors and books
        Author author1 = new Author("Stephen King", 1947, "American");
        Author author2 = new Author("Philip Roth", 1933, "American");

        Book book1 = new Book("The Stand", author1, 40.0, 1978);
        Book book2 = new Book("Goodbye Columbus", author2, 30.0, 1959);

        //Print the details of each book using the toString() method
        System.out.println(book1);
        System.out.println(book2);

        //Compare two books using the equals() method to check if they are the same
        System.out.println("Are Book1 and Book2 same? " + book1.equals(book2));

        //Apply a discount to a book and print the new price
        double discount = 10.0;
        System.out.println("Book1 price after discount: " + book1.discountedPrice(discount));

        //Use the compareBooksByPrice() static method to compare two books based on their price and print the result
        Book moreExpensiveBook = Book.compareBooksByPrice(book1, book2);
        if (moreExpensiveBook != null) {
            System.out.println("The more expensive book is: " + moreExpensiveBook.title());
        } else {
            System.out.println("Both books have the same price.");


        }
    }
}
