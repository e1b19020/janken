CREATE TABLE users (
    id INT IDENTITY,
    name CHAR NOT NULL
);
CREATE TABLE matches (
    id INT IDENTITY,
    user1 INT NOT NULL,
    user2 INT NOT NULL,
    user1Hand CHAR NOT NULL,
    user2Hand CHAR NOT NULL
    FOREIGN KEY(user1) REFERENCES users(users.id)
    FOREIGN KEY(user2) REFERENCES users(users.id)
);