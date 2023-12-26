-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 26, 2023 at 06:10 PM
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
  `Product_id` int(11) NOT NULL,
  `Product_name` varchar(45) NOT NULL,
  `Price` float NOT NULL,
  `discount` float NOT NULL,
  `quantity` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`Product_id`, `Product_name`, `Price`, `discount`, `quantity`, `user_id`) VALUES
(0, '[puma bag]', 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `order_id` int(11) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `date_of_delivery` date NOT NULL,
  `payment mode` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `order`
--

INSERT INTO `order` (`order_id`, `user_name`, `address`, `date_of_delivery`, `payment mode`) VALUES
(1, '[moiz]', '[xyz street ao L23GH3]', '0000-00-00', 0);

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
(1, '[1]', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `registeration`
--

CREATE TABLE `registeration` (
  `Phone number` int(11) NOT NULL,
  `Full Name` varchar(45) NOT NULL,
  `User ID` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registeration`
--

INSERT INTO `registeration` (`Phone number`, `Full Name`, `User ID`, `Email`, `Password`) VALUES
(0, '[moiz]', '[1]', '[moiz@gmail.com]', '[123]');

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
  ADD PRIMARY KEY (`Phone number`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `order`
--
ALTER TABLE `order`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `Product_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
