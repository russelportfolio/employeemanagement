INSERT INTO roles(roles_id, name)VALUES (1,'admin');
INSERT INTO roles(roles_id, name)VALUES (2,'manager');
INSERT INTO roles(roles_id, name)VALUES (3,'leads');
INSERT INTO roles(roles_id, name)VALUES (4,'teams lead');
INSERT INTO roles(roles_id, name)VALUES (5,'staff');


INSERT INTO public.department(department_id, name)VALUES (1, 'Dept1-div1');
INSERT INTO public.department(department_id, name)VALUES (2, 'Dept1-div2');
INSERT INTO public.department(department_id, name)VALUES (3, 'Dept1-div3');
INSERT INTO public.department(department_id, name)VALUES (4, 'Dept1-div4');

INSERT INTO public.department(department_id, name)VALUES (5, 'Dept2-div1');
INSERT INTO public.department(department_id, name)VALUES (6, 'Dept2-div2');
INSERT INTO public.department(department_id, name)VALUES (7, 'Dept2-div3');
INSERT INTO public.department(department_id, name)VALUES (8, 'Dept2-div4');

INSERT INTO public.department(department_id, name)VALUES (9, 'Dept3-div1');
INSERT INTO public.department(department_id, name)VALUES (10,'Dept3-div2');
INSERT INTO public.department(department_id, name)VALUES (11,'Dept3-div3');
INSERT INTO public.department(department_id, name)VALUES (12,'Dept3-div4');

INSERT INTO public.position(career_level, position_id, name)VALUES (12, 1, 'Associate');
INSERT INTO public.position(career_level, position_id, name)VALUES (11, 2, 'Junior');
INSERT INTO public.position(career_level, position_id, name)VALUES (10, 3, 'Consultant');
INSERT INTO public.position(career_level, position_id, name)VALUES (9,  4, 'Senior');
INSERT INTO public.position(career_level, position_id, name)VALUES (8,  5, 'Operation Manager');
INSERT INTO public.position(career_level, position_id, name)VALUES (7,  6, 'Line Manager');

INSERT INTO public.users(id, roles_roles_id, email, password, token)VALUES (1, 1, 'russelsauli@gmail.com', '12345', 'sampletoken1');
INSERT INTO public.users(id, roles_roles_id, email, password, token)VALUES (2, 2, 'john@gmail.com', '12345', 'sampletoken2');
INSERT INTO public.users(id, roles_roles_id, email, password, token)VALUES (3, 3, 'doe@gmail.com', '12345', 'sampletoken3');
INSERT INTO public.users(id, roles_roles_id, email, password, token)VALUES (4, 4, 'jane@gmail.com', '12345', 'sampletoken4');


INSERT INTO public.user_information(department_department_id, id, position_position_id, user_id, first_name, last_name)VALUES (1, 1, 1, 1, 'russel', 'sauli');
INSERT INTO public.user_information(department_department_id, id, position_position_id, user_id, first_name, last_name)VALUES (2, 2, 2, 2, 'john', 'sauli');
INSERT INTO public.user_information(department_department_id, id, position_position_id, user_id, first_name, last_name)VALUES (3, 3, 3, 3, 'doe', 'sauli');
INSERT INTO public.user_information(department_department_id, id, position_position_id, user_id, first_name, last_name)VALUES (4, 4, 4, 4, 'jane', 'sauli');