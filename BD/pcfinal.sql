create schema if not exists pcfinal;

create table if not exists area
(
	id int auto_increment
		primary key,
	name varchar(50) not null
);

create table if not exists cargo
(
	id int auto_increment
		primary key,
	name varchar(50) not null,
	areaid int null,
	constraint fk_area
		foreign key (areaid) references area (id)
);

create table if not exists employee
(
	id int auto_increment
		primary key,
	name varchar(50) not null,
	lastname varchar(50) null,
	email varchar(50) not null,
	birthdate date null,
	cargoid int not null,
	constraint employee_ibfk_2
		foreign key (cargoid) references cargo (id)
);

create index cargoid
	on employee (cargoid);


INSERT INTO area (name) VALUES ('Administración');
INSERT INTO area (name) VALUES ('Gerencia');
INSERT INTO area (name) VALUES ('Mantenimiento');

INSERT INTO cargo (name, areaid) VALUES ('Jefe', 1);
INSERT INTO cargo (name, areaid) VALUES ('Practicante', 1);
INSERT INTO cargo (name, areaid) VALUES ('Gerente General', 2);
INSERT INTO cargo (name, areaid) VALUES ('Gerente de Operaciones', 2);
INSERT INTO cargo (name, areaid) VALUES ('Secretario', 3);
INSERT INTO cargo (name, areaid) VALUES ('Técnico', 3);

INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Diego', 'Leon', 'dleoncen@gmail.com', '1995-07-24', 1);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Edwin', 'Maravi', 'emaravi@gmail.com', '1985-04-12', 3);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Joe', 'Valdivia', 'jvaldivia@gmail.com', '1988-01-21', 2);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Fidel', 'Salaz', 'fsalaz@gmail.com', '1989-05-21', 4);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Lucho', 'Morales', 'lmorales@gmail.com', '1991-09-01', 5);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Jose', 'Perez', 'jperez@gmail.com', '1994-01-21', 6);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Kevin', 'Ramirez', 'kramirez@gmail.com', '1995-01-21', 5);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Raul', 'Sanchez', 'rsanchez@gmail.com', '1995-01-21', 4);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Javier', 'Vargas', 'jvargas@gmail.com', '1995-01-21', 3);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Rafael', 'Oviedo', 'roviedo@gmail.com', '1988-01-21', 2);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Cesar', 'Bolivar', 'cbolivar@gmail.com', '1988-01-21', 1);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Benny', 'Buenaventura', 'bbuenaventura@gmail.com', '1996-01-21', 6);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Mari Criz', 'Mamani', 'mmamani@gmail.com', '2000-01-21', 3);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Richard', 'Monson', 'rmonson@gmail.com', '1998-01-21', 5);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Erick', 'Salazar', 'esalazar@gmail.com', '1999-01-21', 6);
INSERT INTO employee (name, lastname, email, birthdate, cargoid) VALUES ('Juanita', 'Rodriguez', 'jmendoza@gmail.com', '1995-07-24', 3);