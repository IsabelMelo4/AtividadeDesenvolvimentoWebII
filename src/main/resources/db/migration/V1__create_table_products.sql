Create table products(
    id Serial primary key,
    name varchar(100) unique not null ,
    price float not null ,
    quant int not null ,
    disponivel boolean not null

);