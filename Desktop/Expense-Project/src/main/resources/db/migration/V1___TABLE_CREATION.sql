CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `email_id` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;


CREATE TABLE `expense` (
  `expense_id` int(11) NOT NULL AUTO_INCREMENT,
  `expensedate` datetime DEFAULT NULL,
  `expense_amount` varchar(255) DEFAULT NULL,
  `expense_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`expense_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;


