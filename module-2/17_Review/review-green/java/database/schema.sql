BEGIN TRANSACTION;
DROP TABLE if exists puppies;
DROP TABLE if exists adopter;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id),
	CONSTRAINT UQ_username UNIQUE (username)
);

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');

create table adopter (
id serial PRIMARY KEY,
name VARCHAR(50)
);
INSERT INTO adopter (name) VALUES ('Jojo');

create table puppies (
	id serial PRIMARY KEY,
	name VARCHAR(50),
	weight INT,
	gender VARCHAR(50),
	paper_trained BOOLEAN,
	parent_id INT,
	CONSTRAINT FK_adopter FOREIGN KEY(parent_id) REFERENCES puppies(id)
);
insert into puppies (id, name, weight, gender, paper_trained) values (1, 'Doge', 8, 'Male', true);
insert into puppies (id, name, weight, gender, paper_trained) values (2, 'Moon-Moon', 15, 'Male', true);
insert into puppies (id, name, weight, gender, paper_trained) values (3, 'Dogerina', 10, 'Female', false);
insert into puppies (id, name, weight, gender, paper_trained) values (4, 'Hellhound', 9, 'Male', true);
insert into puppies (id, name, weight, gender, paper_trained) values (5, 'Henrietta', 14, 'Female', false);

ALTER SEQUENCE puppies_id_seq RESTART WITH 6;

COMMIT TRANSACTION;
