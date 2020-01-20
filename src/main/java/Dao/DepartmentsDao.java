package Dao;

import models.Departments;
import java.util.List;

public interface DepartmentsDao {
    //create
    void add(Departments departments);

    //read
    List<Departments> getAll();


    //update
    //void update(String department_name, String department_description, int number_of_employees);

    //delete
    void deleteByDepartment_id(int department_id);
    void clearAll();
}
