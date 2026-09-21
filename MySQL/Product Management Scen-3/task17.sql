-- Scenario 3: E-Commerce Product Management       
-- An online shopping company wants to maintain product information. 
-- Task 17 — Create Product Table 
-- Create a table: 
-- product 
-- with: 
-- product_id 
-- product_name 
--  
--  
-- category 
-- price 
-- quantity 
-- description 
-- manufactured_date 
-- is_available 
-- Choose suitable datatypes.

create database product_management;
use product_management;

CREATE TABLE product (
    product_id INT,
    product_name VARCHAR(100),
    category VARCHAR(50),
    price DECIMAL(10,2),
    quantity INT,
    description VARCHAR(255),
    manufactured_date DATE,
    is_available BOOLEAN
);