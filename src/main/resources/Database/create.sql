SET MODE PostgreSQL;



CREATE TABLE IF NOT EXISTS Departments (

 department_name VARCHAR;
 department_description VARCHAR;
 department_id int;
 number_of_employees int;
 id int;
);

CREATE TABLE IF NOT EXISTS Employees (
 employee_name VARCHAR;
 position_in_company VARCHAR;
 employee_id int;
 role VARCHAR;
 department VARCHAR;
 id int
 );

CREATE TABLE IF NOT EXISTS Departments_employee (
id int PRIMARY KEY auto_increment,
department_id INTEGER,
 employee_id int

);

CREATE TABLE IF NOT EXISTS News (
 general_news VARCHAR;
 department_news VARCHAR;
 news_id int
);

CREATE TABLE IF NOT EXISTS Department_news (
id int  Primary key auto_increment
department_id INTEGER,
news_id INTEGER
);