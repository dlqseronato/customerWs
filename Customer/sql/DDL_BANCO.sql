DROP TABLE USERS;
DROP TABLE "ROLE";
DROP TABLE ORDER_ITENS;
DROP TABLE "ORDER";
DROP TABLE PRODUCT;
DROP TABLE CUSTOMER;
DROP TABLE PHONE;
DROP TABLE ADDRESS;




CREATE TABLE PRODUCT(
    ID NUMBER,
    DESCRIPTION VARCHAR2(200),
    UNITY_TYPE VARCHAR2(10),
    UNITY_BUY_VALUE NUMBER(10,2),
    UNITY_SELL_VALUE NUMBER(10,2),
	QUANTITY NUMBER(10),
    PRIMARY KEY (ID)
);
COMMENT ON COLUMN PRODUCT.ID
   IS 'Product ID id';
   COMMENT ON COLUMN PRODUCT.DESCRIPTION
   IS 'Product description';
COMMENT ON COLUMN PRODUCT.UNITY_TYPE
   IS 'The unity measure of one unity of the product Ex. meters';
   COMMENT ON COLUMN PRODUCT.UNITY_BUY_VALUE
   IS 'The BUY value of one unity of the product';
      COMMENT ON COLUMN PRODUCT.UNITY_SELL_VALUE
   IS 'The SELL value of one unity of the product';

CREATE TABLE "ROLE"(
    ID NUMBER,
    DESCRIPTION VARCHAR2(150),
    PRIMARY KEY (ID)
);
 
CREATE TABLE USERS(
    ID NUMBER,
    FIRST_NAME VARCHAR2(100),
    LAST_NAME VARCHAR2(120),
    CPF NUMBER(11) NOT NULL,
    EMAIL VARCHAR(150) NOT NULL,
    PASSWORD VARCHAR(150) NOT NULL,
    BORN_DATE DATE,
    ROLE_ID NUMBER,
    PRIMARY KEY (ID)
);

ALTER TABLE USERS ADD FOREIGN KEY (ROLE_ID) REFERENCES ROLE (ID);


CREATE TABLE ADDRESS(
    ID NUMBER,
    STREET VARCHAR2(200),
    "NUMBER" NUMBER,
    ZIP_CEP NUMBER(8),
    NEIGHBORHOOD VARCHAR2(100),
    CITY VARCHAR2(100),
    STATE VARCHAR2(100),
    COUNTRY VARCHAR2(100),
    PRIMARY KEY (ID)
);

CREATE TABLE PHONE(
    ID NUMBER,
    DDD NUMBER(2),
    "NUMBER" NUMBER(9),
    PRIMARY KEY (ID)
);

CREATE TABLE CUSTOMER(
    ID NUMBER,
    FIRST_NAME VARCHAR2(100),
    LAST_NAME VARCHAR2(150),
    CPF NUMBER(11),
    EMAIL VARCHAR2(150),
    PASSWORD VARCHAR2(150),
    BORN_DATE DATE,
    ADDRESS_ID NUMBER,
    PHONE_ID NUMBER,
    PRIMARY KEY (ID)
);

ALTER TABLE CUSTOMER ADD FOREIGN KEY (ADDRESS_ID) REFERENCES ADDRESS (ID);
ALTER TABLE CUSTOMER ADD FOREIGN KEY (PHONE_ID) REFERENCES PHONE (ID);

CREATE TABLE "ORDER" (
    ID NUMBER,
    CUSTOMER_ID NUMBER,
    ORDER_OPENED_DATE DATE,
    ORDER_CLOSED_DATE DATE,
    PRIMARY KEY (ID)
);
ALTER TABLE "ORDER" ADD FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER (ID);

CREATE TABLE ORDER_ITENS(
    ID NUMBER,
    ORDER_ID NUMBER NOT NULL,
    PRODUCT_ID NUMBER NOT NULL,
    UNITY_VALUE NUMBER(10,2) NOT NULL,
    TOTAL_VALUE NUMBER(10,2) NOT NULL,
    QUANTITY NUMBER,
    PRIMARY KEY (ID)
);

ALTER TABLE ORDER_ITENS ADD FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT (ID);
ALTER TABLE ORDER_ITENS ADD FOREIGN KEY (ORDER_ID) REFERENCES "ORDER" (ID);



