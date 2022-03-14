CREATE TABLE Students(name VARCHAR(20),age INT,Mobile_no VARCHAR(20),Registration_no VARCHAR(20) PRIMARY KEY,Year_of_batch year);

CREATE TABLE Teacher(name VARCHAR(20),Domain VARCHAR(20),Department VARCHAR(20));

INSERT INTO Students VALUES("Mufees",19,9881222121,211211,2019);

INSERT INTO Students VALUES("Arjun",19,7333111441,211212,2019);

INSERT INTO Students VALUES("Nawaz",19,6323111441,211226,2019);

INSERT INTO Students VALUES("Manoj",19,6313122442,211231,2019);

INSERT INTO Students VALUES("Madhav",20,6213212112,211241,2020);

INSERT INTO Students VALUES("Harish",20,6443292110,211221,2020);

INSERT INTO Students VALUES("Sabariesh",20,6221292112,211311,2020);

INSERT INTO Students VALUES("Laxhman",18,6331292112,311251,2021);

INSERT INTO Students VALUES("Arun",18,6331292111,311211,2021);

INSERT INTO Students VALUES("John",19,61312121321,311221,2020);


INSERT INTO Teacher VALUES("Danial","Cyber Security","Information Technology");

INSERT INTO Teacher VALUES("Savitha","Web Developer","Information Technology");

INSERT INTO Teacher VALUES("Raman","Virtual Reality","Computer Science ");

INSERT INTO Teacher VALUES("Raju","Blockchain","Information Technology");

INSERT INTO Teacher VALUES("Ravi","Blockchain","Information Technology");

INSERT INTO Teacher VALUES("Swami","Mobile Technology","Computer Science");

INSERT INTO Teacher VALUES("Arthi","Machine Learning","Information Technology");

INSERT INTO Teacher VALUES("Varma","Internet of Things","Electrical Communication Engineering");

INSERT INTO Teacher VALUES("Priya","Front End Developer","Information Technology");

INSERT INTO Teacher VALUES("Santhosh","Back End Developer","Information Technology");




SELECT * FROM Students WHERE year_of_batch=2020

SELECT * FROM Teacher  WHERE department="Computer Science"

UPDATE Students SET year_of_batch=2019 WHERE age=20 


DELETE FROM Teacher WHERE domain="Blockchain"


