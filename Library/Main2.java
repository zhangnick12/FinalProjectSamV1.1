package Library;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Database db = new Database();
        Catalog catalog = new Catalog();
        Item Mockingbird = new Book("To Kill a Mockingbird", "Harper Lee", "Novel", "701 Silver Spur Rd, Rolling Hills Estates, CA 90274", "978-92-95055-02-5", 3, 2.50, 250);
        Item Spiderman = new DVD("Spider Man No Way Home", "Jon Watts", "Film", "701 Silver Spur Rd, Rolling Hills Estates, CA 90274", "978-0-596-52068-7", 5, 1.50, 100);
        Librarian librarian = new Librarian(123, "456","424-480-5641", "Alice");
        librarian.addItem(db, Mockingbird);
        librarian.addItem(db, Spiderman);
        Scanner scanner = new Scanner(System.in);
        User2 user1 = new User2(1234, 1234, "310-456-7891", "Oliver");

        while (true){
            System.out.println("Are you a (1) Member" +
                    " or (2) Library.Librarian? " +
                    "(Enter 3 to Exit)");
            int type = scanner.nextInt();
            if (type == 1){
                System.out.println(
                        "1. Search for items" +
                        "\n2. Borrow item" +
                        "\n3. Return item" +
                        "\n4. Display Items" +
                        "\n5. Exit");

                switch (scanner.nextInt()){
                    case 1:
                        System.out.print("Enter Title to search: ");
                        String title = scanner.next();
                        catalog.searchByTitle(title);
                        break;
                    case 2:
                        System.out.print("Enter item title to borrow: ");
                        String borrowTitle = scanner.next();
                        for (Item item : catalog.items) {
                            if (item.getTitle().equalsIgnoreCase(borrowTitle) && item.isAvailable()) {
                                user1.borrowItem(item);
                                System.out.println("Library.Item borrowed: " + item);
                                break;
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter Title of the item you want to return: ");
                        String curTitle = scanner.nextLine();
                        Item item = catalog.findItemByTitle(curTitle);
                        String ISBN = scanner.nextLine();
                        if (item != null && !item.isAvailable())
                        {
                            user1.returnItem(ISBN);
                            System.out.println("You returned: " + item.getTitle());
                        }
                        else
                        {
                            System.out.println("Library.Item not found or not borrowed.");
                        }
                        break;
                }



            } else if (type == 2) {
//                System.out.println("Enter Password");
//                String password = scanner.nextLine();
//                if (librarian.authenticate(password))
//                {
                if (true)
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
                        break;
                    }
                    else if (librarianChoice == 2)
                    {
                        System.out.println("Enter title");
                        String title = scanner.nextLine();
                        System.out.println("Enter author");
                        String author = scanner.nextLine();
                        System.out.println("Enter type");
                        String typeItem = scanner.nextLine();
                        String location = "701 Silver Spur Rd, Rolling Hills Estates, CA 90274";
                        System.out.println("Enter ISBN");
                        String ISBN = scanner.nextLine();
                        System.out.println("Enter quantity");
                        int quant = scanner.nextInt();
                        System.out.println("Enter fine per day");
                        double finePerDay = scanner.nextDouble();
                        System.out.println("Enter length");
                        int length = scanner.nextInt();

                        librarian.addItem(db, new Book(title, author, typeItem, location, ISBN, quant, finePerDay, length));
                        break;

                    }
                    else if (librarianChoice == 3)
                    {
                        System.out.println("Enter ISBN");
                        String ISBN = scanner.nextLine();
                        librarian.removeItem(db, ISBN);
                        break;
                    }
                    else if ( librarianChoice == 4)
                    {
                        librarian.assignFine(user1, 2.5);
                        break;
                    }
                    else if (librarianChoice == 5)
                    {
                        break;
                    }
                }
            } else if (type == 3) {
                break;

            }
        }

    }
}
