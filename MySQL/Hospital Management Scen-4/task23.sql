-- Scenario 4: Hospital Management System  
-- A hospital wants to maintain patient information. 
-- Task 23 — Create Patient Table 
-- Create: 
-- patient 
-- with: 
-- patient_id 
-- patient_name 
-- age 
-- gender 
-- phone 
-- disease 
-- admission_date 
-- admission_time 
-- doctor_name 
--  
--  
-- is_discharged 
-- Use appropriate datatypes.

create database hospital_management;
use hospital_management;
CREATE TABLE patient (
    patient_id INT,
    patient_name VARCHAR(100),
    age INT,
    gender VARCHAR(10),
    phone VARCHAR(15),
    disease VARCHAR(100),
    admission_date DATE,
    admission_time TIME,
    doctor_name VARCHAR(100),
    is_discharged BOOLEAN
);

DESC patient;