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

-- Task 18 — Insert Products 
-- Insert at least 10 products. 
-- Example: 
-- 101 | Laptop       | Electronics | 55000 
-- 102 | Mobile       | Electronics | 25000 
-- 103 | Headphones   | Electronics | 2500 
-- 104 | Chair        | Furniture   | 7500

INSERT INTO product
(product_id, product_name, category, price, quantity, description, manufactured_date, is_available)
VALUES
(101, 'Laptop', 'Electronics', 55000.00, 10, 'High performance laptop', '2026-01-10', TRUE),
(102, 'Mobile', 'Electronics', 25000.00, 20, 'Smartphone with advanced features', '2026-01-15', TRUE),
(103, 'Headphones', 'Electronics', 2500.00, 30, 'Wireless Bluetooth headphones', '2026-02-01', TRUE),
(104, 'Chair', 'Furniture', 7500.00, 15, 'Comfortable office chair', '2026-02-05', TRUE),
(105, 'Table', 'Furniture', 12000.00, 8, 'Wooden study table', '2026-02-10', TRUE),
(106, 'Keyboard', 'Electronics', 1500.00, 25, 'Wireless computer keyboard', '2026-02-15', TRUE),
(107, 'Mouse', 'Electronics', 800.00, 40, 'Wireless optical mouse', '2026-03-01', TRUE),
(108, 'Sofa', 'Furniture', 35000.00, 5, 'Comfortable three seater sofa', '2026-03-05', TRUE),
(109, 'Watch', 'Accessories', 5000.00, 12, 'Smart digital watch', '2026-03-10', TRUE),
(110, 'Backpack', 'Accessories', 1800.00, 25, 'Water resistant backpack', '2026-03-15', TRUE);

SELECT * FROM product;

-- Task 19 — Update Product Price 
-- The price of the laptop changes from: 
-- 55000 
-- to: 
-- 58000 
-- Update only the laptop. 

UPDATE product
SET price = 58000.00
WHERE product_name = 'Laptop';

SELECT * FROM product
WHERE product_name = 'Laptop';

-- Task 20 — Update Product Quantity 
-- Product 103 has 20 items in stock. 
-- After selling 5 items, update the quantity.
UPDATE product
SET quantity = 15
WHERE product_id = 103;
SELECT * FROM product
WHERE product_id = 103;

-- Task 21 — Remove Product 
-- Product 104 is discontinued. 
-- Delete it from the table. 

DELETE FROM product
WHERE product_id = 104;

SELECT * FROM product
WHERE product_id = 104;