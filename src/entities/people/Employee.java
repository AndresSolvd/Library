package entities.people;

import exceptions.YearRangeException;
import interfaces.IWork;

import java.util.ArrayList;

public class Employee extends Person implements IWork {
    private String position;
    private double salary;

    public Employee(short personId, String name, String phone, String email, String position, double salary) {
        super(personId, name, phone, email);
        this.position = position;
        try {
            if (salary <= 0 | salary > 2147483647) {
                throw new YearRangeException("salary invalid value(values accepted: integers between 1 and 1.8 * 10^308)");
            } else {
                this.salary = salary;
            }
        } catch (YearRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "\nEmployee Name: " + super.getName() + "\nPosition: " + this.position + "\nSalary: " + this.salary + "\n";
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}