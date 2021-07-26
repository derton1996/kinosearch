CREATE TABLE `article_design`
(
`id` int(11) NOT NULL AUTO_INCREMENT,
PRIMARY KEY (`id`)
);

CREATE TABLE `block`
(
`id` int(11) NOT NULL AUTO_INCREMENT,
`clazz` VARCHAR(20),
`content` TEXT,
`article_design_id` int(11) DEFAULT NULL,
PRIMARY KEY (`id`),
KEY `FK_ARTICLE_DESIGN_idx` (`article_design_id`),
CONSTRAINT `FK_ARTICLE_DESIGN` FOREIGN KEY (`article_design_id`) REFERENCES `article_design` (`id`)
);
