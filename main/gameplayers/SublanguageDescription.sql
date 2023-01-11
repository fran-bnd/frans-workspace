-- model for painintg with title, genre, painter, year, and a numeric id
CREATE TABLE painting (
  id INTEGER PRIMARY KEY,
  title TEXT NOT NULL,
  genre TEXT NOT NULL, 
  year INTEGER
);

-- be able to CRUD create/read/update/delete 

-- create values
INSERT INTO painting VALUES (1, 'Ryan', 'M', 1999);
INSERT INTO painting VALUES (2, 'Joanna', 'F', 2009);
INSERT INTO painting VALUES (3, 'Untitled', 'F', 1909);
INSERT INTO painting VALUES (4, 'Composition X', 'F', 1909);
INSERT INTO painting VALUES (5, 'House D', 'F', 2004);
INSERT INTO painting VALUES (6, 'Motor Ave', 'X', 2011);

-- update values
UPDATE painting SET genre = 'Abstract' WHERE year < 2000;

-- delete values
DELETE FROM painting WHERE title = 'Untitled';

-- fetch some values
SELECT * FROM painting WHERE genre not NULL;
SELECT title FROM painting WHERE genre = 'Abstract' AND year <1950 ;

-- SQL querry clauses: 
-- WHERE (AND/OR) 
-- ORDER ASC / DESC 
-- TOP / LIMIT

SELECT * FROM painting WHERE genre != 'Abstract' ORDER BY year ASC LIMIT 3;

-- subquerries: we can querry from the result o other querries, and some

SELECT * FROM (SELECT * FROM painting WHERE genre = 'Abstract') WHERE year < 2000;

