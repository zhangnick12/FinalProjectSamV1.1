package Library;

public class DVD extends Item
{
    int duration;
    public DVD(String title,String author, String type, String location, String ISBN, int quantity, double finePerDay, int duration)
    {
        super(title, author, type, location, quantity, finePerDay, ISBN);
        this.duration = duration;
    }
    public int getDuration()
    {
        return duration;
    }
     
    public void displaydVDInfo()
    {
         System.out.println("Title: " + title + ", Author: " + author + ", Duration: " + duration + "\n Location: " + location + "\n Quantity: " + quantity
         + ", Availaility: " + isAvailable + ", The fine per day is: " + finePerDay);
    }
    public String getType() 
     {
        return "Library.DVD";
    }
}