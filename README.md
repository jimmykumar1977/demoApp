# demoApp
Demo application for a restful web service.

git clone https://github.com/jimmykumar1977/demoApp

mvn clean install

mvn tomee:run


get a user details
GET http://localhost:8080/demoapp/rest/user/{id}

get all note of a user 
GET http://localhost:8080/demoapp/rest/user/{id}/note

get a particular note 
GET http://localhost:8080/demoapp/rest/note/{id}

create a user's note
POST http://localhost:8080/demoapp/rest/user/1/note 
json data - 
{"Notes": {"title": "title","note": "note details" }}


update a note 
PUT http://localhost:8080/demoapp/rest/note/{id}
json data - 
{"Notes": {"title": "title","note": "note details" }}

delete a note 
DELETE http://localhost:8080/demoapp/rest/note/{id}


SQL :

DROP DATABASE demoapp;

create database demoapp;

use demoapp;

create table user (id serial,email varchar(50),password varchar(25),created date not null,updated date,PRIMARY KEY(id),UNIQUE KEY(email));


create table note(nid serial,title varchar(50),note varchar(1000),usrid bigint(20) unsigned,created date not null,updated date,PRIMARY KEY(nid),FOREIGN KEY(usrid) REFERENCES user(id));

insert into user(email,password,created) values ('jim@gmail.com','12345',CURRENT_DATE);

insert into user(email,password,created) values ('test@gmail.com','abcdef',CURRENT_DATE-1);

