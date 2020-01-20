package Dao;

import models.Employees;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;
import java.util.List;

public class sql2oEmployeesDao {
    private final Sql2o sql2o;
    public sql2oEmployeesDao (Sql2o sql2o) {this.sql2o = sql2o; }

    @Override
    public void add(Employees employees) {
        String sql = "INSERT INTO employees( employee_name, position_in_company, employee_id, role, department) VALUES (:employee_name :position_in_company :employee_id :role :department)";
        try(Connection con  = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .bind(employees)
                    .executeUpdate()
                    .getKey();
            employees.setId(id);
        }catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    public List<Employees> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM employees")
                    .executeAndFetch(Employees.class);
        }
    }

    @Override
    public List<Employees> getAllEmployeesByDepartments(int employees_Id) {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM employees WHERE employees_Id = :employees_Id")
                    .addParameter("employees_Id", employees_Id)
                    .executeAndFetch(Employees.class);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE from employees WHERE id=:id";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void clearAll() {
        String sql = "DELETE from employees";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql).executeUpdate();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }
}
