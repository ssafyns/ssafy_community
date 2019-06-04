-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema ssafyns
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `ssafyns` ;

-- -----------------------------------------------------
-- Schema ssafyns
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ssafyns` DEFAULT CHARACTER SET utf8 ;
USE `ssafyns` ;

-- -----------------------------------------------------
-- Table `ssafyns`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`user` (
  `user_uid` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(45) NOT NULL,
  `user_pw` VARCHAR(45) NOT NULL,
  `user_name` VARCHAR(45) NOT NULL,
  `user_nickname` VARCHAR(45) NULL DEFAULT NULL,
  `user_phone` VARCHAR(45) NOT NULL,
  `user_email` VARCHAR(45) NOT NULL,
  `user_birth` DATE NULL DEFAULT NULL,
  `user_gender` CHAR(1) NOT NULL,
  `user_address` VARCHAR(100) NULL DEFAULT NULL,
  `user_school` VARCHAR(45) NULL DEFAULT NULL,
  `user_edu_city` VARCHAR(45) NOT NULL,
  `user_th` INT(11) NOT NULL,
  `user_rank` VARCHAR(45) NOT NULL DEFAULT '준회원',
  `user_point` INT(11) NOT NULL DEFAULT 0,
  `user_photo` VARCHAR(100) NOT NULL,
  `user_isleave` TINYINT(4) NOT NULL DEFAULT 0,
  PRIMARY KEY (`user_uid`),
  UNIQUE INDEX `user_email_UNIQUE` (`user_email` ASC) ,
  UNIQUE INDEX `user_phone_UNIQUE` (`user_phone` ASC) ,
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC) ,
  UNIQUE INDEX `user_nickname_UNIQUE` (`user_nickname` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ssafyns`.`freeboard`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`freeboard` (
  `freeboard_no` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `freeboard_user_uid` BIGINT(20) NOT NULL,
  `freeboard_title` VARCHAR(45) NOT NULL,
  `freeboard_content` VARCHAR(20000) NOT NULL,
  `freeboard_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  `freeboard_hits` INT(11) NOT NULL DEFAULT 0,
  `freeboard_likes` INT(11) NOT NULL DEFAULT 0,
  `freeboard_hates` INT(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`freeboard_no`),
  INDEX `fk_freeboard_user1_idx` (`freeboard_user_uid` ASC) ,
  CONSTRAINT `fk_freeboard_user1`
    FOREIGN KEY (`freeboard_user_uid`)
    REFERENCES `ssafyns`.`user` (`user_uid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ssafyns`.`freeboard_comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`freeboard_comment` (
  `fbcomment_no` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `fbcomment_user_uid` BIGINT(20) NOT NULL,
  `fbcomment_freeboard_no` BIGINT(20) NOT NULL,
  `fbcomment_content` VARCHAR(20000) NOT NULL,
  `fbcomment_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  `fbcomment_likes` INT(11) NOT NULL DEFAULT 0,
  `fbcomment_hates` INT(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`fbcomment_no`),
  INDEX `fk_freeboard_comment_user1_idx` (`fbcomment_user_uid` ASC) ,
  INDEX `fk_freeboard_comment_freeboard1_idx` (`fbcomment_freeboard_no` ASC) ,
  CONSTRAINT `fk_freeboard_comment_freeboard1`
    FOREIGN KEY (`fbcomment_freeboard_no`)
    REFERENCES `ssafyns`.`freeboard` (`freeboard_no`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_freeboard_comment_user1`
    FOREIGN KEY (`fbcomment_user_uid`)
    REFERENCES `ssafyns`.`user` (`user_uid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ssafyns`.`message`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`message` (
  `message_no` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `message_suid` BIGINT(20) NOT NULL,
  `message_ruid` BIGINT(20) NOT NULL,
  `message_title` VARCHAR(45) NOT NULL,
  `message_content` VARCHAR(20000) NOT NULL,
  `message_date` DATETIME NOT NULL,
  `message_isread` TINYINT(4) NOT NULL DEFAULT 0,
  `message_rdel` TINYINT(4) NOT NULL DEFAULT 0,
  `message_sdel` TINYINT(4) NOT NULL DEFAULT 0,
  PRIMARY KEY (`message_no`),
  INDEX `fk_message_user1_idx` (`message_ruid` ASC) ,
  INDEX `fk_message_user2_idx` (`message_suid` ASC) ,
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
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ssafyns`.`notice`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`notice` (
  `notice_no` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `notice_title` VARCHAR(45) NOT NULL,
  `notice_content` VARCHAR(20000) NOT NULL,
  `notice_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  `notice_hits` INT(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`notice_no`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `ssafyns`.`notice_comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ssafyns`.`notice_comment` (
  `ncomment_no` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `ncomment_user_uid` BIGINT(20) NOT NULL,
  `ncomment_notice_no` BIGINT(20) NOT NULL,
  `ncomment_content` VARCHAR(20000) NOT NULL,
  `ncomment_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP(),
  PRIMARY KEY (`ncomment_no`),
  INDEX `fk_notice_comment_user1_idx` (`ncomment_user_uid` ASC) ,
  INDEX `fk_notice_comment_notice1_idx` (`ncomment_notice_no` ASC) ,
  CONSTRAINT `fk_notice_comment_notice1`
    FOREIGN KEY (`ncomment_notice_no`)
    REFERENCES `ssafyns`.`notice` (`notice_no`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_notice_comment_user1`
    FOREIGN KEY (`ncomment_user_uid`)
    REFERENCES `ssafyns`.`user` (`user_uid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
