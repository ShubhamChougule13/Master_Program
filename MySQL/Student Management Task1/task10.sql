use Student_Management;

-- Task 10 — Add New Column 
-- The institute wants to store the student's phone number. 
-- Use: 
-- ALTER TABLE 
-- to add: 
-- phone VARCHAR(15)

ALTER TABLE student
ADD phone VARCHAR(15);

DESC student;