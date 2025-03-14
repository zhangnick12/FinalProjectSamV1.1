public abstract class Item 
{
    String title, author, type, location, ISBN;
     int  quantity;
     double finePerDay;
     boolean isAvailable;
    public Item(String title,String author, String type, String location, int quantity, double finePerDay, String ISBN) 
    {
        this.title = title;
        this.type = type;
        this.author = author;
        this.location = location;
        this.quantity = quantity;
        this.finePerDay = finePerDay;
        this.isAvailable = true;
        this.ISBN = ISBN;
    }

    public String getTitle()
    {
        return title;
    }

    public String getGenre() 
    {
        return type;
    }
    public String getMaker()
    {
        return author;
    }
     public String getLocation()
    {
        return location;
    }
    
    public int getQuantity() 
    {
        return quantity;
    }
    public boolean decreaseQuantity()
    {
        if (quantity > 0)
        {
            quantity--;
            return true;
        }
        else
        {
            System.out.println("No more available books");
            return false;
        }
    }
    public void increaseQuantity()
    {
        quantity++;
    }
    public double finePerDay()
    {
        return finePerDay;
        
    }
    public boolean isAvailable() 
    {
        return isAvailable;
    }
       public void setAvailable(boolean available) 
       {
        isAvailable = available;
    }
    public String getISBN()
    {
        return ISBN;
    }
    

    public abstract String getType();
}
