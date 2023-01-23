

create table artist(id integer primary key, name varchar(255));
create table painting(id integer, title varchar(255), artist_id integer references artist(id));

--insert into artist(id, name) values (1, 'bill smith'), (2, 'sally example'), (3, 'john doe');
--insert into painting(id, title, artist_id) values (1, 'nice landscape', 3);
--insert into painting (id, title, artist_id) values (2, 'lovely portrait', 3);

--drop table artist;
--drop table painting;

--update artist set name = 'johnny doe' where name = 'john doe';
--insert into painting(id, title, artist) values (3, 'abstract masterpiece', 'sally example');
--delete from artist where id = 2;

--insert into artist (id, name) values (4, 'abc xyz');
--insert into painting (id, title, artist_id) values (4, 'nice sketch', 4);

--insert into painting(id, title, artist_id) values (3, 'unknown artists painting', 8);

--delete from artist where name = 'sally example'