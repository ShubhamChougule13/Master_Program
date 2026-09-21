use Student_Management;

-- Task 8 — Change Student Course 
-- Amit changes his course from SQL to Java. 
-- Write the query.

UPDATE student
SET course = 'Java'
WHERE name = 'Amit';

SELECT * FROM student
WHERE name = 'Amit';