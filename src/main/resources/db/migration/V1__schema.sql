create table if not exists Category
(
    id   int primary key,
    name varchar
);

create table if not exists Tag
(
    id   int primary key,
    name varchar
);

create table if not exists pet_tag
(
    pet_id int,
    tag_id int
);

create table if not exists Photo_URLs
(
    pet_id int,
    url    varchar
);

create table if not exists Pet
(
    id          int primary key,
    name        varchar,
    category_id int,
    status      varchar
);
