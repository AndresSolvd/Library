package com.solvd;

import com.solvd.entities.Library;
import com.solvd.entities.libraryitems.AudioBook;
import com.solvd.entities.libraryitems.Book;
import com.solvd.entities.libraryitems.CD;
import com.solvd.entities.libraryitems.LibraryItem;
import com.solvd.entities.people.*;
import com.solvd.enums.Genre;
import com.solvd.enums.Language;
import com.solvd.exceptions.BooleanException;
import com.solvd.exceptions.IdRangeException;
import com.solvd.exceptions.YearRangeException;
import com.solvd.interfaces.IGetBooksByGenre;
import com.solvd.interfaces.INewestBookFinder;
import com.solvd.interfaces.IOldestBookFinder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    static {
        System.out.println("\n\n*******************************************************************************************************************************************************************************************\nI don't have any idea for a reason to use this feature unless I need to load a Database before loading this program. If so, I will change this when I get to that part of the course\n*******************************************************************************************************************************************************************************************\n");
    }

    public static void askItemAvailability(LibraryItem item) throws BooleanException {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Is Book available? (yes/no):");
            String answer = scan.next();

            if (answer.equals("yes")) {
                item.setAvailability(true);
            } else if (answer.equals("no")) {
                item.setAvailability(false);
            } else {
                throw new BooleanException("Invalid option: type \"yes\" or \"no\"");
            }
        } catch (BooleanException e) {
            LOGGER.info(e.getMessage());
            askItemAvailability(item);
        }
    }

    public static String askUserToSeeInventory() {
        //validate answer
        String answer;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nWould you like to see the current Inventory?");
            answer = scan.next();
            if (answer.equals("yes") || answer.equals("no")) {
                return answer;
            } else {
                throw new IdRangeException("Invalid option: type \"yes\" or \"no\"");
            }
        } catch (IdRangeException e) {
            LOGGER.info(e.getMessage());
            return askUserToSeeInventory();
        }
    }

    public static void main(String[] args) throws BooleanException, YearRangeException, IOException {
        System.out.println("\n----- BEGIN OF THE SCRIPT -----\n");

        // 1 Create library
        System.out.println("--- 1 LIBRARY ---\n");
        Library library = new Library("Royal Library", "Stormwind Keep, Stormwind city, Azeroth");
        System.out.println("Library Name: " + library.getLibraryName());
        System.out.println("Library Address: " + library.getAddress());
        //Change library name and print new
        System.out.println("\nChange Library name and address");
        library.setLibraryName("Harry Library");
        System.out.println("Library Name: " + library.getLibraryName());
        //Change library address and print new
        library.setAddress("4 Privet Drive, Little Whinging, Surrey, England, Great Britain");
        System.out.println("Library Address: " + library.getAddress());

        // 2 Create Library Items
        System.out.println("\n\n--- 2 LIBRARY ITEMS ---\n");

        // 2.1 Create book
        System.out.println("\n-- 2.1 Book --");
        Book book = new Book((short) 1, "1984", true, "na", "na", "1984",
                "George Orwell", 1949, "Secker & Warburg",
                Genre.DYSTOPIAN_FICTION, Language.ENGLISH);
        Book book2 = new Book((short) 1, "1984", true, "na", "na", "1984",
                "George Orwell", 1949, "Secker & Warburg",
                Genre.DYSTOPIAN_FICTION, Language.ENGLISH);
        System.out.println("AudioBook Name: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Availability: " + book.getAvailability());

        // 2.2 Create audiobook
        System.out.println("\n-- 2.2 AudioBook --");
        AudioBook audiobook = new AudioBook((short) 2, "To Kill a Mockingbird", true, "na",
                "na", "To Kill a Mockingbird", "Harper Lee", 1960,
                "J. B. Lippincott & Co", Genre.SOUTHERN_GOTHIC, Language.ENGLISH, 123456789);
        AudioBook audiobook2 = new AudioBook((short) 2, "To Kill a Mockingbird", true, "na",
                "na", "To Kill a Mockingbird", "Harper Lee", 1960,
                "J. B. Lippincott & Co", Genre.SOUTHERN_GOTHIC, Language.ENGLISH, 123456789);
        System.out.println(audiobook.getSerialNumber());
        System.out.println("AudioBook Name: " + audiobook.getTitle());
        System.out.println("AudioBook Author: " + audiobook.getAuthor());
        System.out.println("AudioBook Availability: " + audiobook.getAvailability());

        // 2.3 Create CD
        System.out.println("\n-- 2.3 CD --");
        CD cd = new CD((short) 3, "Canon and Gigue in D major, P.37 (Pachelbel, Johann)",
                "Music", true, "na", "na", 112345678);
        CD cd2 = new CD((short) 3, "Canon and Gigue in D major, P.37 (Pachelbel, Johann)",
                "Music", true, "na", "na", 112345678);
        CD cd3 = new CD((short) 4, "Twenty Thousand Leagues Under the Sea \"Jules Verne\"",
                "eBook", true, "na", "na", 112302878);
        System.out.println("CD Serial Number: " + cd.getSerialNumber());
        System.out.println("CD availability: " + cd.getAvailability());
        System.out.println("CD Due Date: " + cd.getDueDate());

        // 2.4 Add items to inventory and print it
        System.out.println("\n-- 2.4 Inventory --");
        library.add(book);
        library.add(book2);
        library.add(audiobook);
        library.add(audiobook2);
        library.add(cd);
        library.add(cd2);
        library.add(cd3);
        library.printInventory();

        // 3 Create Persons
        System.out.println("\n\n--- 3 PERSON---\n");

        //3.1 Create Client twice
        System.out.println("\n-- 3.1 Clients --");
        Client client = new Client((short) 5, "Kevin Mitnick", "849-342-0132",
                "kmitnick@email.com", 111111);
        Client client2 = new Client((short) 5, "Kevin Mitnick", "849-342-0132",
                "kmitnick@email.com", 111111);
        System.out.println("Client name: " + client.getName());
        System.out.println("ID: " + client.getPersonId());
        System.out.println("Membership Number: " + client.getMemberNumber());
        System.out.println("Client Loaned Items:\n" + client.getLoanedBookList());

        // Client loaned all items and try to loan an unavailable item
        System.out.println("\n-- Client attempt to loan a book, audiobook, CD and the same book again --");
        client.loanBook(client, book);
        client.loanBook(client, cd);
        client.loanBook(client, audiobook);
        client.loanBook(client, book);
        // Print loaned items by client
        System.out.println("\n-- Print Loaned items by client --");
        for (LibraryItem item : client.getLoanedBookList()) {
            System.out.println(item);
        }

        // Client return book
        System.out.println("\n-- Client return book --");
        client.returnBook(client, book);
        client.returnBook(client, book);
        // Print loaned items by client
        System.out.println("\n-- Print Loaned items by client --");
        for (LibraryItem item : client.getLoanedBookList()) {
            System.out.println(item);
        }

        //3.2 create same student twice
        System.out.println("\n-- 3.2 Student --");
        Student student = new Student((short) 6, "Fernando Vargas", "123-234-5432",
                "fvargas@email.com", 222222, 9999);
        Student student2 = new Student((short) 6, "Fernando Vargas", "123-234-5432",
                "fvargas@email.com", 222222, 9999);
        System.out.println("Student Name: " + student.getName());
        System.out.println("ID: " + student.getPersonId());
        System.out.println("Membership Number: " + student.getMemberNumber());
        System.out.println("Student Credential: " + student.getStudentCredentialNumber());

        //3.3 Create same professor twice
        System.out.println("\n-- 3.3 Professor --");
        Professor professor = new Professor((short) 7, "Bart Simpson", "475-849-3298",
                "bsimpson@email.com", 333333, 8888);
        Professor professor2 = new Professor((short) 7, "Bart Simpson", "475-849-3298",
                "bsimpson@email.com", 333333, 8888);
        System.out.println("Professor Name: " + professor.getName());
        System.out.println("ID: " + professor.getPersonId());
        System.out.println("Membership Number: " + professor.getMemberNumber());
        System.out.println("Professor Credential: " + professor.getMemberNumber());

        //3.4 Create same employee twice
        System.out.println("\n-- 3.4 Employee --");
        Employee employee = new Employee((short) 8, "Vegeta Sayayin", "234-553-9813",
                "vegeta@email.com", "PrinceOfTheLibrary", 100000);
        Employee employee2 = new Employee((short) 8, "Vegeta Sayayin", "234-553-9813",
                "vegeta@email.com", "PrinceOfTheLibrary", 100000);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("ID: " + employee.getPersonId());
        System.out.println("Employee position: " + employee.getPosition());
        System.out.println("Employee salary: " + employee.getSalary());

        // 3.5 Add persons to Directory and print it
        System.out.println("\n-- 3.5 Directory --");
        library.add(client);
        library.add(client2);
        library.add(student);
        library.add(student2);
        library.add(professor);
        library.add(professor2);
        library.add(employee);
        library.add(employee2);
        library.printDirectory();

        // 4 INTERFACES
        System.out.println("\n\n--- 4 INTERFACES ---\n");

        //Use Iwork interface
        System.out.println("\n-- 4.1 IWork, employee actions --");
        employee.cleanLibrary();
        employee.loanItem();
        employee.receiveItem();
        employee.makeInventory();

        //Use IAudio interface
        System.out.println("\n-- 4.2 IAudio, listening actions --");
        System.out.println(client.getName() + audiobook.listen() + audiobook.title);
        System.out.println(student.getName() + cd.listen() + cd.getName());
        System.out.println(professor.getName() + cd.listen() + cd3.getName());

        //Use IRead interface
        System.out.println("\n-- 4.2 IRead, reading actions --");
        System.out.println(client.getName() + book.read() + book.title);
        System.out.println(employee.getName() + cd3.read() + cd3.getName());

        // 5 Number of attempts to enter persons and items on respectively arrays
        System.out.println("\n\n--- 5 ATTEMPTS COUNT ---\n");
        LibraryItem.activity();
        Person.activity();

        // 6 Interfaces test
        System.out.println("\n\n--- 6 INTERFACE TEST ---\n");
        professor.returnBook(professor, book);
        Library.printBorrowedItems();

        professor.loanBook(professor, book);
        Library.printBorrowedItems();

        // 7 test exception handler
        System.out.println("\n\n--- 7 EXCEPTIONS ---\n");
        Book book4 = new Book((short) -1, "1984", true, "na", "na", "1984",
                "George Orwell", -4000, "Secker & Warburg", Genre.DYSTOPIAN_FICTION,
                Language.ENGLISH);
        Book book5 = new Book((short) 40000, "1984", true, "na", "na", "1984",
                "George Orwell", 6000, "Secker & Warburg", Genre.DYSTOPIAN_FICTION,
                Language.ENGLISH);
        Client client3 = new Client((short) -1, "Kevin Mitnick", "849-342-0132",
                "kmitnick@email.com", 100000045);
        Student student3 = new Student((short) 4000, "Fernando Vargas", "123-234-5432",
                "fvargas@email.com", -35, -32);
        Professor professor3 = new Professor((short) -1, "Bart Simpson", "475-849-3298",
                "bsimpson@email.com", -1, -4534);
        Employee employee3 = new Employee((short) -34, "Vegeta Sayayin", "234-553-9813",
                "vegeta@email.com", "PrinceOfTheLibrary", -40);

        client3.setPersonId((short) -4);
        book4.setItemId((short) -98);
        professor3.setProfessorCredentialNumber(-3242);
        student3.setStudentCredentialNumber(-32432);
        client3.setMemberNumber(-35234);
        employee3.setSalary(-234.23);

        // set book year 2045
        book.setYear(2045);

        // set book year -1000
        book.setYear(-1000);

        // Test UniqueWordCounter
        System.out.println("\n\n--- 8 UNIQUE WORD COUNT ---\n");
        UniqueWordCounter.uniqueWordCounter();
        System.out.println("Look for the output.txt file in resources");

        // Test Enum
        System.out.println("\n\n--- 9 TEST ENUM ---\n");
        // Test Schedule
        System.out.println("\n-- 9.1 Test Schedule enum --");
        library.schedule(); //Call a method from library to print all the Fixed schedule in the enum class
        // Test LibrarySection
        System.out.println("\n-- 9.2 Test LibrarySection enum --");
        library.sections(); //Call a method from library to print all the Fixed sections in the enum class
        // Test LibraryEvents
        System.out.println("\n-- 9.3 Test LibraryEvents enum --");
        library.events();
        System.out.println("\n-- 9.4 Test Language enum --");
        System.out.println(book.getLanguage()); //Call Method from Book to print the object's language limited to
        // ones in the enum class
        System.out.println("\n-- 9.2 Test Genre enum --");
        System.out.println(book.getGenre()); //Call Method from Book to print the object's genre limited to ones
        // in the enum class

        // Test lambda Functions
        System.out.println("\n\n--- 10 LAMBDA FROM JAVA.UTIL.FUNCTION ---\n");

        // Predicate - Gets the book's availability
        System.out.println("\n-- 10.1 Predicate --");
        Predicate<LibraryItem> isAvailable = item -> item.getAvailability();
        System.out.println(isAvailable.test(book) ? "The book " + book.getName() + " is available" : "The book '"
                + book.getName() + "' is not available");

        // Function - Gets the book's author
        System.out.println("\n-- 10.2 Function --");
        Function<Book, String> getAuthorName = Book::getAuthor;
        System.out.println("Book author name: " + getAuthorName.apply(book));

        // Consumer - Gets the book's title
        System.out.println("\n-- 10.3 Consumer --");
        Consumer<Book> printTitle = item -> System.out.println("Book Title: " + item.getTitle());
        printTitle.accept(audiobook);

        // Supplier - Adds a new book and prints a message with the title
        System.out.println("\n-- 10.4 Supplier --");
        Supplier<Book> bookSupplier = () -> new Book((short) 1, "Animal Farm", true, "na",
                "na", "Animal Farm", "The joker", 2023, "NoOneReally",
                Genre.FICTION, Language.ENGLISH);
        Book newBook = bookSupplier.get();
        System.out.println("New book: " + newBook.getTitle());

        //IntPredicate
        System.out.println("\n-- 10.4 IntPredicate --");
        IntPredicate isOld = year -> year / 100 < 19;
        int year = book.year;
        if (isOld.test(year)) {
            System.out.println(book.title + " --> This is an old book from before the 20th century.");
        } else {
            System.out.println(book.title + " --> This book was written over a period spanning the 20th and 21st " +
                    "centuries.");
        }

        // Lambda generics
        System.out.println("\n\n--- 11 LAMBDA GENERICS ---\n");

        // IOldestBookFinder - Find the oldest book
        System.out.println("\n-- 11.1 IOldestBookFinder --");
        IOldestBookFinder iOldestBookFinder = () -> {
            System.out.println(library.returnInventory().toList().stream().
                    filter(item -> item instanceof Book).map(item -> (Book) item)
                    .map(e -> e.getYear() + " - " + e.getName() + " (ID: " + e.getItemId() + ")")
                    .max(Comparator.naturalOrder()).orElse("No book Found"));
        };
        iOldestBookFinder.iOldestBookFinder();

        // IOldestBookFinder - Find the newest book
        System.out.println("\n-- 11.2 INewestBookFinder --");
        INewestBookFinder iNewestBookFinder = () -> {
            System.out.println(library.returnInventory().toList().stream().
                    filter(item -> item instanceof Book).map(item -> (Book) item)
                    .map(e -> e.getYear() + " - " + e.getName() + " (ID: " + e.getItemId() + ")")
                    .min(Comparator.naturalOrder()).orElse("No book Found"));
        };
        iNewestBookFinder.iNewestBookFinder();

        // IGetBooksByGenre - List all the Books from a genre
        System.out.println("\n-- 11.3 IGetBooksByGenre --");
        IGetBooksByGenre IgetBooksByGenre = (Genre genre) -> {
            System.out.println(genre+ ":");
            library.returnInventory().toList().stream()
                    .filter(item -> item instanceof Book).map(item -> (Book) item)
                    .filter(e -> e.getGenre().toString().equalsIgnoreCase(genre.toString()))
                    .collect(Collectors.toList()).forEach(printTitle);
        };
        IgetBooksByGenre.iGetBooksByGenre(Genre.SOUTHERN_GOTHIC);

        // ASK USER FOR
        System.out.println("\n\n--- 12 ASK USER AVAILABILITY OR INVENTORY ---\n");
        // Prompt user to update availability of book
        askItemAvailability(book);
        System.out.println("current book Availability: " + book.getAvailability());

        // Prompt user option to query current Inventory
        if (askUserToSeeInventory().equals("yes")) {
            library.printInventory();
        } else {
            System.out.println("This is the end, my only friend, the end");
        }

        System.out.println("\n\n--- El Fin -- 結束 -- La Fin -- Кінець -- Das Ende -- The End  -- La Fine -- O Fim " + "-- 終わり ---");
    }
}