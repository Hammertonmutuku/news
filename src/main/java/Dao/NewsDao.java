package Dao;

import models.News;

import java.util.List;

public interface NewsDao {
    //create
    void add(News news);

    //read
    List<News> getAll();


    //update
    void update(String general_news, String department_news);

    //delete
    void deleteByEmployee_id(int employee_id);
    void clearAll();
}
