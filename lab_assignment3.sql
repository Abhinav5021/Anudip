-- ========================================
-- LAB-4 - Assignment 1
-- File: lab_assignment3.sql
-- ========================================

-- Use the StudentManagementSystem database
USE StudentManagementSystem;

-- ============================================================
-- Purpose: Show how the GROUP BY clause works in SQL.
-- This query groups scores by CourseID and calculates the 
-- average credit obtained by students in each course.
-- ============================================================

SELECT 
    CourseID,
    AVG(CreditObtained) AS AverageCredits
FROM 
    Score
GROUP BY 
    CourseID;
