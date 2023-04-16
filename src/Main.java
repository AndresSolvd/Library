import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Create a Library Item
        LibraryItem p1 = new LibraryItem((short)123, true, "na", "na");
        System.out.println(p1.getAvailability());

        //create book
        Book book = new Book((short)001, true, "na", "na", "1984", "George Orwell", 1949, "Secker & Warburg", "Dystopian fiction");
        System.out.println(book.getAuthor());
        System.out.println(book.getAvailability());

        //create audiobook
        AudioBook audiobook = new AudioBook((short)002, true, "na", "na", "To Kill a Mockingbird", "Harper Lee", 1960, "J. B. Lippincott & Co", "Southern Gothic, Bildungsroman", 123456789);
        System.out.println(audiobook.getSn());
        System.out.println(audiobook.getAvailability());
        System.out.println(audiobook.getAuthor());

        //create CD
        CD cd = new CD((short)003, true, "na", "na", 112345678);
        System.out.println(cd.getSn());
        System.out.println(cd.getAvailability());
        System.out.println(cd.getDueDate());

        //Create Person
        Person person = new Person((short)001, "Oliver Atom", "932-934-2984", "oatom@email.com");
        System.out.println(person.getName());

        //Create Client

        Client client = new Client((short)002, "Kevin Mitnick", "849-342-0132", "kmitnick@email.com");
        System.out.println(client.getIdPerson());
        System.out.println(client.getName());
        System.out.println(client.getLoanedBookList());
        client.loanBook(book);
        System.out.println(client.getLoanedBookList());

        //create student with membership
        Student student = new Student((short)003, "Fernando Vargas", "123-234-5432", "fvargas@email.com", 99999);
        System.out.println(student.getStudentNumber());
        System.out.println(student.getIdPerson());
        System.out.println(student.getName());

        //Create Membership
        Membership membership = new Membership((short)002, "Bart Simpson", "475-849-3298", "bsimpson@email.com", 111111);
        System.out.println(membership.getMemberNumber());
        System.out.println(membership.getIdPerson());
        System.out.println(membership.getName());

        //create employee
        Employee employee = new Employee((short)003, "Vegeta Sayayin", "234-553-9813", "vegeta@email.com", "PrinceOfTheLibrary", 100000);
        System.out.println(employee.getPosition());
        System.out.println(employee.getIdPerson());
        System.out.println(employee.getName());

    }
}
