-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ssafyns
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ssafyns
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ssafyns` DEFAULT CHARACTER SET utf8 ;
USE `ssafyns` ;

-- -----------------------------------------------------
-- Table `ssafyns`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`user` (
  `user_uid` BIGINT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(45) NOT NULL,
  `user_pw` VARCHAR(45) NOT NULL,
  `user_name` VARCHAR(45) NOT NULL,
  `user_nickname` VARCHAR(45) NULL,
  `user_phone` VARCHAR(45) NOT NULL,
  `user_email` VARCHAR(45) NOT NULL,
  `user_birth` DATE NULL,
  `user_gender` CHAR NOT NULL,
  `user_address` VARCHAR(100) NULL,
  `user_school` VARCHAR(45) NULL,
  `user_edu_city` VARCHAR(45) NOT NULL,
  `user_th` INT NOT NULL,
  `user_rank` VARCHAR(45) NOT NULL,
  `user_point` INT NOT NULL DEFAULT 0,
  `user_photo` VARCHAR(100) NOT NULL,
  `user_isleave` TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`user_uid`),
  UNIQUE INDEX `user_nickname_UNIQUE` (`user_nickname` ASC),
  UNIQUE INDEX `user_email_UNIQUE` (`user_email` ASC),
  UNIQUE INDEX `user_phone_UNIQUE` (`user_phone` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ssafyns`.`notice`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`notice` (
  `notice_no` BIGINT NOT NULL AUTO_INCREMENT,
  `notice_title` VARCHAR(45) NOT NULL,
  `notice_content` VARCHAR(20000) NOT NULL,
  `notice_date` DATETIME NOT NULL DEFAULT current_timestamp,
  `notice_hits` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`notice_no`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ssafyns`.`notice_comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`notice_comment` (
  `ncomment_no` BIGINT NOT NULL AUTO_INCREMENT,
  `user_user_uid` BIGINT NOT NULL,
  `notice_notice_no` BIGINT NOT NULL,
  `ncomment_content` VARCHAR(20000) NOT NULL,
  `ncomment_date` DATETIME NOT NULL DEFAULT current_timestamp,
  PRIMARY KEY (`ncomment_no`),
  INDEX `fk_notice_comment_user1_idx` (`user_user_uid` ASC),
  INDEX `fk_notice_comment_notice1_idx` (`notice_notice_no` ASC),
  CONSTRAINT `fk_notice_comment_user1`
    FOREIGN KEY (`user_user_uid`)
    REFERENCES `ssafyns`.`user` (`user_uid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_notice_comment_notice1`
    FOREIGN KEY (`notice_notice_no`)
    REFERENCES `ssafyns`.`notice` (`notice_no`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ssafyns`.`freeboard`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`freeboard` (
  `freeboard_no` BIGINT NOT NULL AUTO_INCREMENT,
  `freeboard_title` VARCHAR(45) NOT NULL,
  `freeboard_content` VARCHAR(20000) NOT NULL,
  `freeboard_date` DATETIME NOT NULL DEFAULT current_timestamp,
  `freeboard_hits` INT NOT NULL DEFAULT 0,
  `freeboard_likes` INT NOT NULL DEFAULT 0,
  `freeboard_hates` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`freeboard_no`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ssafyns`.`freeboard_comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`freeboard_comment` (
  `fbcomment_no` BIGINT NOT NULL AUTO_INCREMENT,
  `user_user_uid` BIGINT NOT NULL,
  `freeboard_freeboard_no` BIGINT NOT NULL,
  `fbcomment_content` VARCHAR(20000) NOT NULL,
  `fbcomment_date` DATETIME NOT NULL DEFAULT current_timestamp,
  `fbcomment_likes` INT NOT NULL DEFAULT 0,
  `fbcomment_hates` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`fbcomment_no`),
  INDEX `fk_freeboard_comment_user1_idx` (`user_user_uid` ASC),
  INDEX `fk_freeboard_comment_freeboard1_idx` (`freeboard_freeboard_no` ASC),
  CONSTRAINT `fk_freeboard_comment_user1`
    FOREIGN KEY (`user_user_uid`)
    REFERENCES `ssafyns`.`user` (`user_uid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_freeboard_comment_freeboard1`
    FOREIGN KEY (`freeboard_freeboard_no`)
    REFERENCES `ssafyns`.`freeboard` (`freeboard_no`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ssafyns`.`message`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`message` (
  `message_no` BIGINT NOT NULL AUTO_INCREMENT,
  `message_suid` BIGINT NOT NULL,
  `message_ruid` BIGINT NOT NULL,
  `message_title` VARCHAR(45) NOT NULL,
  `message_content` VARCHAR(20000) NOT NULL,
  `message_date` DATETIME NOT NULL,
  `message_isread` TINYINT NOT NULL DEFAULT 0,
  `message_rdel` TINYINT NOT NULL DEFAULT 0,
  `message_sdel` TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`message_no`),
  INDEX `fk_message_user1_idx` (`message_ruid` ASC),
  INDEX `fk_message_user2_idx` (`message_suid` ASC),
  CONSTRAINT `fk_message_user1`
    FOREIGN KEY (`message_ruid`)
    REFERENCES `ssafyns`.`user` (`user_uid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_message_user2`
    FOREIGN KEY (`message_suid`)
    REFERENCES `ssafyns`.`user` (`user_uid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
