package SolidPrinciples.SingleResponsibility;

public class Client {
    public static void main(String[] args) {


        Book book = new Book(10, "Java", "Siddhu");
        PrintBookDetails printBookDetails = new PrintBookDetails(book);
        printBookDetails.printBookDetails();
    }
}
