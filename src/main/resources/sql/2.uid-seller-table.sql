alter table seller add column uid varchar(50) not null;

update seller set uid = uuid();