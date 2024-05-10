package SolidPrinciples.SingleResponsibility;

public class Book {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int cost, String name, String author) {
        this.cost = cost;
        this.name = name;
        this.author = author;
    }

    private String name;
    private int cost;
    private String author;
    //it violates single responsibility principle
    //so we need to include this in separate class;
//    public void printBookDetails()
//    {
//        System.out.println(name+" "+author+" "+cost);
//    }
}
