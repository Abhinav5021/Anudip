-- ========================================
-- LAB-3 - Assignment 1
-- File: lab_assignment1.sql
-- ========================================

-- Use the correct database
USE StudentManagementSystem;

-- ========================================
-- Task 1: Retrieve students born after 16th June 2009
-- ========================================
SELECT * 
FROM Student
WHERE DateOfBirth > '2009-06-16';

-- ========================================
-- Task 2: Retrieve students whose FirstName starts with 'A' or 'J'
-- ========================================
SELECT * 
FROM Student
WHERE FirstName LIKE 'A%' OR FirstName LIKE 'J%';

-- ========================================
-- Task 3: Retrieve students whose FirstName is NOT 'Alice' and email ends with '@example.com'
-- ========================================
SELECT * 
FROM Student
WHERE FirstName != 'Alice' AND Email LIKE '%@example.com';
