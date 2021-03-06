CREATE USER SCPE_OWNER 
    IDENTIFIED BY "king*457"
    DEFAULT TABLESPACE users 
    QUOTA 200M ON users 
    TEMPORARY TABLESPACE temp;
    
    grant CREATE SESSION, ALTER SESSION, CREATE DATABASE LINK, -
  CREATE MATERIALIZED VIEW, CREATE PROCEDURE, CREATE PUBLIC SYNONYM, -
  CREATE ROLE, CREATE SEQUENCE, CREATE SYNONYM, CREATE TABLE, - 
  CREATE TRIGGER, CREATE TYPE, CREATE VIEW, UNLIMITED TABLESPACE -
  to SCPE_OWNER;