CREATE TABLE `shifts` (
	`id` SERIAL NOT NULL,
	`user_id` INT(255) NOT NULL,
	`date_at` DATE NOT NULL,
	PRIMARY KEY (`id`)
);