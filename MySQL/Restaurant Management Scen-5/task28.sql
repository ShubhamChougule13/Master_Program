create database restuarant_management;
use restuarant_management;

-- A restaurant wants to maintain its menu. 
-- Task 28 — Create Menu Table 
-- Create: 
-- menu 
-- with: 
-- item_id 
-- item_name 
-- category 
-- price 
-- description 
-- available 
-- Use suitable datatypes.

CREATE TABLE menu (
    item_id INT,
    item_name VARCHAR(100),
    category VARCHAR(50),
    price DECIMAL(10,2),
    description VARCHAR(255),
    available BOOLEAN
);

