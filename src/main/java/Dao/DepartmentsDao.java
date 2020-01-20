package Dao;

import models.Departments;
import models.Employees;

import java.util.List;

public interface DepartmentsDao {
    //create
    void add(Departments departments);
    void addDepartmentsToEmployees(Departments departments, Employees employees);

    //read
    List<Departments> getAll();
    List<Employees>GetAllEmployees(int empoleyees_id);

    //update
    //void update(String department_name, String department_description, int number_of_employees);

    //delete
    void deleteByDepartment_id(int department_id);
    void clearAll();
}
