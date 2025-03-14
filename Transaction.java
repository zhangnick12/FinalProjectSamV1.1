import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

  public class Transaction 
{
    User2 user;
    double fine;
    int dateAdded;
    private int userId;
    private String isbn, type;
    private Date borrowDate;
    private Date returnDate;
    

    public Transaction(int userId, String isbn, String type, Date borrowDate, Date returnDate)
    {
        this.userId = userId;
        this.isbn = isbn;
        this.borrowDate = new GregorianCalendar(2025, 3, 5).getTime();
        this.returnDate = new GregorianCalendar(2025, 3, 26).getTime();
    }
    public int getUserID()
    {
        return userId;
    }
    public String isbn()
    {
        return isbn;
    }
    public String getType()
    {
        return type;
    }
    public static void borrowItems(ArrayList<Item> items, User2 user)
    {
        for(Item item: items)
        {
            if ( item.isAvailable == false)
            {
                System.out.println(item.title + " has already been borrowed.");
            }
            else if (item.decreaseQuantity() && items.size() <5)
            {
                user.borrowItem(item);
                System.out.println(user.getName() + " borrowed: " + item.getTitle());
                
            }
        }
        }
        public void returnItems(ArrayList<Item> items, User2 user, int daysLate)
        {
        for (Item item : items) 
        {
            if (item.isAvailable == true) 
            {
                user.returnItem(isbn);
                item.increaseQuantity();
                System.out.println(user.getName() + " returned: " + item.getTitle());
                if (daysLate > 0) 
                {
                    double bookFine = item.finePerDay * daysLate;
                    fine += bookFine;
                    System.out.println(item.title + " is returned late. The fine is: " + bookFine);
                }
            } 
            else 
            {
                System.out.println(item.title + " was not borrowed by " + user.name);
            }
        }
    }
    

       public String toString()
       {
           String result = "User ID: " + getUserID() + " and the book isbn is: " + isbn;
           result += "\nYou borrowed this book on: " + borrowDate + "\nIt must be returned on: " + returnDate;
           result += "\nThe total amount of fines you need to pay is " + fine;
           return result;
       }
}

       