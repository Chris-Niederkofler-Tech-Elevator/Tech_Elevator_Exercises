CREATE database projects


BEGIN TRANSACTION;

CREATE TABLE departments (
        departments_id serial NOT NULL,
        name varchar(255) NOT NULL UNIQUE,
        CONSTRAINT pk_departments_id PRIMARY KEY (departments_id)   
 );

CREATE TABLE job_titles (
        job_titles_id serial,
        title varchar(255) NOT NULL UNIQUE,
        CONSTRAINT pk_job_titles_id PRIMARY KEY (job_titles_id)       
);
 
CREATE TABLE employees (
        first_name varchar(255) NOT NULL,
        last_name varchar(255) NOT NULL,
        gender char(1),
        birthday date,
        hireday date NOT NULL,
        departments_id integer NOT NULL,
        job_titles_id integer NOT NULL,
        employees_id SERIAL NOT NULL,
        CONSTRAINT pk_employees_id PRIMARY KEY (employees_id)
      --CONSTRAINT fk_job_titles_id FOREIGN KEY (job_titles_id) REFERENCES job_titles(id),
     -- CONSTRAINT fk_departments_id FOREIGN KEY (departments_id) REFERENCES departments(id)
)

CREATE TABLE projects (
        projects_id serial not null,
        name varchar(255) NOT NULL UNIQUE,
        employees_id integer NOT NULL,
        startdate date NOT NULL,
        CONSTRAINT pk_projects_id PRIMARY KEY (projects_id)
       -- CONSTRAINT fk_employees_id FOREIGN KEY (employees_id) REFERENCES employees(employees_id)
)

 INSERT INTO departments (name) VALUES ('Human Resources');
 INSERT INTO departments (name) VALUES ('Finance'); 
 INSERT INTO departments (name) VALUES ('Project Management');
 INSERT INTO departments (name) VALUES ('Reasearch and Development');
 INSERT INTO job_titles (title) VALUES ('Director');
 INSERT INTO job_titles (title) VALUES ('Manager');
 INSERT INTO job_titles (title) VALUES ('Associate');
 INSERT INTO job_titles (title) VALUES ('Developer');
 
 
 INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Mickey','Mouse','2001-01-01',4,1);
 INSERT INTO employees (first_name, last_name,hireday,departments_id,job_titles_id) VALUES ('Donald','Duck','2002-01-01',4,3);
 INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Daisy','Duck','2003-01-01',2,3);
 INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Minnie','Mouse','2004-01-01',2,2);
 INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Beaver','Bird','2005-01-01',3,4);
 INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Goose','Duck','2006-01-01',3,3);
 INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Otter','Moo','2007-01-01',1,4);
 INSERT INTO employees (first_name,last_name,hireday,departments_id,job_titles_id) VALUES ('Squirrel','Goo','2008-01-01',1,1); 

INSERT INTO projects (name,employees_id,startdate) VALUES ('BirdFeeder',11,'2013-06-10');
INSERT INTO projects (name,employees_id,startdate) VALUES ('BirdBath',12,'2011-09-10');
INSERT INTO projects (name,employees_id,startdate) VALUES ('RacoonSearch',13,'2009-06-11');
INSERT INTO projects (name,employees_id,startdate) VALUES ('TinyHouse',15,'2017-08-10');



Alter table employees add foreign key (departments_id) references departments(departments_id);
Alter table employees add foreign key (job_titles_id) references job_titles(job_titles_id);
Alter table projects add foreign key(employees_id) references employees(employees_id);



SELECT * FROM job_titles
SELECT * FROM departments
SELECT * FROM employees
SELECT * FROM projects


 ROLLBACK;
 
 COMMIT;