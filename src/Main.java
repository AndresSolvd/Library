public class Main {
    public static void main(String[] args) {
        //Create library
        Library library = new Library("Royal Library", "Stormwind Keep, Stormwind city, Azeroth", "Tuesdays to Sundays (09H00 to 17H00)");
        System.out.println(library.getName());
        System.out.println(library.getAddress());
        System.out.println(library.getWeekDaysTimeOpen());

        //Create a Library Item
        LibraryItem p1 = new LibraryItem((short)23, true, "na", "na");
        System.out.println(p1.getAvailability());

        //create book
        Book book = new Book((short)1, true, "na", "na", "1984", "George Orwell", 1949, "Secker & Warburg", "Dystopian fiction");
        System.out.println(book.getAuthor());
        System.out.println(book.getAvailability());

        //create audiobook
        AudioBook audiobook = new AudioBook((short)2, true, "na", "na", "To Kill a Mockingbird", "Harper Lee", 1960, "J. B. Lippincott & Co", "Southern Gothic, Bildungsroman", 123456789);
        System.out.println(audiobook.getSerialNumber());
        System.out.println(audiobook.getAvailability());
        System.out.println(audiobook.getAuthor());

        //create CD
        CD cd = new CD((short)3, true, "na", "na", 112345678);
        System.out.println(cd.getSerialNumber());
        System.out.println(cd.getAvailability());
        System.out.println(cd.getDueDate());

        //Create Person
        Person person = new Person((short)4, "Oliver Atom", "932-934-2984", "oatom@email.com");
        System.out.println(person.getName());

        //Create Client

        Client client = new Client((short)5, "Kevin Mitnick", "849-342-0132", "kmitnick@email.com", 111111);
        System.out.println(client.getPersonId());
        System.out.println(client.getProfessorNumber());
        System.out.println(client.getName());
        System.out.println(client.getLoanedBookList());
        client.loanBook(book);
        System.out.println(client.getLoanedBookList());

        //create student
        Student student = new Student((short)6, "Fernando Vargas", "123-234-5432", "fvargas@email.com", 222222, 9999);
        System.out.println(student.getStudentNumber());
        System.out.println(student.getPersonId());
        System.out.println(student.getName());

        //Create professor
        Professor professor = new Professor((short)7, "Bart Simpson", "475-849-3298", "bsimpson@email.com", 333333, 8888);
        System.out.println(professor.getProfessorNumber());
        System.out.println(professor.getPersonId());
        System.out.println(professor.getName());

        //create employee
        Employee employee = new Employee((short)8, "Vegeta Sayayin", "234-553-9813", "vegeta@email.com", "PrinceOfTheLibrary", 100000);
        System.out.println(employee.getPosition());
        System.out.println(employee.getPersonId());
        System.out.println(employee.getName());
    }
}
