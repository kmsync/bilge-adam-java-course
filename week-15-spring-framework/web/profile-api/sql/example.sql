create
database profile;


select *
from pg_stat_activity
where datname = 'profile'
  and application_name != 'IntelliJ IDEA 2022.1.1';


select *
from ogrenci o
         inner join kimlik_detay kd on o.tc_kimlik = kd.tc_kimlik;
select *
from ogrenci o
         left join kimlik_detay kd on o.tc_kimlik = kd.tc_kimlik;



select query
from pg_stat_activity
where datname = 'profile'
  and application_name != 'IntelliJ IDEA 2022.1.1';
select *
from pg_stat_activity
where datname = 'profile';


create
database course;

create table ogrenci
(
    tc_kimlik int primary key,
    ad        varchar(255),
    soyad     varchar(255),
    sinif_no  int references sinif
);

create table sinif
(
    sinif_no int primary key,
    sinif    varchar(255),
    sube     varchar(255)
);


drop index ogrenci_tc_kimlik_index;

create unique index ogrenci_tc_kimlik_index on ogrenci (tc_kimlik);

drop table ogrenci;

drop index ogrenci_pk;

drop index ogrenci_tc_kimlik_uindex;

create table ogrenci_2
(
    tc_kimlik int primary key,
    ad        varchar(255),
    soyad     varchar(255),
    sinif_no  int
);

create unique index ogrenci_tc_kimlik_uindex
    on ogrenci (tc_kimlik);


insert into ogrenci(tc_kimlik, ad, soyad, sinif_no)
values (111, 'Ahmet', 'Atmaz', 17);
insert into ogrenci(tc_kimlik, ad, soyad, sinif_no)
values (222, 'Burak', 'Burmaz', 18);
insert into ogrenci(tc_kimlik, ad, soyad, sinif_no)
values (333, 'Ceyda', 'Caymaz', 18);


create table kimlik_detay
(
    tc_kimlik          int not null
        constraint kimlik_detay_pk
            primary key,
    anne_kizlik_soyadi varchar(255),
    aile_sira_no       int

);

insert into kimlik_detay(tc_kimlik, anne_kizlik_soyadi, aile_sira_no)
values (111, 'Yazmaz', 17);
insert into kimlik_detay(tc_kimlik, anne_kizlik_soyadi, aile_sira_no)
values (333, 'Duymaz', 21);

select *
from kimlik_detay;


select *
from ogrenci o
         left join kimlik_detay kd on o.tc_kimlik = kd.tc_kimlik;

select *
from ogrenci;

select *
from kimlik_detay;


drop table kimlik_detay;

constraint table_name_ogrenci_tc_kimlik_fk
        foreign key (tc_kimlik) references ogrenci



create table social_media_url
(
    id        int8 primary key,
    url       varchar(500) not null,
    header_id int8 references header (id)
);

drop table social_media_url;

create unique index social_media_url_url_uindex
    on social_media_url (url);



alter table social_media_url
    add header_id int8;

alter table social_media_url
    add constraint header_id
        foreign key (header_id) references header (id);



select *
from header h
         inner join social_media_url smu on h.id = smu.header_id;
