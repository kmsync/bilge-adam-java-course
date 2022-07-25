create
database test;

CREATE tAbLe person
(
    id      serial primary key,
    name    varchar(255),
    surname varchar(255)
);


CREATE tAbLe data_type
(
    id      serial primary key,
    name    varchar(255),
    surname varchar(255),
    a       char,
    b       char(5),
    c       text,
    --smallint ve int2 birbirinin aliasıdır.
    d       int2,
    e       smallint,
    -- int integer ve int4 birbirlerini aliasıdır.
    f       int,
    g       integer,
    h       int4,
    -- bigint ve int8 aliasedır.
    i       bigint,
    j       int8,
    k       double precision,
    l       real,
    m       numeric,
    n       boolean,
    o       date,
    u       time,
    v       timestamp,
    y       timestamptz
);


create table users
(
    id      integer primary key not null,
    name    varchar(50)         not null,
    surname varchar(50)         not null
);


DrOp TaBlE users;

alter table data_type
    add new_column_2 int;

-- Tablonun database üzerinde işlemler yaparken. Veri değiştirilemez.
-- CREATE = Oluştururken.
-- DROP = Silerken
-- ALTER = Güncellerken.

-- DML Sorguları
-- Select = Veriyi getirmek için.
-- Update = Veriyi güncellemek için.
-- Delete = Veriyi silmek için.
-- Insert = Veri eklemek için.


select *
from person
where id = 4;
select *
from person
where id < 2;
select *
from person
where id > 2;
select *
from person
where id >= 2;



select id, name
from person
where id >= 2
  and name = 'Burak';


select *
from person
where name = 'Ahmet'
   or name = 'Burak';

select *
from person
where name like '%eT';

select *
from person
where name ilike '%eT';

-- group by
-- having
-- order by

select id, name, surname
from data_type;


select *
from person
where id in (1, 3, 4);


select *
from person
where id = 1
   or id = 3
   or id = 4;


create table member
(
    id   serial primary key,
    name varchar(255),
    age  int
);

select *
from member
where age in (18, 19);

select *
from member
where name in ('Ahmet', 'Ali');


select *
from member
where age not in (18, 19);

select *
from member
where age is not null
  and name is not null;


select *
from member
where name is not null
  and age is null;


select *
from member
where name is null
   or name = '';

select *
from member
where age between 21 and 30;

select *
from member
where age not between 21 and 30;


select *
from member
order by age desc;

select *
from member
order by age asc;

insert into member
values (10, 'Burak', 27);

select *
from member;



insert into member(name, age)
values ('Meriç', 30);
insert into member(name)
values ('Furkan');

select *
from member;

update member
set name='Burak'
where id = 11;

update member
set name='Meriç',
    age=22
where id = 11;

update member
set age=24
where id = 12;


update member
set age=24,
    name='Büşra'
where id = 9;

update member
set name='Gizem'
where id = 7;

update member
set age=22
where id = 8
  and id = 6;
update member
set age=23
where id in (6, 8);

update member
set age=22
where id = 6;

delete
from member
where age = 24;

select *
from member
order by id desc;

CREATE TABLE employee
(
    id       SERIAL PRIMARY KEY,
    name     VARCHAR(50),
    surname  VARCHAR(50),
    address  VARCHAR(50),
    identity VARCHAR(13) UNIQUE
);

--alter table member --DDL
--update member set --DML


insert into employee(identity)
values (1);
insert into employee(identity)
values ('Burak');
insert into employee(identity)
values ('burak');
insert into employee(identity)
values ('burak');


drop table employee;
drop table data_type;
drop table person_2;

drop
database test;

alter table member
    add column new_column_3 int;

alter table member drop column new_column_3;

alter table member rename column age to burak;
alter table member rename column burak to age;


select name as something
from member;

select count(*) as rowCount, age, name
from member
group by age, name
order by rowCount desc;

insert into member(name, age)
values ('Ahmet', 18);


create table country
(
    id   serial primary key,
    name varchar(255)
);

alter table country
    add column cityName varchar(255);


insert into country(name, cityName)
values ('Türkiye', 'Ankara');
insert into country(name, cityName)
values ('Türkiye', 'İstanbul');
insert into country(name, cityName)
values ('Türkiye', 'İzmir');
insert into country(name, cityName)
values ('Almanya', 'Berlin');
insert into country(name, cityName)
values ('Almanya', 'Strasburg');
insert into country(name, cityName)
values ('İngiltere', 'London');
insert into country(name, cityName)
values ('İngiltere', 'Manchester');


select count(*) as recordCount, name
from country
group by name
order by recordCount desc;

select *
from country;

create
database dvdrental;

select count(*)
from customer;

select count(*)
from customer
where first_name like '%ab%'
   or first_name like '%ig%';


select distinct(rental_duration)
from film;

SELECT filmtable.*
FROM public.film as filmtable
ORDER BY rental_rate LIMIT 501;


select *
from film
where rental_duration in (6, 7, 3)
