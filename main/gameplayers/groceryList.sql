--create table grocery (id int primary key, name varchar(255), price decimal);

--insert into grocery (id, name, price) values (1, 'banana', 1.44),(2,'bacon',4.89),(3, 'milk', 4.44),(5,'eggs',5.89);

-- AGREGATES / GROUP BY 
-- ALTER TABLE (e.g. adda a new column after the table was created)

-- alter table grocery add type varchar(255);

-- update grocery set type ='produce' where name not null;
-- update grocery set type = 'meat' where name = 'bacon';


--insert into grocery (id, name, price, type) values (6, 'meat', 10.44, 'meat');
--insert into grocery (id, name, price, type) values (7, 'bread', 5.49, 'bakery');


-- select * from grocery;

select sum(price) from grocery;
select avg(price) from grocery;
select max(price) from grocery;

select count(*) from grocery group by type;

select min(price) as lowest_price, type from grocery group by type;

select count(*), type from grocery group by type having type = 'produce';
