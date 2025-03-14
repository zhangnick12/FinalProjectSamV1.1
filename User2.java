import java.util.ArrayList;
public class User2
{
    int userID, password;
    String name, phone;
    ArrayList<Item> borrowed = new ArrayList();
    public User2(int userID, int password, String phone, String name)
    {
        this.userID = userID;
        this.phone = phone;
        this.name = name;
    }
    public int getID()
    {
        return userID;
    }
    public int getPassword()
    {
        return password;
    }
    public String getPhone()
    {
        return phone;
    }
    public String getName()
    {
        return name;
    }
    public void borrowItem(Item item)
    {
        if ( borrowed.size() < 5)
        {
            borrowed.add(item);
        }
        else
        {
            System.out.println("You can only borrow up to 5 items.");
        }
    }
    public void returnItem(String ISBN)
    {
        borrowed.removeIf(item-> item.ISBN.equals(ISBN));
    }
}