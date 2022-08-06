create table Spittle (
	id identity,
	message varchar(140) not null,
	created_at varchar(20) not null,
	latitude double,
	longitude double
);

create table Spitter (
	id identity,
	username varchar(20) unique not null,
	password varchar(20) not null,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	email varchar(30) not null
);


INSERT INTO Spittle (message, created_at, latitude,longitude) VALUES
('test', '2020-08-07', 2,2);