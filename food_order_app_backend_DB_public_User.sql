create table "User"
(
    "userID"    serial,
    "firstName" text not null,
    "lastName"  text not null,
    password    text not null,
    "DoB"       date not null
);

alter table "User"
    owner to postgres;

