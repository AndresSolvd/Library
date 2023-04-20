import entities.libraryitems.AudioBook;
import entities.libraryitems.Book;
import entities.libraryitems.CD;
import entities.libraryitems.LibraryItem;
import entities.people.Client;
import entities.people.Employee;
import entities.people.Professor;
import entities.people.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n---BEGIN OF SCRIPT---\n\n");
        //1 Create library
        System.out.println("--1 Create Library--");
        Library library = new Library("Royal Library", "Stormwind Keep, Stormwind city, Azeroth", "Tuesdays to Sundays (09H00 to 17H00)");
        System.out.println(library.getName());
        System.out.println(library.getAddress());
        System.out.println(library.getWeekDaysTimeOpen());

        //2 create book
        System.out.println("\n\n--2 Create Items(entities.libraryitems.Book, entities.libraryitems.AudioBook, and entities.libraryitems.CD--");
        Book book = new Book((short)1, true, "na", "na", "1984", "George Orwell", 1949, "Secker & Warburg", "Dystopian fiction");
        Book book2 = new Book((short)1, true, "na", "na", "1984", "George Orwell", 1949, "Secker & Warburg", "Dystopian fiction");
        System.out.println(book.getAuthor());
        System.out.println(book.getAvailability());

        //create audiobook
        AudioBook audiobook = new AudioBook((short)2, true, "na", "na", "To Kill a Mockingbird", "Harper Lee", 1960, "J. B. Lippincott & Co", "Southern Gothic, Bildungsroman", 123456789);
        AudioBook audiobook2 = new AudioBook((short)2, true, "na", "na", "To Kill a Mockingbird", "Harper Lee", 1960, "J. B. Lippincott & Co", "Southern Gothic, Bildungsroman", 123456789);System.out.println(audiobook.getSerialNumber());
        System.out.println(audiobook.getAvailability());
        System.out.println(audiobook.getAuthor());

        //create entities.libraryitems.CD
        CD cd = new CD((short)3, true, "na", "na", 112345678);
        CD cd2 = new CD((short)3, true, "na", "na", 112345678);
        System.out.println(cd.getSerialNumber());
        System.out.println(cd.getAvailability());
        System.out.println(cd.getDueDate());

        //3 add all previous items to inventory
        System.out.println("\n\n--3 Add items to the inventory and print it--");
        library.add(book);
        library.add(book2);
        library.add(audiobook);
        library.add(audiobook2);
        library.add(cd);
        library.add(cd2);
        library.printInventory();

        //4 Create Clients
        System.out.println("\n\n--4 CLIENTS INFO AND FUNCTIONS TEST--");
        Client client = new Client((short)5, "Kevin Mitnick", "849-342-0132", "kmitnick@email.com", 111111);
        Client client2 = new Client((short)5, "Kevin Mitnick", "849-342-0132", "kmitnick@email.com", 111111);
        System.out.println(client.getPersonId());
        System.out.println(client.getMemberNumber());
        System.out.println(client.getName());
        System.out.println(client.getLoanedBookList());
        client.loanBook(book);
        client.loanBook(cd);
        client.loanBook(audiobook);
        client.loanBook(book);
        System.out.println();
        for (LibraryItem item : client.getLoanedBookList()) {
            System.out.println(item);
        }
        System.out.println("\n--5 Return entities.libraryitems.Book--");
        //return book
        client.returnBook(book);
        client.returnBook(book);
        System.out.println();
        for (LibraryItem item : client.getLoanedBookList()) {
            System.out.println(item);
        }

        //6 create student
        System.out.println("\n\n--6 Create STUDENT and see info--");
        Student student = new Student((short)6, "Fernando Vargas", "123-234-5432", "fvargas@email.com", 222222, 9999);
        System.out.println(student.getStudentCredentialNumber());
        System.out.println(student.getPersonId());
        System.out.println(student.getName());

        //7 Create professor
        System.out.println("\n\n--7 Create PROFESSOR and see info--");
        Professor professor = new Professor((short)7, "Bart Simpson", "475-849-3298", "bsimpson@email.com", 333333, 8888);
        System.out.println(professor.getMemberNumber());
        System.out.println(professor.getPersonId());
        System.out.println(professor.getName());

        //8 Create employee
        System.out.println("\n\n--8 Create EMPLOYEE and see info--");
        Employee employee = new Employee((short)8, "Vegeta Sayayin", "234-553-9813", "vegeta@email.com", "PrinceOfTheLibrary", 100000);
        Employee employee2 = new Employee((short)8, "Vegeta Sayayin", "234-553-9813", "vegeta@email.com", "PrinceOfTheLibrary", 100000);
        System.out.println(employee.getPosition());
        System.out.println(employee.getPersonId());
        System.out.println(employee.getName());

        // 9 Add persons to the directory and print it
        System.out.println("\n\n--9 Add individuals to Directory and Print Directory--");
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
