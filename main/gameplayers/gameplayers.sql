-- model the player of a video game
CREATE TABLE player (
  id INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  points INT,
  game INT
);

CREATE TABLE game (
  id INTEGER PRIMARY KEY,
  title TEXT NOT NULL,
  genre TEXT
);

-- insert records
INSERT INTO player VALUES (1, 'Ryan', 90, 103);
INSERT INTO player VALUES (2, 'Joanna', 22, 104);
INSERT INTO player VALUES (3, 'Jhon', 55, 104);
INSERT INTO player VALUES (4, 'Mia', null, 105);


INSERT INTO game VALUES (103, 'Tetris', 'retro');
INSERT INTO game VALUES (104, 'GTA', 'platformer');
INSERT INTO game VALUES (105, 'Mario Cart', 'platformer');


-- querry some records
SELECT * FROM player WHERE game not null;
SELECT title FROM game INNER JOIN player ON player.game=game.id;
