-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2017 at 02:12 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tubes`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `NameAdmin` varchar(25) NOT NULL,
  `Id` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`NameAdmin`, `Id`) VALUES
('erik', '01'),
('gefry', '02'),
('ulfa', '03');

-- --------------------------------------------------------

--
-- Table structure for table `bioskop`
--

CREATE TABLE `bioskop` (
  `NameBioskop` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bioskop`
--

INSERT INTO `bioskop` (`NameBioskop`) VALUES
('1');

-- --------------------------------------------------------

--
-- Table structure for table `kursi`
--

CREATE TABLE `kursi` (
  `KodeKursi` varchar(3) NOT NULL,
  `NoTheater` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kursi`
--

INSERT INTO `kursi` (`KodeKursi`, `NoTheater`) VALUES
('a1', '01'),
('a2', '01'),
('a3', '01'),
('a6', '01'),
('a7', '01'),
('a8', '01'),
('a9', '01');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `NamePelanggan` varchar(25) NOT NULL,
  `IdPelanggan` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`NamePelanggan`, `IdPelanggan`) VALUES
('fathur', '001'),
('gefry', '002'),
('ulfa', '005'),
('udin', '007');

-- --------------------------------------------------------

--
-- Table structure for table `theater`
--

CREATE TABLE `theater` (
  `NoTheater` varchar(3) NOT NULL,
  `FilmTayang` varchar(25) DEFAULT NULL,
  `NameBioskop` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `theater`
--

INSERT INTO `theater` (`NoTheater`, `FilmTayang`, `NameBioskop`) VALUES
('1', 'action', '1'),
('4', 'comedy', '1');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `Kodetransaksi` varchar(5) NOT NULL,
  `Harga` float DEFAULT NULL,
  `IdPelanggan` varchar(5) DEFAULT NULL,
  `NameBioskop` varchar(25) DEFAULT NULL,
  `Jam` varchar(9) DEFAULT NULL,
  `NoTheater` varchar(3) DEFAULT NULL,
  `KodeKursi` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`Kodetransaksi`, `Harga`, `IdPelanggan`, `NameBioskop`, `Jam`, `NoTheater`, `KodeKursi`) VALUES
('005', 30000, '012', '5', '18.30', '3', 'A1'),
('006', 30000, '001', '1', '11.00', '1', 'A5'),
('011', 30000, '12', '1', '13.30', '3', 'B5'),
('0123', 30000, '001', '1', '11.00', '1', 'A9'),
('213', 30000, '001', '1', '11.00', '1', 'A6');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `bioskop`
--
ALTER TABLE `bioskop`
  ADD PRIMARY KEY (`NameBioskop`);

--
-- Indexes for table `kursi`
--
ALTER TABLE `kursi`
  ADD PRIMARY KEY (`KodeKursi`),
  ADD KEY `NoTheater` (`NoTheater`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`IdPelanggan`);

--
-- Indexes for table `theater`
--
ALTER TABLE `theater`
  ADD PRIMARY KEY (`NoTheater`),
  ADD KEY `NameBioskop` (`NameBioskop`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`Kodetransaksi`),
  ADD KEY `IdPelanggan` (`IdPelanggan`),
  ADD KEY `IdPelanggan_2` (`IdPelanggan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
