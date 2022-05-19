INSERT INTO roles(role) VALUES ("USER");
INSERT INTO roles(role) VALUES ("ADMIN");

INSERT INTO user(name, surname, country, city, phone_number, email, joined_agility_year, info, username, password) VALUES ("Rokas", "Anskinas", "Lithuania", "Vilnius", "+37065780394", "r.anskinas@gmail.com", 2021, "mano accountas ka noriu ta rasau", "rokis", "123");
INSERT INTO user(name, surname, country, city, phone_number, email, joined_agility_year, info, username, password) VALUES ("Rokas1", "Anskinas1", "Lithuania1", "Vilnius1", "+37065780391", "r1.anskinas@gmail.com", 2021, "mano accountas ka noriu ta rasau1", "rokis", "123");
INSERT INTO user(name, surname, country, city, phone_number, email, joined_agility_year, info, username, password) VALUES ("Rokas2", "Anskinas2", "Lithuania2", "Vilnius2", "+37065780392", "r2.anskinas@gmail.com", 2021, "mano accountas ka noriu ta rasau2", "rokis", "123");

INSERT INTO user_roles(user_id, roles_id) VALUES (1, 1);
INSERT INTO user_roles(user_id, roles_id) VALUES (1, 2);

INSERT INTO user_roles(user_id, roles_id) VALUES(2, 1);