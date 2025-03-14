package Library;

import java.util.ArrayList;
public class Database 
{
    private ArrayList<Item> database;
    private Catalog catalog;

    public Database()
    {
        database = new ArrayList<Item>();
        catalog = new Catalog();
    }
    public void addItem(Item item)
    {
        database.add(item);
        System.out.println("Added " + item.getTitle());
    }
    public void removeItem(String ISBN)
    {
        
        database.removeIf(item -> item.getISBN().equals(ISBN));
    }
    public Item findItem(String ISBN)
    {
        for( Item item: database)
        {
            if( item.getISBN().equals(ISBN))
            {
                return item;
            }
        }
        return null;
    }
    public void printCatalog()
    {
        for( Item item: database)
        {
            System.out.println(item);
        }
    }
    
    public Catalog getCatalog() 
    { 
        return catalog; 
    }

    public void saveData() 
    {
        System.out.println("Data saved to the database.");
    }

    public void loadData() 
    {
        System.out.println("Data loaded from the database.");
    }
}

