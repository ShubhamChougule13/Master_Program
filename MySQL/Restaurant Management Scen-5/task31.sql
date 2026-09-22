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

-- Task 29 — Insert Menu Items 
-- Insert at least 15 items. 
-- Categories: 
-- Starter 
-- Main Course 
-- Dessert 
-- Beverage 
-- Pizza 
-- Burger 

INSERT INTO menu
(item_id, item_name, category, price, description, available)
VALUES
(101, 'Paneer Tikka', 'Starter', 220.00, 'Grilled paneer with spices', TRUE),
(102, 'Veg Manchurian', 'Starter', 180.00, 'Crispy vegetable balls in sauce', TRUE),
(103, 'French Fries', 'Starter', 120.00, 'Crispy golden potato fries', TRUE),

(104, 'Paneer Butter Masala', 'Main Course', 280.00, 'Paneer cooked in creamy tomato gravy', TRUE),
(105, 'Veg Biryani', 'Main Course', 250.00, 'Aromatic rice with mixed vegetables', TRUE),
(106, 'Dal Tadka', 'Main Course', 180.00, 'Yellow dal tempered with spices', TRUE),

(107, 'Gulab Jamun', 'Dessert', 100.00, 'Soft sweet dumplings in sugar syrup', TRUE),
(108, 'Chocolate Brownie', 'Dessert', 160.00, 'Warm chocolate brownie', TRUE),

(109, 'Cold Coffee', 'Beverage', 140.00, 'Chilled creamy coffee', TRUE),
(110, 'Fresh Lime Soda', 'Beverage', 90.00, 'Refreshing lime soda', TRUE),

(111, 'Margherita Pizza', 'Pizza', 300.00, 'Classic cheese and tomato pizza', TRUE),
(112, 'Farmhouse Pizza', 'Pizza', 420.00, 'Pizza loaded with fresh vegetables', TRUE),
(113, 'Paneer Pizza', 'Pizza', 450.00, 'Pizza topped with spicy paneer', TRUE),

(114, 'Veg Burger', 'Burger', 180.00, 'Crispy vegetable patty burger', TRUE),
(115, 'Paneer Burger', 'Burger', 220.00, 'Grilled paneer patty burger', TRUE);

SELECT * FROM menu;

-- Task 30 — Update Price 
-- Increase the price of one menu item. 
-- Example: 
-- Veg Burger 
-- ₹150 → ₹180
SET SQL_SAFE_UPDATES = 0;
UPDATE menu
SET price = 180.00
WHERE item_name = 'Veg Burger';

SELECT * FROM menu
WHERE item_name = 'Veg Burger';

-- Task 31 — Make Item Unavailable 
-- Suppose Pizza Margherita is temporarily unavailable. 
-- Update: 
-- available = FALSE
UPDATE menu
SET available = FALSE
WHERE item_name = 'Margherita Pizza';

SELECT * FROM menu
WHERE item_name = 'Margherita Pizza';