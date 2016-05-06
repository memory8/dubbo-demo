DROP TABLE IF EXISTS `act_demo`;

CREATE TABLE `act_demo` (
  `id` decimal(18,0) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sex` decimal(2,0) DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


insert  into `act_demo`(`id`,`name`,`sex`,`create_date`) values ('0','张三','1','2016-05-06 16:15:05'),('1','李雪','0','2016-05-06 16:15:58');

