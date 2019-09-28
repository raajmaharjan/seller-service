create schema seller_service_db;

use seller_service_db;

create table seller(
id bigint(15) not null auto_increment,
name varchar(50) not null,
phone varchar(20) not null,
country_code varchar(100) not null,
created_at datetime not null,
email varchar(70),
active boolean default true not null,
primary key (id)
);

create table seller_login(
id bigint(15) not null auto_increment,
username varchar(50) not null,
password varchar(100) not null,
last_signed_on datetime not null,
seller_id bigint(15) not null,
created_at datetime not null,
primary key (id),
foreign key(seller_id) references seller(id)
);

