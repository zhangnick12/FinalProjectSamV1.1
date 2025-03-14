import java.util.ArrayList;

public class Book extends Item
{
     int len;
     
    public Book(String title, String author, String type, String location, String ISBN, int quantity, double finePerDay, int len)
    {
        super( title,author, type, location,  quantity, finePerDay, ISBN);
        
        this.len = len;
        
    }
     

    public int getLength() 
    {
        return len;
    }
    
    
    public void displayBookInfo()
    {
         System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + "\n Location: " + location + "\n Quantity: " + quantity
         + ", Availaility: " + isAvailable + ", The fine per day is: " + finePerDay + " and the book length is: " + len);
    }
    public String getType() 
    {
        return "Book";
    }
}