CREATE TABLE users (
    id INT IDENTITY PRIMARY KEY,
    name CHAR NOT NULL
);
CREATE TABLE matches (
    id INT IDENTITY PRIMARY KEY,
    user1 INT NOT NULL,
    user2 INT NOT NULL,
    user1Hand CHAR NOT NULL,
    user2Hand CHAR NOT NULL
    FOREIGN KEY(id) REFERENCES users(id)
);