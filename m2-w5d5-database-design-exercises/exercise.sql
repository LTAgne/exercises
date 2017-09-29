BEGIN TRANSACTION 

CREATE TABLE project (
        proj_number serial, 
        proj_name varchar(255) NOT NULL, 
        proj_start_date date NOT NULL DEFAULT NOW(), 
        CONSTRAINT pk_proj_number PRIMARY KEY (proj_number)
);  

CREATE TABLE department (
        dep_number serial, 
        dep_name varchar(255) NOT NULL,
        CONSTRAINT pk_dep_number PRIMARY KEY (dep_number) 
); 

CREATE TABLE employee (
        employee_number serial, 
        job_title varchar(255)NOT NULL, 
        last_name varchar (255) NOT NULL, 
        first_name varchar (255)NOT NULL, 
        gender char(1)NOT NULL, 
        birthday date, 
        hiredate date NOT NULL DEFAULT NOW(), 
        department int NOT NULL, 
        CONSTRAINT pk_employee_number PRIMARY KEY (employee_number), 
        CONSTRAINT fk_department FOREIGN KEY (department) REFERENCES department(dep_number)       
);  

CREATE TABLE project_employee (
        project_number int, 
        employee_number int, 
        CONSTRAINT fk_proj_number FOREIGN KEY (project_number) REFERENCES project(proj_number),
        CONSTRAINT fk_employee_number FOREIGN KEY (employee_number) REFERENCES employee(employee_number)
);

INSERT INTO project (proj_name) VALUES ('Project 1');
INSERT INTO project (proj_name) VALUES ('Project 2');
INSERT INTO project (proj_name) VALUES ('Project 3');
INSERT INTO project (proj_name) VALUES ('Project 4');
INSERT INTO department (dep_name) VALUES ('Billing');
INSERT INTO department (dep_name) VALUES ('Sales');
INSERT INTO department (dep_name) VALUES ('Marketing');
INSERT INTO department (dep_name) VALUES ('Parks and Rec');
INSERT INTO employee (job_title, last_name, first_name, gender, department) VALUES ('Manager', 'Swanson', 'Ron', 'M', 4);
INSERT INTO employee (job_title, last_name, first_name, gender, department) VALUES ('Dep. Manager', 'Knope', 'Leslie', 'F', 4);
INSERT INTO employee (job_title, last_name, first_name, gender, department) VALUES ('Associate', 'Haverford', 'Tom', 'M', 2);
INSERT INTO employee (job_title, last_name, first_name, gender, department) VALUES ('Reception', 'Ludgate', 'April', 'F', 3);
INSERT INTO employee (job_title, last_name, first_name, gender, department) VALUES ('Billing Associate', 'Gergich', 'Jerry', 'M', 1);
INSERT INTO employee (job_title, last_name, first_name, gender, department) VALUES ('Sales', 'Meagle', 'Donna', 'F', 2);
INSERT INTO employee (job_title, last_name, first_name, gender, department) VALUES ('Manager', 'Traeger', 'Chris', 'M', 3);
INSERT INTO employee (job_title, last_name, first_name, gender, department) VALUES ('Audits', 'Wyatt', 'Ben', 'M', 1);
INSERT INTO project_employee (project_number, employee_number) VALUES (1, 1);
INSERT INTO project_employee (project_number, employee_number) VALUES (2, 4);
INSERT INTO project_employee (project_number, employee_number) VALUES (3, 2);
INSERT INTO project_employee (project_number, employee_number) VALUES (4, 5);
INSERT INTO project_employee (project_number, employee_number) VALUES (2, 8);
INSERT INTO project_employee (project_number, employee_number) VALUES (3, 3);

COMMIT; 

ROLLBACK;