package Library;

import java.util.ArrayList;


        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Catalog catalog = db.getCatalog();
        Scanner scanner = new Scanner(System.in);
       Librarian librarian = new Librarian(1056, "230", "424-480-5641", "Alice");
       Book a = new Book("To Kill a Mockingbird", "Harper Lee", "Novel", "701 Silver Spur Rd, Rolling Hills Estates, CA 90274", "978-92-95055-02-5", 3, 2.50, 250); 
         DVD b = new DVD("Spider Man No Way Home", "Jon Watts", "Film", "701 Silver Spur Rd, Rolling Hills Estates, CA 90274", "978-0-596-52068-7", 5, 1.50, 100);
         librarian.addItem(db, a);
         librarian.addItem(db, b);
      
        ArrayList<Item> items = new ArrayList<>();
        User2 user = new User2(8694, 1234, "310-456-7891", "Oliver");
       
  while (true) 
  {
    System.out.println("\nAre you a (1) Member or (2) Library.Librarian? (Enter 3 to Exit)");
    int userType = scanner.nextInt();
    scanner.nextLine();
    if (userType == 1)
    {
        System.out.println("1. Search for items");
        System.out.println("2. Borrow item");
        System.out.println("3. Return item");
        System.out.println("4. Display Items");
        System.out.println("5. Exit");
        int userID = scanner.nextInt();
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) 
        {
           System.out.print("Enter title to search: ");
           String title = scanner.nextLine();
           catalog.searchByTitle(title);            
        } 
        else if (choice == 2) 
        {
            System.out.print("Enter item title to borrow: ");
            String title = scanner.nextLine();
            for (Item item : catalog.items) 
            {
                if (item.getTitle().equalsIgnoreCase(title) && item.isAvailable()) 
                {
                   user.borrowItem(item);
                   System.out.println("Library.Item borrowed: " + item);
                   break;
                }
            }
        } 
        else if (choice == 3) 
        {
           System.out.println("Enter title of the item you want to return: ");
           String title = scanner.nextLine();
           Item item = catalog.findItemByTitle(title);
           String ISBN = scanner.nextLine();
           if (item != null && !item.isAvailable()) 
           {
               user.returnItem(ISBN);
               System.out.println("You returned: " + item.getTitle());
           } 
           else
           {
                    System.out.println("Library.Item not found or not borrowed.");
                }
            } 
            else if ( choice == 4)
            {
                catalog.displayCatalog();
            }
         else if (choice == 5) 
            {
                System.out.println("Goodbye!");
                break;
            }
        
        else if (userType ==2)
        {
          System.out.print("Enter librarian password: ");
          String password = scanner.nextLine();
          String title = scanner.nextLine();
          String author = scanner.nextLine();
          String type = scanner.nextLine();
          int amount = scanner.nextInt();
          int len= scanner.nextInt();
        int finePerDay = scanner.nextInt();
       int quantity = scanner.nextInt();
        String location = scanner.nextLine();
        String ISBN = scanner.nextLine();
          
        Book one = new Book( title,  author, type, location, ISBN, quantity, finePerDay,  len);
          if (librarian.authenticate(password)) 
            {
                System.out.println("\nLibrary.Librarian Menu:");
                System.out.println("1. Display items");
                System.out.println("2. Add new item");
                System.out.println("3. Remove item");
                System.out.println("4. Assign fine");
                System.out.println("5. Exit");

                int librarianChoice = scanner.nextInt();
                scanner.nextLine();

                if (librarianChoice == 1) 
                {
                        catalog.displayCatalog();
                }
                else if (librarianChoice == 2)
                {
                    librarian.addItem(db, one);
                    
                }
                else if (librarianChoice == 3)
                {
                    librarian.removeItem(db, ISBN);
                }
                else if ( librarianChoice == 4)
                {
                    librarian.assignFine(user, amount);
                }
                else if (librarianChoice == 5)
                {
                    
                }
        }
                else 
                {
                    System.out.println("Incorrect Password");
                }
            }
            else if ( userType == 3)
            {
                System.out.println("Exiting the System");
                    break;
            }

        scanner.close();
    }
}
}
}


// public class Library.Main
// {
    // public static void main(String [] args)
    // {
        
         // Library.Database database = new Library.Database();
        // Library.Catalog catalog = new Library.Catalog(database);
        // Library.Librarian librarian = new Library.Librarian(1056, 230, "424-480-5641", "Alice");
        // Library.Book a = new Library.Book("To Kill a Mockingbird", "Harper Lee", "Novel", "701 Silver Spur Rd, Rolling Hills Estates, CA 90274", "978-92-95055-02-5", 3, 2.50, 250);
        // Library.DVD b = new Library.DVD("Spider Man No Way Home", "Jon Watts", "Film", "701 Silver Spur Rd, Rolling Hills Estates, CA 90274", "978-0-596-52068-7", 5, 1.50, 100);
        // librarian.addItem(database, a);
        // librarian.addItem(database, b);
                // // Searching catalog
        // catalog.searchByTitle("Spider Man");
        // Date borrowDate = new GregorianCalendar(2025, 3, 5).getTime();
        // Date returnDate = new GregorianCalendar(2025, 3, 11).getTime();
        // // Removing an item
        // librarian.removeItem(database, "978-92-95055-02-5");

        // // Print updated catalog
        // // database.printCatalog();
        // Library.User2 user = new Library.User2(8694, "310-456-7891", "Oliver");
        // Library.Transaction transaction = new Library.Transaction(8694, "978-0-596-52068-7", borrowDate, returnDate);
        // System.out.println(transaction);
   