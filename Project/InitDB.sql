CREATE DATABASE airline;

USE airline;

CREATE TABLE flights (
    id INT PRIMARY KEY AUTO_INCREMENT,
    flight_number VARCHAR(10),
    source VARCHAR(50),
    destination VARCHAR(50),
    departure_time VARCHAR(50),
    arrival_time VARCHAR(50)
);

CREATE TABLE bookings (
    id INT PRIMARY KEY AUTO_INCREMENT,
    passenger_name VARCHAR(50),
    flight_id INT,
    FOREIGN KEY (flight_id) REFERENCES flights(id)
);
