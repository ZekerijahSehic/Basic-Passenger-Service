CREATE TABLE passenger (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    firstname VARCHAR(16) NOT NULL,
    lastname VARCHAR(16) NOT NULL,
    passportid VARCHAR(16) NOT NULL,
    email VARCHAR(64) NOT NULL,
    PRIMARY KEY (id)
);