package Dao;

import models.Employees;

import java.util.List;

public interface EmployeesDao {
    //create
    void add(Employees employees);

    //read
    List<Employees> getAll();


    //update
   // void update(String employees_name, String position_in_company, int employee_id, String role, String department );

    //delete
    void deleteByEmployee_id(int employee_id);
    void clearAll();
}

