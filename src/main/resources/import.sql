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


INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (1, TRUE, "test Dog", "test Breed", "2022-01-01", TRUE, "2021-12-12", "medium", 4.3, "a1", 1, "test dog for dog testers");
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (1, false, "test Dog2", "test Breed2", "2021-08-08", false, "2020-01-02", "large", 3.6, "a2", 2, "test2");
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (1, true, "test Dog3", "test Breed3", "2021-01-02", true, "2021-01-01", "small", 3, "a3", 6, "test3");
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (2, true, "Mr. Lemon", "Poodle", "2021-02-22", true, "2020-11-22", "medium", 4.4, "a1", 0, "as rusas");
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (2, false, "Liusija", "Mix", "2020-10-18", false, "2019-10-02", "medium", 4, "a0", 2, "komentaras");
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (3, true, "Brukne", "Mix", "2018-03-14", true, "2017-03-19", "large", 4.1, "veteran", 3, "as saunus");
INSERT INTO dog(user_id, active_runner, name, breed, birth_date, vaccinated, vaccine_date, dog_size, speed, division, clean_courses, info) VALUES (4, false, "Charlis", "Border Collie", "2011-11-29", true, "2011-05-25", "small", 3.2, "veteran", 2, "va ir viskas");


INSERT INTO event(classification, name, organizer, judge_name, judge_surname, country, city, location_address, date, no_of_event_days, registration_end_date, max_dog_capacity, info) VALUES ("OFFICIAL", "test event", "test organizer", "test name", "test surname", "test country", "test city", "test address", "2022-08-04", 2, "2022-07-25", 10, "test");
INSERT INTO event(classification, name, organizer, judge_name, judge_surname, country, city, location_address, date, no_of_event_days, registration_end_date, max_dog_capacity, info) VALUES ("OFFICIAL", "test event2", "test organizer2", "test name2", "test surname2", "test country2", "test city2", "test address2", "2022-08-01", 3, "2022-07-21", 5, "test2");
INSERT INTO event(classification, name, organizer, judge_name, judge_surname, country, city, location_address, date, no_of_event_days, registration_end_date, max_dog_capacity, info) VALUES ("OFFICIAL", "test event3", "test organizer3", "test name3", "test surname3", "test country3", "test city3", "test address3", "2022-08-11", 5, "2022-08-01", 20, "test3");
INSERT INTO event(classification, name, organizer, judge_name, judge_surname, country, city, location_address, date, no_of_event_days, registration_end_date, max_dog_capacity, info) VALUES ("OFFICIAL", "test event4", "test organizer4", "test name4", "test surname4", "test country4", "test city4", "test address4", "2022-08-11", 7, "2022-08-01", 22, "test4");
INSERT INTO event(classification, name, organizer, judge_name, judge_surname, country, city, location_address, date, no_of_event_days, registration_end_date, max_dog_capacity, info) VALUES ("OFFICIAL", "test event5", "test organizer5", "test name5", "test surname5", "test country5", "test city5", "test address5", "2022-08-11", 1, "2022-08-01", 27, "test5");
INSERT INTO event(classification, name, organizer, judge_name, judge_surname, country, city, location_address, date, no_of_event_days, registration_end_date, max_dog_capacity, info) VALUES ("OFFICIAL", "test event6", "test organizer6", "test name6", "test surname6", "test country6", "test city6", "test address6", "2022-08-11", 1, "2022-08-01", 35, "test6");


