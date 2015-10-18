create table users(
id int,
username varchar(100) not null,
total int not null default 0,
goal int not null default 100,
primary key(id)
)