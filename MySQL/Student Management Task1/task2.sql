-- --Task 2 — Create Student Table 
-- Create a student table with: 
-- Column Datatype 
-- student_id INT 
-- name VARCHAR(100) 
-- age INT 
-- course VARCHAR(50) 
-- fees DECIMAL(10,2) 
-- email VARCHAR(100) 
-- admission_date DATE 
-- is_active BOOLEAN
-- Task 3 — Check Table Structure 
-- Use: 
-- DESC student; 
-- Task: Verify that all columns have been created with the correct 
-- datatypes.

CREATE TABLE student (
    student_id INT,
    name VARCHAR(100),
    age INT,
    course VARCHAR(50),
    fees DECIMAL(10,2),
    email VARCHAR(100),
    admission_date DATE,
    is_active BOOLEAN
);

desc student;