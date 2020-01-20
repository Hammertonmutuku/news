SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS Departments (

 department_name VARCHAR;
 department_description VARCHAR;
 number of employees int
);

CREATE TABLE IF NOT EXISTS Employees (
 employee_name VARCHAR;
 position_in_company VARCHAR;
 employee_id int;
 role VARCHAR;
 department VARCHAR
);

CREATE TABLE IF NOT EXISTS News (
 general_news VARCHAR;
 department_news VARCHAR
);