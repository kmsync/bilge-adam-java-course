drop
database stock;

drop table stock;

drop table unit;

create
database stock;

create table stock
(
    id           bigserial
        constraint stock_pk
            primary key,
    name         varchar(255),
    quantity     integer,
    bought_price double precision,
    sell_price   double precision,
    stock_code   bigint,
    barcode      bigint,
    unit_id      bigint
);

create table unit
(
    id   bigserial
        constraint stock_pk
            primary key,
    name varchar(255)
);