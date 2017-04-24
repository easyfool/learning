CREATE TABLE `customer` (
  `customer_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name`        VARCHAR(100)     NOT NULL,
  `age`         INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`customer_id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8;