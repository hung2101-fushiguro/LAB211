create database FruitStore;
use FruitStore;

create table Fruit(
fruit_id varchar(50) primary key,
fruit_name varchar(50) not null,
fruit_price decimal(10,2) check(fruit_price > 0),
fruit_quantity int check(fruit_quantity >= 0),
fruit_origin varchar(100)
);

create table Orders(
order_id int identity(1,1) primary key,
customer_name nvarchar(100),
total decimal (10,2)
);

create table OrderDetail(
detail_id int identity(1,1) primary key,
order_id  int not null,
fruit_id  varchar(50) not null,
quantity int check(quantity > 0),
price decimal(10,2) check(price > 0)
foreign key(order_id) references Orders(order_id),
foreign key(fruit_id) references Fruit(fruit_id)
);

INSERT INTO Fruit (fruit_id, fruit_name, fruit_price, fruit_quantity, fruit_origin)
VALUES
('F001', N'Apple Fuji',        2.50, 120, N'Japan'),
('F002', N'Banana Cavendish',  1.20, 200, N'Vietnam'),
('F003', N'Orange Navel',      2.00, 150, N'Australia'),
('F004', N'Grapes Red Globe',  3.50, 90,  N'USA'),
('F005', N'Mango Cat Chu',     2.80, 110, N'Vietnam'),
('F006', N'Pineapple Queen',   1.90, 80,  N'Thailand');