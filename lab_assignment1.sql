-- =======================================
-- LAB-2-MYSQL-ANP-D1490
-- File: lab_assignment1.sql
-- =======================================

-- =======================
-- Assignment 1
-- =======================

-- Task 1: Update Student Email where FirstName = 'Jane' and LastName = 'Smith'
SET SQL_SAFE_UPDATES = 0;
UPDATE Student
SET Email = 'jane_Smith@example.com'
WHERE FirstName = 'Jane' AND LastName = 'Smith';

-- Task 1: Update Instructor Email where FirstName = 'Sunil' and LastName = 'Rawat'
UPDATE Instructor
SET Email = 'sunilrawat@example.com'
WHERE FirstName = 'Sunil' AND LastName = 'Rawat';

-- Task 2: Delete students with LastName = 'Smith'
DELETE FROM Student
WHERE LastName = 'Smith';

-- Task 3: List students whose FirstName starts with 'J'
SELECT * FROM Student
WHERE FirstName LIKE 'J%';

-- =======================
-- Assignment 2
-- =======================

-- Task 1: Create Employee Table (if not already created)
CREATE TABLE IF NOT EXISTS Employee (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT,
    email VARCHAR(100)
);

-- Task 1: Insert sample data into Employee table
INSERT INTO Employee (first_name, last_name, age, email)
VALUES 
('Ravi', 'Sharma', 30, 'ravi.sharma@example.com'),
('Neha', 'Kumar', 28, 'neha.kumar@example.com');

-- Task 2: Retrieve all Employee records
SELECT * FROM Employee;