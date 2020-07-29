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
Drop table if exists projects_details;
Create Table if not exists projects_details
(
    user_id character varying (255),
    username character varying(255),
    user_department character varying(255),
    project_name character varying(255),
    project_desc character varying (255),
    project_desc_optional character varying (255),
    project_deadline character varying (255)

);


