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

-- Task 24 — Insert Patients 
-- Insert at least 10 patients. 
-- Use different: 
-- • Ages  
-- • Diseases  
-- • Doctors  
-- • Admission dates  
-- • Admission times 

INSERT INTO patient
(patient_id, patient_name, age, gender, phone, disease, admission_date, admission_time, doctor_name, is_discharged)
VALUES
(101, 'Shubham', 25, 'Male', '9876543210', 'Fever', '2026-09-01', '09:30:00', 'Dr. Patil', FALSE),
(102, 'Rahul', 32, 'Male', '9876543211', 'Diabetes', '2026-09-02', '10:15:00', 'Dr. Sharma', FALSE),
(103, 'Priya', 28, 'Female', '9876543212', 'Migraine', '2026-09-03', '11:00:00', 'Dr. Kulkarni', FALSE),
(104, 'Amit', 45, 'Male', '9876543213', 'Hypertension', '2026-09-04', '08:45:00', 'Dr. Joshi', TRUE),
(105, 'Sneha', 36, 'Female', '9876543214', 'Asthma', '2026-09-05', '12:30:00', 'Dr. Deshmukh', FALSE),
(106, 'Rohan', 52, 'Male', '9876543215', 'Heart Disease', '2026-09-06', '14:00:00', 'Dr. Patil', TRUE),
(107, 'Neha', 22, 'Female', '9876543216', 'Anemia', '2026-09-07', '15:20:00', 'Dr. Sharma', FALSE),
(108, 'Vikas', 39, 'Male', '9876543217', 'Kidney Stone', '2026-09-08', '16:10:00', 'Dr. Kulkarni', FALSE),
(109, 'Pooja', 30, 'Female', '9876543218', 'Thyroid', '2026-09-09', '17:30:00', 'Dr. Joshi', TRUE),
(110, 'Kiran', 61, 'Male', '9876543219', 'Arthritis', '2026-09-10', '18:15:00', 'Dr. Deshmukh', FALSE);

SELECT * FROM patient;
