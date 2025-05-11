CREATE DATABASE jwtlearn;
-- Create db if no exist

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username TEXT NOT NULL UNIQUE,
    email TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    enabled BOOLEAN,
    verification_code TEXT,
    verification_expiration TIMESTAMP
);
