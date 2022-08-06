-- create database for pms
CREATE SCHEMA `pms` ;

-- create product details table in pms database
CREATE TABLE `pms`.`product_details` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `PRODUCT_NAME` VARCHAR(45) NOT NULL,
  `PRODUCT_PRICE` INT NOT NULL,
  `PRODUCT_STATUS` BIT NOT NULL,
  `CREATED_ON` DATETIME NOT NULL,
  `UPDATED_ON` DATETIME NOT NULL,
  PRIMARY KEY (`ID`));
