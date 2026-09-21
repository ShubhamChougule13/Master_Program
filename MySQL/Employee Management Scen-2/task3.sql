-- Scenario 2: Employee Management System  
-- A company wants to maintain employee information. 
-- Task 11 — Create Employee Table 
-- Create: 
-- employee 
-- with: 
-- employee_id 
--  
--  
-- employee_name 
-- age 
-- department 
-- salary 
-- email 
-- joining_date 
-- is_active 
-- Choose appropriate datatypes.

create database Employee_Management;
use Employee_Management;

CREATE TABLE employee (
    employee_id INT,
    employee_name VARCHAR(100),
    age INT,
    department VARCHAR(50),
    salary DECIMAL(10,2),
    email VARCHAR(100),
    joining_date DATE,
    is_active BOOLEAN
);


-- Task 12 — Insert Employees 
-- Insert at least 8 employees from different departments: 
-- Java 
-- Python 
-- Testing 
-- HR 
-- Finance 
-- Sales

INSERT INTO employee
(employee_id, employee_name, age, department, salary, email, joining_date, is_active)
VALUES
(201, 'Shubham', 25, 'Java', 60000.00, 'shubham@gmail.com', '2026-01-10', TRUE),
(202, 'Rahul', 24, 'Python', 55000.00, 'rahul@gmail.com', '2026-01-15', TRUE),
(203, 'Priya', 26, 'Testing', 50000.00, 'priya@gmail.com', '2026-02-01', TRUE),
(204, 'Amit', 28, 'HR', 45000.00, 'amit@gmail.com', '2026-02-10', TRUE),
(205, 'Sneha', 27, 'Finance', 58000.00, 'sneha@gmail.com', '2026-02-15', TRUE),
(206, 'Rohan', 25, 'Sales', 48000.00, 'rohan@gmail.com', '2026-03-01', TRUE),
(207, 'Neha', 23, 'Java', 62000.00, 'neha@gmail.com', '2026-03-10', TRUE),
(208, 'Vikas', 29, 'Testing', 52000.00, 'vikas@gmail.com', '2026-03-15', FALSE);

SELECT * FROM employee;

-- Task 13 — Update Salary 
-- Employee 101 receives a salary increment. 
-- Update the salary. 
-- Important: Use WHERE employee_id = 101.

UPDATE employee
SET salary = 65000.00
WHERE employee_id = 101;

SELECT * FROM employee
WHERE employee_id = 201;