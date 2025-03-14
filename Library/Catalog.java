package Library;

import java.util.ArrayList;
public class Catalog
{
    ArrayList<Item> items;
    private Database database;

    public Catalog()
    {
        items = new ArrayList();
    }
       public void searchByTitle(String title) 
       {
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println(item);
            }
        }
    }

    public ArrayList<Item> searchByAuthor(String author) 
    {
        ArrayList<Item> results = new ArrayList<>();
        for (Item item : items) 
        {
            if (item.getMaker().toLowerCase().contains(author.toLowerCase())) 
            {
                results.add(item);
            }
        }
        return results;
    }
        public ArrayList<Item> searchByIsbn(String isbn)
        {
        ArrayList<Item> results = new ArrayList<>();
        for (Item item : items) 
        {
            if (item.getISBN().equals(isbn)) 
            {
                results.add(item);
            }
        }
        return results;
    }
    public void displayCatalog()
    {
        for(Item item : items)
        {
            System.out.println(item);
        }
    }
    public Item findItemByTitle(String title) {
        for (Item item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
}
}

        
        