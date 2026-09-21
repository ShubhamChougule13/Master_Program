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