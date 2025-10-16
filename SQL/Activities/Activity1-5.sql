--For full rest
DROP TABLE salesman;
--Activity 1: Create the salesman table
CREATE TABLE salesman(salesman_id int PRIMARY KEY, salesman_name varchar(20) NOT NULL, salesman_city varchar(20), commission int);
--To view the table schema
DESCRIBE salesman;

--Activity 2: Insert values into salesman table
INSERT ALL
    INTO salesman VALUES(5001, 'James Hoog', 'New York', 15)
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13)
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;
--View the table date
SELECT * FROM salesman;

--Activity 3: SELECT statements
--Show data from the salesman_id and salesman_city columns
SELECT salesman_id, salesman_city FROM salesman;
--Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city = 'Paris'
--Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name = 'Paul Adam';

--Activity 4: Modifying the salesman table
--Add a new column 'grade'
ALTER TABLE salesman ADD grade int;
--Set the value in the grade column for everyone to 100
UPDATE salesman SET grade = 100;
--View the new column
SELECT * FROM salesman;

--Activity 5: Updating the data in salesman table
--Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade = 200 WHERE salesman_city = 'Rome';
--Update the grade score of James Hoog to 300.
UPDATE salesman SET grade = 300 WHERE salesman_name = 'James Hoog';
--Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name = 'Pierre' WHERE salesman_name = 'McLyon';
--View the updated data
SELECT * FROM salesman;