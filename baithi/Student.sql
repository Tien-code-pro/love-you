create database if not exists Student;
use Student;

create table StudentOne(
     studentId varchar(50),
     name varchar(50),
     address varchar(50),
     phone int
);
insert into StudentOne(studentId, name, address, phone )values
(B01010, "Nguyen Tuan Anh" , "Ha Noi", 0904818238),
(B10394, "Nguyen Hoang Hai" , "Hai Duong", 0494949494);