INSERT INTO event_configuration(coursea0, coursea1, coursea2, coursea3, week_day, course_typea1, course_typea2, course_typea3, start_timea0, start_timea1, start_timea2, start_timea3) VALUES (true, true, true, true, "FRIDAY", "JUMPING", "AGILITY", "JUMPING_AND_AGILITY", "10:00:00", "12:00:00", "14:00:00", "16:00:00");
INSERT INTO event_configuration(coursea0, coursea1, coursea2, coursea3, week_day, course_typea1, course_typea2, course_typea3, start_timea0, start_timea1, start_timea2, start_timea3) VALUES (false, true, true, true, "SATURDAY", "JUMPING", "AGILITY", "JUMPING_AND_AGILITY", NULL, "12:00:00", "14:00:00", "16:00:00");
INSERT INTO event_configuration(coursea0, coursea1, coursea2, coursea3, week_day, course_typea1, course_typea2, course_typea3, start_timea0, start_timea1, start_timea2, start_timea3) VALUES (false, false, false, true, "SUNDAY", NULL, NULL, "JUMPING_AND_AGILITY", NULL, NULL, NULL, "16:00:00");
INSERT INTO event_configuration(coursea0, coursea1, coursea2, coursea3, week_day, course_typea1, course_typea2, course_typea3, start_timea0, start_timea1, start_timea2, start_timea3) VALUES (true, true, true, true, "SATURDAY", "JUMPING", "AGILITY", "JUMPING_AND_AGILITY", "10:00:00", "12:00:00", "14:00:00", "16:00:00");
INSERT INTO event_configuration(coursea0, coursea1, coursea2, coursea3, week_day, course_typea1, course_typea2, course_typea3, start_timea0, start_timea1, start_timea2, start_timea3) VALUES (false, true, true, true, "SUNDAY", "JUMPING", "AGILITY", "JUMPING_AND_AGILITY", NULL, "12:00:00", "14:00:00", "16:00:00");
INSERT INTO event_configuration(coursea0, coursea1, coursea2, coursea3, week_day, course_typea1, course_typea2, course_typea3, start_timea0, start_timea1, start_timea2, start_timea3) VALUES (true, false, false, false, "SATURDAY", NULL, NULL, NULL, "10:00:00", NULL, NULL, NULL);
--INSERT INTO event_configuration(coursea0, coursea1, coursea2, coursea3, week_day, course_typea1, course_typea2, course_typea3, start_timea0, start_timea1, start_timea2, start_timea3) VALUES (true, false, false, false, "THURSDAY", NULL, "JUMPING_AND_AGILITY", NULL, "10:00:00", NULL, "14:00:00", NULL);
--INSERT INTO event_configuration(coursea0, coursea1, coursea2, coursea3, week_day, course_typea1, course_typea2, course_typea3, start_timea0, start_timea1, start_timea2, start_timea3) VALUES (true, false, false, false, "THURSDAY", NULL, "JUMPING_AND_AGILITY", NULL, "10:00:00", NULL, "14:00:00", NULL);
--INSERT INTO event_configuration(coursea0, coursea1, coursea2, coursea3, week_day, course_typea1, course_typea2, course_typea3, start_timea0, start_timea1, start_timea2, start_timea3) VALUES (true, false, false, false, "THURSDAY", NULL, "JUMPING_AND_AGILITY", NULL, "10:00:00", NULL, "14:00:00", NULL);


INSERT INTO event_event_configuration(event_configuration_id, event_id) VALUES (1,1);
INSERT INTO event_event_configuration(event_configuration_id, event_id) VALUES (2,1);
INSERT INTO event_event_configuration(event_configuration_id, event_id) VALUES (3,1);
INSERT INTO event_event_configuration(event_configuration_id, event_id) VALUES (4,2);
INSERT INTO event_event_configuration(event_configuration_id, event_id) VALUES (5,2);
INSERT INTO event_event_configuration(event_configuration_id, event_id) VALUES (6,3);
--INSERT INTO event_event_configuration(event_configuration_id, event_id) VALUES (7,4);
--INSERT INTO event_event_configuration(event_configuration_id, event_id) VALUES (8,5);
--INSERT INTO event_event_configuration(event_configuration_id, event_id) VALUES (9,6);

INSERT INTO user_event_configurations(user_id, event_configurations_id) VALUES (1, 1)
INSERT INTO user_event_configurations(user_id, event_configurations_id) VALUES (1, 2)
INSERT INTO user_event_configurations(user_id, event_configurations_id) VALUES (2, 3)
INSERT INTO user_event_configurations(user_id, event_configurations_id) VALUES (3, 4)
INSERT INTO user_event_configurations(user_id, event_configurations_id) VALUES (3, 5)
INSERT INTO user_event_configurations(user_id, event_configurations_id) VALUES (4, 6)
