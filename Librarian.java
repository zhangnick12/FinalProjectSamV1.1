
public class Librarian
{
    int userID;
    String name, phone, password, location;
    public Librarian(int userID, String password, String phone, String name)
    {
        this.userID = userID;
        this.phone = phone;
        this.name = name;
    }
    public int getID()
    {
        return userID;
    }
    public String getPhone()
    {
        return phone;
    }
    public String getName()
    {
        return name;
    }
    public String getPassword()
    {
        return password;
    }
      public boolean authenticate(String inputPassword)
      {
        return password.equals(inputPassword);
    }
     public void addItem(Database db, Item item) {
        db.addItem(item);
        System.out.println("Item added by " + name + ": " + item.getTitle());
    }

    public void removeItem(Database db, String ISBN) {
        db.removeItem(ISBN);
        System.out.println("Item removed by " + name + ": ID=" + ISBN);
    }   
    public void assignFine(User2 user, double amount) 
    {
        System.out.println("Fine of $" + amount + " has been assigned to user: " + user.name);
    }
}

