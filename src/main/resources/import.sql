INSERT INTO roles(role) VALUES ("ADMIN");
INSERT INTO roles(role) VALUES ("USER");

INSERT INTO user(name, surname, country, city, phone_number, email, joined_agility_year, info, username, password) VALUES ("Test", "Testas", "Lithuania", "Vilnius", "+37000000000", "test@test.com", 2019, "mano accountas", "test", "$2a$12$xu250lf.ILUzkzYkI/s6S.eufen.jjWoWBF2O5vveUyDi/S79z1ji");
INSERT INTO user(name, surname, country, city, phone_number, email, joined_agility_year, info, username, password) VALUES ("Rokas", "Rokasas", "Latvia", "Riga", "+37111111111", "rokas@rokas.lv", 2020, "ka noriu", "rokis", "$2a$12$xu250lf.ILUzkzYkI/s6S.eufen.jjWoWBF2O5vveUyDi/S79z1ji");
INSERT INTO user(name, surname, country, city, phone_number, email, joined_agility_year, info, username, password) VALUES ("Jonas", "Jonasas", "Estonia", "Tallinn", "+37222222222", "jonas@jonas.ee", 2021, "ta ir", "jonis", "$2a$12$xu250lf.ILUzkzYkI/s6S.eufen.jjWoWBF2O5vveUyDi/S79z1ji");
INSERT INTO user(name, surname, country, city, phone_number, email, joined_agility_year, info, username, password) VALUES ("Kestas", "Kestasas", "Poland", "Warsaw", "+4833333333", "kestas@kestas.pl", 2022, "rasau", "kestis", "$2a$12$xu250lf.ILUzkzYkI/s6S.eufen.jjWoWBF2O5vveUyDi/S79z1ji");

INSERT INTO user_roles(user_id, roles_id) VALUES (1, 1);
INSERT INTO user_roles(user_id, roles_id) VALUES (1, 2);
--INSERT INTO users_roles(user_id, roles_id) VALUES (1, "HANDLER");
--INSERT INTO users_roles(user_id, roles_id) VALUES (1, "CLUB");
INSERT INTO user_roles(user_id, roles_id) VALUES (2, 2);
--INSERT INTO users_roles(user_id, roles_id) VALUES (2, "HANDLER");
INSERT INTO user_roles(user_id, roles_id) VALUES (3, 2);
--INSERT INTO users_roles(user_id, roles_id) VALUES (3, "CLUB");
INSERT INTO user_roles(user_id, roles_id) VALUES (4, 2);

--Pasiklaust kaip boolean palikti reiksme per sql.
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (1, TRUE, "test Dog", "test Breed", "2022-01-01", TRUE, "2021-12-12", "medium", 4.3, "a1", 1, "test dog for dog testers")
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (1, false, "test Dog2", "test Breed2", "2021-08-08", false, "2020-01-02", "large", 3.6, "a2", 2, "test2")
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (1, true, "test Dog3", "test Breed3", "2021-01-02", true, "2021-01-01", "small", 3, "a3", 6, "test3")
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (2, true, "Mr. Lemon", "Poodle", "2021-02-22", true, "2020-11-22", "medium", 4.4, "a1", 0, "as rusas")
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (2, false, "Liusija", "Mix", "2020-10-18", false, "2019-10-02", "medium", 4, "a0", 2, "komentaras")
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (3, true, "Brukne", "Mix", "2018-03-14", true, "2017-03-19", "large", 4.1, "veteran", 3, "as saunus")
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (4, false, "Charlis", "Border Collie", "2011-11-29", true, "2011-05-25", "small", 3.2, "veteran", 2, "va ir viskas")
