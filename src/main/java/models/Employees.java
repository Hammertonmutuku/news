package models;

public class Employees {
    /* employee name, position in company , role, department */
    private String employee_name;
    private String position_in_company;
    private int employee_id;
    private String role;
    private String department;

    public Employees(String employee_name, String position_in_company,int employee_id, String role, String department) {
        this.employee_name = employee_name;
        this.position_in_company = position_in_company;
        this.employee_id = employee_id;
        this.role = role;
        this.department = department;
    }
}
