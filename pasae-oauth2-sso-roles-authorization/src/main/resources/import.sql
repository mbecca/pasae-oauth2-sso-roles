-- Password are hashed using a BCrypt hash with a cost of 10
-- password = 'password' BCrypt 10 hashed
insert into user(id,username, password, authorities, enabled) values(1,'mbecca', '$2a$10$KoxHNdhOe6OY88Ybq6T2d.SGp6lVfj5ynY/QwaO5SRk998TgnYayi', 'ROLE_USER', true);
insert into user(id,username, password, authorities, enabled) values(2,'mbutti', '$2a$10$KoxHNdhOe6OY88Ybq6T2d.SGp6lVfj5ynY/QwaO5SRk998TgnYayi', 'ROLE_ADMIN', true);
insert into user(id,username, password, authorities, enabled) values(3,'marcos', '$2a$10$KoxHNdhOe6OY88Ybq6T2d.SGp6lVfj5ynY/QwaO5SRk998TgnYayi', 'ROLE_STUDENT', true);
insert into user(id,username, password, authorities, enabled) values(4,'gonzalo', '$2a$10$KoxHNdhOe6OY88Ybq6T2d.SGp6lVfj5ynY/QwaO5SRk998TgnYayi', 'ROLE_STUDENT', true);
insert into user(id,username, password, authorities, enabled) values(5,'agustin', '$2a$10$KoxHNdhOe6OY88Ybq6T2d.SGp6lVfj5ynY/QwaO5SRk998TgnYayi', 'ROLE_STUDENT', true);
insert into user(id,username, password, authorities, enabled) values(6,'genaro', '$2a$10$KoxHNdhOe6OY88Ybq6T2d.SGp6lVfj5ynY/QwaO5SRk998TgnYayi', 'ROLE_STUDENT', true);
