CREATE TABLE `employee_list` (
  `emp_id` int(11) NOT NULL,
  `emp_passwd` varchar(45) DEFAULT NULL,
  `emp_name` varchar(45) NOT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `late_stay_list` (
  `emp_id` int(11) NOT NULL,
  `emp_location` varchar(45) NOT NULL,
  PRIMARY KEY (`emp_id`),
  CONSTRAINT `late_stay_list_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employee_list` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `devopsdb`.`employee_list`
(`emp_id`,
`emp_passwd`,
`emp_name`)
VALUES
(20000,
'Carol','Carol');

INSERT INTO `devopsdb`.`employee_list`
(`emp_id`,
`emp_passwd`,
`emp_name`)
VALUES
(19988,
'Valisha','Valisha');

INSERT INTO `devopsdb`.`late_stay_list`
(`emp_id`,
`emp_location`)
VALUES
(20000,
'Margao');


 
