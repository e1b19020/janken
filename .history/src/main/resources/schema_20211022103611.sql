CREATE TABLE users (
    id IDENTITY NOT NULL PRIMARY KEY,
    name CHAR NOT NULL
);
CREATE TABLE matches (
    id IDENTITY NOT NULL PRIMARY KEY,
    user1 INT NOT NULL,
    user2 INT NOT NULL,
    user1Hand CHAR NOT NULL,
    user2Hand CHAR NOT NULL
    FOREIGN KEY(user1) REFERENCES users(id)
    FOREIGN KEY(user2) REFERENCES users(id)

);