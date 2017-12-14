-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.5.46-log - MySQL Community Server (GPL)
-- Операционная система:         Win64
-- HeidiSQL Версия:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных shop
CREATE DATABASE IF NOT EXISTS `shop` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `shop`;

-- Дамп структуры для таблица shop.catalogs
CREATE TABLE IF NOT EXISTS `catalogs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы shop.catalogs: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `catalogs` DISABLE KEYS */;
INSERT INTO `catalogs` (`id`, `name`) VALUES
	(1, 'w_clothes'),
	(2, 'm_clothes'),
	(3, 'food');
/*!40000 ALTER TABLE `catalogs` ENABLE KEYS */;

-- Дамп структуры для таблица shop.products
CREATE TABLE IF NOT EXISTS `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `catalogs_id` int(11) NOT NULL,
  `name` char(50) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`),
  KEY `catalogs_id` (`catalogs_id`),
  CONSTRAINT `FK_products_catalogs` FOREIGN KEY (`catalogs_id`) REFERENCES `catalogs` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы shop.products: ~4 rows (приблизительно)
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` (`id`, `catalogs_id`, `name`, `price`) VALUES
	(1, 3, 'bun', 5.75),
	(2, 2, 'cravat', 75.3),
	(3, 2, 'cravat1', 150),
	(4, 2, 'cravat', 50.5);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;

-- Дамп структуры для таблица shop.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` tinytext,
  `password` tinytext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы shop.users: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `login`, `password`) VALUES
	(1, 'Ivanov', 'Ivanov111'),
	(2, 'Petrov', 'Petrov222'),
	(3, 'Sidorov', 'Sidorov333');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Дамп структуры для таблица shop.user_bag
CREATE TABLE IF NOT EXISTS `user_bag` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `count` int(11) NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `user_id` (`user_id`),
  KEY `FK_user_bag_products` (`product_id`),
  CONSTRAINT `FK_user_bag_products` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
  CONSTRAINT `FK_user_bag_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Дамп данных таблицы shop.user_bag: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `user_bag` DISABLE KEYS */;
INSERT INTO `user_bag` (`ID`, `user_id`, `product_id`, `count`, `date`) VALUES
	(1, 1, 1, 2, '2017-12-12 22:38:27'),
	(2, 2, 3, 1, '2017-12-12 22:42:31'),
	(3, 2, 1, 1, '2017-12-11 22:43:13');
/*!40000 ALTER TABLE `user_bag` ENABLE KEYS */;

-- Дамп структуры для представление shop.v_select
-- Создание временной таблицы для обработки ошибок зависимостей представлений
CREATE TABLE `v_select` (
	`login` TINYTEXT NULL COLLATE 'utf8_general_ci',
	`cat` CHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`prod` CHAR(50) NOT NULL COLLATE 'utf8_general_ci',
	`price` FLOAT NOT NULL,
	`count` INT(11) NOT NULL,
	`date` DATETIME NOT NULL,
	`Itogo` DOUBLE NOT NULL
) ENGINE=MyISAM;

-- Дамп структуры для представление shop.v_select
-- Удаление временной таблицы и создание окончательной структуры представления
DROP TABLE IF EXISTS `v_select`;
CREATE ALGORITHM=UNDEFINED DEFINER=`StElena`@`%` SQL SECURITY DEFINER VIEW `v_select` AS select `users`.`login` AS `login`,`catalogs`.`name` AS `cat`,`products`.`name` AS `prod`,`products`.`price` AS `price`,`user_bag`.`count` AS `count`,`user_bag`.`date` AS `date`,(`user_bag`.`count` * `products`.`price`) AS `Itogo` from (((`user_bag` join `users`) join `products`) join `catalogs`) where ((`user_bag`.`user_id` = `users`.`id`) and (`user_bag`.`product_id` = `products`.`id`) and (`products`.`catalogs_id` = `catalogs`.`id`)) group by `users`.`login`,`catalogs`.`name`,`products`.`name`;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
