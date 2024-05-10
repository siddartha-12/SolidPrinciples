package SolidPrinciples.OpenClosePrinciple;

public class Book {
    private int cost;
    private String name;
    private String author;
    //in future if we add one more param String typeOfBook;
    //previously using this class may fail the application
    //So we will create a new class by including extra param and inherit the Book class
}
