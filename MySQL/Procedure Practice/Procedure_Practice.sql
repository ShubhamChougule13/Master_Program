create database procedure_db;
use procedure_db;

CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100),
    salary DECIMAL(10,2),
    department VARCHAR(50)
);

INSERT INTO employee (employee_id, name, salary, department)
VALUES
(101, 'Shubham', 50000.00, 'IT'),
(102, 'Rahul', 45000.00, 'HR'),
(103, 'Amit', 60000.00, 'IT'),
(104, 'Priya', 55000.00, 'Finance'),
(105, 'Neha', 48000.00, 'HR');

SELECT * from employee;

DELIMITER //

CREATE PROCEDURE getAllEmployees()
BEGIN
    SELECT * FROM employee;
END //

DELIMITER ;

CALL getAllEmployees();

DELIMITER //

CREATE PROCEDURE getEmployeeById(IN p_id INT)
BEGIN
    SELECT *
    FROM employee
    WHERE employee_id = p_id;
END //

DELIMITER ;

CALL getEmployeeById(101);
