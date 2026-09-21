use Student_Management;

-- Task 9 — Delete a Student 
-- Student 105 cancels admission. 
-- Delete only student 105.

DELETE FROM student
WHERE student_id = 105;

SELECT * FROM student
WHERE student_id = 105;