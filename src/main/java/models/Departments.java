package models;

public class Departments {

    private String department_name;
    private String department_description;
    private int number_of_employees;
    /*Department name, description, number of employees, */

    public Departments(String department_name, String department_description, int number_of_employees) {
        this.department_name = department_name;
        this.department_description = department_description;
        this.number_of_employees = number_of_employees;
    }
}
