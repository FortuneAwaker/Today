CREATE TABLE _user
(
    id        SERIAL PRIMARY KEY  NOT NULL,
    firstname varchar(50)         NOT NULL,
    lastname  varchar(50)         NOT NULL,
    email     varchar(100) UNIQUE NOT NULL,
    password  varchar(255)        NOT NULL,
    role      varchar(20)         NOT NULL,
    active    boolean             NOT NULL
);