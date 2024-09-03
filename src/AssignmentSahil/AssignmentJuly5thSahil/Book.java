package AssignmentSahil.AssignmentJuly5thSahil;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;       //No of copies available

    public Book(String title, String author, double price, int stock){
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public double getPrice() {return price;}
    public int getStock() {return stock;}

    public void sellBook(int quantity) throws InsufficientStockException{
        if (quantity > stock){
            throw new InsufficientStockException("Stock Insufficient. Only "+stock+" books available");
        }
        stock -= quantity;
    }
}