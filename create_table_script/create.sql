CREATE database FavoriteFoot
DEFAULT CHARACTER SET utf8
COLLATE  utf8_general_ci;


/*CREATE USER TABLE*/

create table USER (
  id VARCHAR (255) PRIMARY KEY  NOT NULL,
  name VARCHAR (255) NOT NULL,
  email VARCHAR (255) NOT NULL ,
  password VARCHAR (255) NOT NULL ,
  accout VARCHAR (255) NOT NULL ,
  sex INT 1,
  address VARCHAR (255) ,
  phone VARCHAR (255),
  qq VARCHAR (255)
);



