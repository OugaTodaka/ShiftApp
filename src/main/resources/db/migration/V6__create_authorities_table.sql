CREATE TABLE `authorities` (
	`id` SERIAL NOT NULL,
	`username` VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
	`authority` VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL
);
INSERT INTO `authorities` (`username`,`authority`)
VALUES ('admin','ROLE_ADMIN'),
	   ('admin','ROLE_USER');