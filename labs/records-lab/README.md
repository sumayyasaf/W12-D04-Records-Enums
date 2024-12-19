# Exercise: Creating and Using Records for a Bookstore

## Objective:
In this exercise, you will learn how to define and use **records** in Java. You will create simple, immutable data classes for managing books and authors in a bookstore system. Additionally, you will practice implementing static methods.

## Requirements:

1. **Create a Record for `Author`:**
   - Define a record named `Author` with the following fields:
     - `name` (String)
     - `birthYear` (int)
     - `nationality` (String)
   - Use the automatically generated `toString()`, `equals()`, and `hashCode()` methods.

2. **Create a Record for `Book`:**
   - Define a record named `Book` with the following fields:
     - `title` (String)
     - `author` (Author) — this field will store an instance of the `Author` record.
     - `price` (double)
     - `publicationYear` (int)
   - Include an additional method `discountedPrice(double discountPercentage)` that calculates and returns the price after applying a discount.

3. **Static Method Implementation:**
   - Add a static method `compareBooksByPrice(Book book1, Book book2)` to the `Book` record. This method should compare two `Book` instances and return the book with the higher price. If both books have the same price, return `null`.
   
4. **Demonstrate Usage:**
   - In your `main` method:
     - Create a few sample authors and books.
     - Print the details of each book using the `toString()` method.
     - Compare two books using the `equals()` method to check if they are the same.
     - Apply a discount to a book and print the new price.
     - Use the `compareBooksByPrice()` static method to compare two books based on their price and print the result.

5. **Bonus Challenge (Optional):**
   - Add a `discountedPrice(double discountPercentage)` method to the `Book` record that returns the price after applying a discount. For example, if a book costs $30 and the discount is 10%, the new price should be $27.
