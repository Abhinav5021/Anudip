-- Creating StudentManagementSystem Database --
CREATE DATABASE StudentManagementSystem;
USE StudentManagementSystem;
-- Creating Table Student --
CREATE TABLE Student (
    StudentID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DateOfBirth DATE,
    Gender ENUM('Male', 'Female', 'Other'),
    Email VARCHAR(100),
    Phone VARCHAR(15)
);
-- Creating Table Course --
CREATE TABLE Course (
    CourseID INT PRIMARY KEY AUTO_INCREMENT,
    CourseTitle VARCHAR(100),
    Credits INT
);
-- Creating Table Instructor --
CREATE TABLE Instructor (
    InstructorID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100)
);
-- Creating Table Enrollment -- 
CREATE TABLE Enrollment (
    EnrollmentID INT PRIMARY KEY AUTO_INCREMENT,
    EnrollmentDate DATE,
    StudentID INT,
    CourseID INT,
    InstructorID INT,
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID),
    FOREIGN KEY (InstructorID) REFERENCES Instructor(InstructorID)
);
-- Creating Table Score --
CREATE TABLE Score (
    ScoreID INT PRIMARY KEY AUTO_INCREMENT,
    CourseID INT,
    StudentID INT,
    DateOfExam DATE,
    CreditObtained INT,
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID),
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID)
);
-- Creating Table Feedback --
CREATE TABLE Feedback (
    FeedbackID INT PRIMARY KEY AUTO_INCREMENT,
    StudentID INT,
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID)
);
-- Inserting Data Into Tables --
-- Student --
INSERT INTO Student (FirstName, LastName, DateOfBirth, Gender, Email, Phone)
VALUES 
('Abhinav', 'Pawar', '2003-07-08', 'Male', 'abhinav@example.com', '9876543210'),
('Shivam', 'Dhondkar', '2002-10-10', 'Male', 'shivam@example.com', '9988776655');
-- Course --
INSERT INTO Course (CourseTitle, Credits)
VALUES 
('Java Programming', 4),
('Database Systems', 3);
-- Instructor --
INSERT INTO Instructor (FirstName, LastName, Email)
VALUES 
('Rahul', 'Verma', 'rahul.verma@example.com'),
('Sneha', 'Patil', 'sneha.patil@example.com');
-- Enrollment --
INSERT INTO Enrollment (EnrollmentDate, StudentID, CourseID, InstructorID)
VALUES 
('2025-07-08', 1, 1, 1),
('2025-07-08', 2, 2, 2);
-- Score --
INSERT INTO Score (CourseID, StudentID, DateOfExam, CreditObtained)
VALUES 
(1, 1, '2025-07-05', 38),
(2, 2, '2025-07-06', 30);
-- Feedback --
INSERT INTO Feedback (StudentID)
VALUES 
(1),
(2);
