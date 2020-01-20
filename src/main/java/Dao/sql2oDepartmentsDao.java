package Dao;

import models.Departments;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;
import java.util.List;

public class sql2oDepartmentDao {
    private final Sql2o sql2o;
    public sql2oDepartmentDao (Sql2o sql2o) {this.sql2o = sql2o;}
}
