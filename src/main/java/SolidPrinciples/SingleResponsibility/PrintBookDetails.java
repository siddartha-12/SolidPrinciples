package SolidPrinciples.SingleResponsibility;

public class PrintBookDetails {
    private  Book book;
    PrintBookDetails(Book book){
        this.book = book;
    }
    public void printBookDetails()
    {
        System.out.println(book.getName()+" "+ book.getAuthor()+" "+ book.getCost());
    }
}
