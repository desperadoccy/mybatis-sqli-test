#建表
create table sqlITest(
                         id int not null primary key,
                         name varchar(32) not null ,
                         password varchar(32) not null ,
                         primary key (id)
);

#另一个信息表
create table information(
                            id int not null primary key,
                            information varchar(256) null ,
                            primary key (id)
);

#加入用户

insert into sqlITest (name, password) VALUES ('test1','123');
insert into sqlITest (name, password) VALUES ('admin','another');

insert into information (information) values ('这是重要的信息');

