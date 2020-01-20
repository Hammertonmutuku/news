package models;

public class News {
    /* name, position in the company, their roles;  */
    private String general_news;
    private String department_news;


    public News(String general_news, String department_news) {
        this.general_news = general_news;
        this.department_news = department_news;
    }

    public News(String department_news) {
        this.department_news = department_news;
    }
}
