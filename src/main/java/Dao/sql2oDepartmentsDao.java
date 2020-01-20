package Dao;

import models.Departments;
import models.Employees;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.ArrayList;
import java.util.List;

public class sql2oDepartmentsDao implements DepartmentsDao {
    private final Sql2o sql2o;
    public sql2oDepartmentsDao (Sql2o sql2o) {this.sql2o = sql2o; }

    @Override
    public void add(Departments departments) {
        String sql = "INSERT INTO departments( department_name, department_description, number_of_employees) VALUES (:department_name :department_description :number_of_employees)";
        try(Connection con  = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .bind(departments)
                    .executeUpdate()
                    .getKey();
            departments.setId(id);
        }catch (Sql2oException ex) {
    System.out.println(ex);
        }
    }

    public List<Departments> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM departments")
                    .executeAndFetch(Departments.class);
        }
    }

    @Override
    public void  addDepartmentsToEmployees(Departments departments, Employees employees) {

    }

    @Override
    public List <Employees> GetAllEmployees (int employees_id) {
        List <Employees> employees = new ArrayList<>();
        return employees;
    }
   /* @Override
    public List<Departments> getAllDepartmentsByDepartments(int departments_name) {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM reviews WHERE departments_name = :departments_name")
                    .addParameter("departments_name", departments_name)
                    .executeAndFetch(Departments.class);
        }
    }*/

    @Override
    public void deleteByDepartment_id(int department_id) {
        String sql = "DELETE from departments WHERE department_id=:department_id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("department_id", department_id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void clearAll() {
        String sql = "DELETE from departments";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }
}
