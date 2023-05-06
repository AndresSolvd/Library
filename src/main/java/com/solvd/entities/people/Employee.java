package com.solvd.entities.people;

import com.solvd.exceptions.SalaryRangeException;
import com.solvd.interfaces.IWork;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee extends Person implements IWork {
    private static final Logger LOGGER = LogManager.getLogger(Person.class);
    private String position;
    private double salary;

    public Employee(short personId, String name, String phone, String email, String position, double salary) {
        super(personId, name, phone, email);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmployee Name: " + super.getName() + "\nPosition: " + this.position + "\nSalary: " + this.salary + "\n";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // Validate salary
        try {
            if (salary <= 0 | salary > 2147483647) {
                throw new SalaryRangeException("salary invalid value(values accepted: integers between 1 and 1.8 * 10^308)");
            } else {
                this.salary = salary;
            }
        } catch (SalaryRangeException e) {
            LOGGER.info(e.getMessage());
        }
    }
}