DROP TABLE IF EXISTS USER_DETAILS;
CREATE TABLE USER_DETAILS ( 
    
    USER_DETAILS_ID INT PRIMARY KEY NOT NULL, 
    NAME VARCHAR(50), 
    SURNAME VARCHAR(50), 
    PHONE_NUMBER VARCHAR(10)
    
) ;

ALTER TABLE USER ADD CONSTRAINT FK_USER_DETAILS FOREIGN KEY (USER_DETAILS_ID) REFERENCES USER_DETAILS(USER_DETAILS_ID);