import entities.libraryitems.*;
import entities.people.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n----- BEGIN OF THE SCRIPT -----\n\n");

        // 1 Create library
        System.out.println("--- 1 LIBRARY ---\n");
        Library library = new Library("Tuesdays to Sundays (09H00 to 17H00)");
        System.out.println("Library Name: " + library.getName());
        System.out.println("Library Address: " + library.getAddress());
        System.out.println("Library Schedule: " + library.getWeekDaysTimeOpen());

        // 2 Create Library Items
        System.out.println("\n\n--- 2 LIBRARY ITEMS ---\n");

        // 2.1 Create book
        System.out.println("\n-- 2.1 Book --");
        Book book = new Book((short)1, true, "na", "na", "1984", "George Orwell", 1949, "Secker & Warburg", "Dystopian fiction");
        Book book2 = new Book((short)1, true, "na", "na", "1984", "George Orwell", 1949, "Secker & Warburg", "Dystopian fiction");
        System.out.println("AudioBook Name: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Availability: " + book.getAvailability());

        // 2.2 Create audiobook
        System.out.println("\n-- 2.2 AudioBook --");
        AudioBook audiobook = new AudioBook((short)2, true, "na", "na", "To Kill a Mockingbird", "Harper Lee", 1960, "J. B. Lippincott & Co", "Southern Gothic, Bildungsroman", 123456789);
        AudioBook audiobook2 = new AudioBook((short)2, true, "na", "na", "To Kill a Mockingbird", "Harper Lee", 1960, "J. B. Lippincott & Co", "Southern Gothic, Bildungsroman", 123456789);System.out.println(audiobook.getSerialNumber());
        System.out.println("AudioBook Name: " + audiobook.getTitle());
        System.out.println("AudioBook Author: " + audiobook.getAuthor());
        System.out.println("AudioBook Availability: " + audiobook.getAvailability());

        // 2.3 Create CD
        System.out.println("\n-- 2.3 CD --");
        CD cd = new CD((short)3, true, "na", "na", 112345678);
        CD cd2 = new CD((short)3, true, "na", "na", 112345678);
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
        library.printInventory();

        // 3 Create Persons
        System.out.println("\n\n--- 3 PERSON---\n");

        //3.1 Create Client twice
        System.out.println("\n-- 3.1 Clients --");
        Client client = new Client((short)5, "Kevin Mitnick", "849-342-0132", "kmitnick@email.com", 111111);
        Client client2 = new Client((short)5, "Kevin Mitnick", "849-342-0132", "kmitnick@email.com", 111111);
        System.out.println("Client name: " + client.getName());
        System.out.println("ID: " + client.getPersonId());
        System.out.println("Membership Number: " + client.getMemberNumber());
        System.out.println("Client Loaned Items:\n" + client.getLoanedBookList());

        // Client loaned all items and try to loan an unavailable item
        System.out.println("\n-- Client attempt to loan a book, audiobook, CD and the same book again --");
        client.loanBook(book);
        client.loanBook(cd);
        client.loanBook(audiobook);
        client.loanBook(book);
        // Print loaned items by client
        System.out.println("\n-- Print Loaned items by client --");
        for (LibraryItem item : client.getLoanedBookList()) {
            System.out.println(item);
        }

        // Client return book
        System.out.println("\n-- Client return book --");
        client.returnBook(book);
        client.returnBook(book);
        // Print loaned items by client
        System.out.println("\n-- Print Loaned items by client --");
        for (LibraryItem item : client.getLoanedBookList()) {
            System.out.println(item);
        }

        //3.2 create student
        System.out.println("\n-- 3.2 Student --");
        Student student = new Student((short)6, "Fernando Vargas", "123-234-5432", "fvargas@email.com", 222222, 9999);
        System.out.println("Student Name: " + student.getName());
        System.out.println("ID: " + student.getPersonId());
        System.out.println("Membership Number: " + student.getMemberNumber());
        System.out.println("Student Credential: " + student.getStudentCredentialNumber());

        //3.3 Create professor
        System.out.println("\n-- 3.3 Professor --");
        Professor professor = new Professor((short)7, "Bart Simpson", "475-849-3298", "bsimpson@email.com", 333333, 8888);
        System.out.println("Professor Name: " + professor.getName());
        System.out.println("ID: " + professor.getPersonId());
        System.out.println("Membership Number: " + professor.getMemberNumber());
        System.out.println("Professor Credential: " + professor.getMemberNumber());

        //3.4 Create employee twice
        System.out.println("\n-- 3.4 Employee --");
        Employee employee = new Employee((short)8, "Vegeta Sayayin", "234-553-9813", "vegeta@email.com", "PrinceOfTheLibrary", 100000);
        Employee employee2 = new Employee((short)8, "Vegeta Sayayin", "234-553-9813", "vegeta@email.com", "PrinceOfTheLibrary", 100000);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("ID: " + employee.getPersonId());
        System.out.println("Employee position: " + employee.getPosition());
        System.out.println("Employee salary: " + employee.getSalary());

        // 3.5 Add persons to Directory and print it
        System.out.println("\n-- 3.5 Directory --");
        library.add(client);
        library.add(client2);
        library.add(student);
        library.add(professor);
        library.add(employee);
        library.add(employee2);
        library.printDirectory();

        System.out.println("--- El Fin -- 結束 -- La Fin -- Кінець -- Das Ende -- The End  -- La Fine -- O Fim -- 終わり ---");
    }
}
