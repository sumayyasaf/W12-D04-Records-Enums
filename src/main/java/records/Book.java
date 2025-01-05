package records;

public record Book(String title, Author author,double price, int publicationYear) {


public double discountedPrice(double discountPercentage) {
    return price - (price * discountPercentage / 100);
}
public static Book compareBooksByPrice(Book book1, Book book2){
    if(book1.price() > book2.price()){
        return book1;
    } else if (book1.price() < book2.price()){
        return book2;
    } else {
        return null; // Return null if both books have the same price
    }
}

}
