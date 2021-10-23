CREATE TABLE users (
    id IDENTITY,
    name CHAR NOT NULL
);
CREATE TABLE userinfo (
    user CHAR NOT NULL PRIMARY KEY,
    height DOUBLE NOT NULL
);