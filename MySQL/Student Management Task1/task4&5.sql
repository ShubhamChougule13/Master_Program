-- Task 4 — Insert Student Records 
-- Insert at least 10 students. 
-- Example data: 
-- 101 | Rahul | 21 | Java   | 50000 | rahul@gmail.com 
-- 102 | Priya | 22 | Python | 45000 | priya@gmail.com 
-- 103 | Amit  | 20 | SQL    | 30000 | amit@gmail.com 
-- Use INSERT.
-- Task 5 — Display All Students 
-- Write a query to display all student records. 
-- Expected command: 
-- SELECT * FROM student;

INSERT INTO student
(student_id, name, age, course, fees, email, admission_date, is_active)
VALUES
(101, 'Shubham', 25, 'Java', 50000.00, 'shubhamch5499@gmail.com', '2026-06-01', TRUE),
(102, 'Shabdashree', 22, 'Python', 45000.00, 'shabdashree@gmail.com', '2026-06-05', TRUE),
(103, 'Amit', 24, 'SQL', 30000.00, 'amit@gmail.com', '2026-06-10', TRUE),
(104, 'Sneha', 21, 'Java', 50000.00, 'sneha@gmail.com', '2026-06-12', TRUE),
(105, 'Rohan', 23, 'Python', 45000.00, 'rohan@gmail.com', '2026-06-15', TRUE),
(106, 'Neha', 25, 'SQL', 30000.00, 'neha@gmail.com', '2026-06-18', TRUE),
(107, 'Vikas', 22, 'Java', 50000.00, 'vikas@gmail.com', '2026-06-20', FALSE),
(108, 'Pooja', 21, 'Python', 45000.00, 'pooja@gmail.com', '2026-06-22', TRUE),
(109, 'Akash', 24, 'SQL', 30000.00, 'akash@gmail.com', '2026-06-25', FALSE),
(110, 'Kiran', 25, 'Java', 50000.00, 'kiran@gmail.com', '2026-06-28', TRUE);

SELECT * FROM student;








