CREATE TABLE students (
    id BIGINT GENERATED BY DEFAULT AS IDENTITY,
    login VARCHAR(255),
    name VARCHAR(255),
    password VARCHAR(255),
    series VARCHAR(255),
    PRIMARY KEY (id)
);
