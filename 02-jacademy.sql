CREATE DATABASE  IF NOT EXISTS `jacademy`;
USE `jacademy`;
--
-- Table structure for table `courses`
--
DROP TABLE IF EXISTS `courses`;

CREATE TABLE `courses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_title` varchar(100) DEFAULT NULL,
  `course_category` varchar(45) DEFAULT NULL,
  `course_price` varchar(45) DEFAULT NULL,
  `course_image` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO courses (course_title, course_category, course_price, course_image)
VALUES ('Beginner to Pro in Excel: Financial Modeling and Valuation', 'Business', 'Free', './img/course01.jpg');
INSERT INTO courses (course_title, course_category, course_price, course_image)
VALUES ('Introduction to CSS', 'Web Design', 'Premium', './img/course02.jpg');
INSERT INTO courses (course_title, course_category, course_price, course_image)
VALUES ('The Ultimate Drawing Course | From Beginner To Advanced', 'Drawing', 'Premium', './img/course03.jpg');
INSERT INTO courses (course_title, course_category, course_price, course_image)
VALUES ('The Complete Web Development Course', 'Web Development', 'Free', './img/course04.jpg');
INSERT INTO courses (course_title, course_category, course_price, course_image)
VALUES ('PHP Tips, Tricks, and Techniques', 'Web Development', 'Free', './img/course05.jpg');
INSERT INTO courses (course_title, course_category, course_price, course_image)
VALUES ('All You Need To Know About Web Design', 'Web Design', 'Free', './img/course06.jpg');
INSERT INTO courses (course_title, course_category, course_price, course_image)
VALUES ('How to Get Started in Photography', 'Photography', 'Free', './img/course07.jpg');
INSERT INTO courses (course_title, course_category, course_price, course_image)
VALUES ('Typography From A to Z', 'Typography', 'Free', './img/course08.jpg');

SELECT * FROM jacademy.courses;
