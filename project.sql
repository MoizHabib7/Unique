-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 02, 2024 at 08:55 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--
CREATE DATABASE IF NOT EXISTS `project` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `project`;

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `Product_name` varchar(45) NOT NULL,
  `Price` float NOT NULL,
  `discount` float NOT NULL,
  `quantity` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`Product_name`, `Price`, `discount`, `quantity`, `user_id`) VALUES
('[puma bag]', 0, 0, 0, 0),
('cloths', 100, 10, 70, 1),
('cloths', 100, 10, 70, 1),
('cloths', 100, 10, 70, 1),
('cloths', 100, 10, 70, 1),
('cloths', 100, 10, 70, 1),
('cloths', 100, 10, 70, 1),
('cloths', 100, 10, 70, 1),
('glass', 100, 20, 2, 1),
('jaskha', 9090, 908, 324, 1),
('Sample Product', 10, 2, 1, 1),
('glass', 122, 5, 1, 1),
('brown bag(puma)', 1000, 50, 1, 1),
('brown bag(puma)', 1000, 50, 1, 1),
('glass', 122, 5, 1, 1),
('brown bag(puma)', 1000, 50, 1, 7),
('brown bag(puma)', 1000, 50, 1, 7),
('brown bag(puma)', 1000, 50, 1, 8),
('glass', 122, 5, 1, 8),
('brown bag(puma)', 1000, 50, 1, 9);

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `order_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `date_of_delivery` varchar(45) NOT NULL,
  `payment mode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `order`
--

INSERT INTO `order` (`order_id`, `user_id`, `user_name`, `address`, `date_of_delivery`, `payment mode`) VALUES
(1, 0, 'moiz', 'abc street SK23K', '2023-12-28', 500),
(2, 0, 'fhuj', 'ghfh', '2024-1-1', 100),
(3, 0, 'ahmed', 'MaJU', '2/12/23', 1),
(4, 0, 'moiz', 'gand bala', '1/1/24', 2),
(5, 0, 'moiz', 'han bhai', '1/1/24', 2),
(6, 0, 'jkkjkj', 'jaskha', '9090', 908),
(7, 0, 'jkkjkj', 'jaskha', '9090', 908),
(8, 0, 'moiz', 'sajg', '2024-1-1', 100),
(9, 0, '1', 'guhjtgu', '2024-01-12', -71611),
(10, 0, '1', 'guhjtgu', '2024-01-12', 10917),
(11, 0, '7', 'address', '2024-01-18', 1900),
(12, 0, '7', 'address', '2024-01-18', 1900),
(13, 0, '7', 'address', '2024-01-18', 1900),
(14, 0, '7', 'address', '2024-01-18', 1900),
(15, 0, '8', 'address', '2024-02-06', 950);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `Product_id` int(11) NOT NULL,
  `Product_name` varchar(45) NOT NULL,
  `Price` float NOT NULL,
  `discount` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`Product_id`, `Product_name`, `Price`, `discount`) VALUES
(1001, 'brown bag(puma)', 1000, 50),
(1002, 'glass', 122, 5);

-- --------------------------------------------------------

--
-- Table structure for table `registeration`
--

CREATE TABLE `registeration` (
  `Phone_number` int(11) NOT NULL,
  `Full_Name` varchar(45) NOT NULL,
  `User_ID` int(11) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registeration`
--

INSERT INTO `registeration` (`Phone_number`, `Full_Name`, `User_ID`, `Email`, `Password`) VALUES
(67676, 'moiz', 1, 'moiz@gmail.com', '123'),
(5454554, 'ffddf', 2, 'ghgtf', '234'),
(324, 'sasa', 3, 'jaskha', '908'),
(324, 'sasa', 4, 'jaskha', '908'),
(324, 'sasa', 5, 'jaskha', '908'),
(55575765, 'dgsdc', 6, 'thdgf', '123'),
(321312321, 'Sanaullah Khatri ', 7, 'sanaullahzulfiqar020@gmail.com', '456'),
(218301983, 'Aakhtar', 8, 'sdakldj@gmail.com', '987'),
(686897, 'danial shodri', 9, 'sadjakjuj@gmail.com', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`Product_id`);

--
-- Indexes for table `registeration`
--
ALTER TABLE `registeration`
  ADD PRIMARY KEY (`User_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `order`
--
ALTER TABLE `order`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `Product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1004;

--
-- AUTO_INCREMENT for table `registeration`
--
ALTER TABLE `registeration`
  MODIFY `User_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
