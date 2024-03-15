CREATE TABLE `users` (
	`id` SERIAL NOT NULL,
	`username` VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`password` VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`last_name` VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`first_name` VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`job_id` INT(255) NOT NULL DEFAULT '2',
	`is_valid` INT(3) NOT NULL DEFAULT '1',
	PRIMARY KEY (`id`)
);