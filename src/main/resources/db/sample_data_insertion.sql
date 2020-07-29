Drop table if exists user_permission;
Create Table if not exists user_permission
(
    user_id character varying (255),
    username character varying(255),
    user_department character varying(255),
    user_permission character varying(255)
);

Drop table if exists projects;
Create Table if not exists projects
(
    user_id character varying (255),
    username character varying(255),
    user_department character varying(255),
    project_name character varying(255),
    project_desc character varying (255),
    project_desc_optional character varying (255)

);
Drop table if exists projects_v2;
Create Table if not exists projects
(
    user_id character varying (255),
    username character varying(255),
    user_department character varying(255),
    project_name character varying(255),
    project_desc character varying (255),
    project_desc_optional character varying (255)

);

Insert into user_permission Values
('1','chene','CS','Project1'),
('1','chene','CS','Project2'),
('2','jimse','CS','Project1'),
('2','jimse','CS','Project2'),
('2','jimse','CS','Project3'),
('3','paris','CE','Project1'),
('3','paris','CE','Project2'),
('3','paris','CE','project3'),
('3','paris','CE','Project4');
Insert into projects Values
('1','chene','CS','Project1','desc1','desc2'),
('1','chene','CS','Project2','desc1','desc2'),
('2','jimse','CS','Project1','desc1','desc2'),
('2','jimse','CS','Project2','desc1','desc2'),
('2','jimse','CS','Project3','desc1','desc2'),
('3','paris','CE','Project1','desc1','desc2'),
('3','paris','CE','Project2','desc1','desc2'),
('3','paris','CE','project3','desc1','desc2'),
('3','paris','CE','Project4','desc1','desc2');
Insert into projects_details Values
('1','chene','CS','Project1','desc1','desc2','next year'),
('1','chene','CS','Project2','desc1','desc2','next year'),
('2','jimse','CS','Project1','desc1','desc2','next year'),
('2','jimse','CS','Project2','desc1','desc2','next year'),
('2','jimse','CS','Project3','desc1','desc2','next year'),
('3','paris','CE','Project1','desc1','desc2','next year'),
('3','paris','CE','Project2','desc1','desc2','next year'),
('3','paris','CE','project3','desc1','desc2','next year'),
('3','paris','CE','Project4','desc1','desc2','next year');
