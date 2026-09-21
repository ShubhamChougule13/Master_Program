use Student_Management;

-- Task 7 — Update Student Fees 
-- The institute increases Rahul's fees from 50000 to 55000. 
-- Write an UPDATE query. 
-- Condition: Update only Rahul's record.

SET SQL_SAFE_UPDATES = 0;

UPDATE student
SET fees = 55000.00
WHERE name = 'Rahul';

SELECT * FROM student
WHERE name = 'Rahul';