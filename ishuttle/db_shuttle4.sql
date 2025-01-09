-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2025 at 07:17 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_shuttle4`
--

-- --------------------------------------------------------

--
-- Table structure for table `kursi`
--

CREATE TABLE `kursi` (
  `id` bigint(20) NOT NULL,
  `nomor_kursi` int(11) NOT NULL,
  `ketersediaan` tinyint(1) NOT NULL DEFAULT 1,
  `shuttle_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kursi`
--

INSERT INTO `kursi` (`id`, `nomor_kursi`, `ketersediaan`, `shuttle_id`) VALUES
(28, 1, 1, 4),
(29, 2, 0, 4),
(30, 3, 0, 4),
(31, 4, 0, 4),
(32, 5, 1, 4),
(33, 6, 1, 4),
(34, 7, 1, 4),
(35, 8, 1, 4),
(36, 9, 1, 4),
(37, 1, 1, 5),
(38, 2, 0, 5),
(39, 3, 1, 5),
(40, 4, 1, 5),
(41, 5, 1, 5),
(42, 6, 1, 5),
(43, 7, 0, 5),
(44, 8, 1, 5),
(45, 9, 1, 5),
(46, 1, 1, 6),
(47, 2, 1, 6),
(48, 3, 1, 6),
(49, 4, 1, 6),
(50, 5, 1, 6),
(51, 6, 1, 6),
(52, 7, 1, 6),
(53, 8, 1, 6),
(54, 9, 1, 6),
(55, 1, 1, 7),
(56, 2, 1, 7),
(57, 3, 1, 7),
(58, 4, 1, 7),
(59, 5, 1, 7),
(60, 6, 1, 7),
(61, 7, 1, 7),
(62, 8, 1, 7),
(63, 9, 1, 7),
(64, 1, 1, 8),
(65, 2, 1, 8),
(66, 3, 1, 8),
(67, 4, 1, 8),
(68, 5, 1, 8),
(69, 6, 1, 8),
(70, 7, 1, 8),
(71, 8, 1, 8),
(72, 9, 1, 8),
(73, 1, 1, 9),
(74, 2, 1, 9),
(75, 3, 1, 9),
(76, 4, 1, 9),
(77, 5, 1, 9),
(78, 6, 1, 9),
(79, 7, 1, 9),
(80, 8, 1, 9),
(81, 9, 1, 9),
(82, 1, 1, 10),
(83, 2, 1, 10),
(84, 3, 1, 10),
(85, 4, 1, 10),
(86, 5, 1, 10),
(87, 6, 1, 10),
(88, 7, 1, 10),
(89, 8, 1, 10),
(90, 9, 1, 10),
(91, 1, 1, 11),
(92, 2, 1, 11),
(93, 3, 1, 11),
(94, 4, 1, 11),
(95, 5, 1, 11),
(96, 6, 1, 11),
(97, 7, 1, 11),
(98, 8, 1, 11),
(99, 9, 1, 11),
(100, 1, 1, 12),
(101, 2, 1, 12),
(102, 3, 1, 12),
(103, 4, 1, 12),
(104, 5, 1, 12),
(105, 6, 1, 12),
(106, 7, 1, 12),
(107, 8, 1, 12),
(108, 9, 1, 12),
(109, 1, 1, 13),
(110, 2, 1, 13),
(111, 3, 1, 13),
(112, 4, 1, 13),
(113, 5, 1, 13),
(114, 6, 1, 13),
(115, 7, 1, 13),
(116, 8, 1, 13),
(117, 9, 1, 13),
(118, 1, 1, 14),
(119, 2, 1, 14),
(120, 3, 1, 14),
(121, 4, 1, 14),
(122, 5, 1, 14),
(123, 6, 1, 14),
(124, 7, 1, 14),
(125, 8, 1, 14),
(126, 9, 1, 14),
(127, 1, 1, 15),
(128, 2, 1, 15),
(129, 3, 1, 15),
(130, 4, 1, 15),
(131, 5, 1, 15),
(132, 6, 1, 15),
(133, 7, 1, 15),
(134, 8, 1, 15),
(135, 9, 1, 15),
(136, 1, 1, 16),
(137, 2, 1, 16),
(138, 3, 1, 16),
(139, 4, 1, 16),
(140, 5, 1, 16),
(141, 6, 1, 16),
(142, 7, 1, 16),
(143, 8, 1, 16),
(144, 9, 1, 16),
(145, 1, 1, 17),
(146, 2, 1, 17),
(147, 3, 1, 17),
(148, 4, 1, 17),
(149, 5, 1, 17),
(150, 6, 1, 17),
(151, 7, 1, 17),
(152, 8, 1, 17),
(153, 9, 1, 17),
(154, 1, 1, 18),
(155, 2, 1, 18),
(156, 3, 1, 18),
(157, 4, 1, 18),
(158, 5, 1, 18),
(159, 6, 1, 18),
(160, 7, 1, 18),
(161, 8, 1, 18),
(162, 9, 1, 18),
(163, 1, 1, 19),
(164, 2, 1, 19),
(165, 3, 1, 19),
(166, 4, 1, 19),
(167, 5, 1, 19),
(168, 6, 1, 19),
(169, 7, 1, 19),
(170, 8, 1, 19),
(171, 9, 1, 19),
(172, 1, 1, 20),
(173, 2, 1, 20),
(174, 3, 1, 20),
(175, 4, 1, 20),
(176, 5, 1, 20),
(177, 6, 1, 20),
(178, 7, 1, 20),
(179, 8, 1, 20),
(180, 9, 1, 20),
(181, 1, 1, 21),
(182, 2, 1, 21),
(183, 3, 1, 21),
(184, 4, 1, 21),
(185, 5, 1, 21),
(186, 6, 1, 21),
(187, 7, 1, 21),
(188, 8, 1, 21),
(189, 9, 1, 21),
(190, 1, 1, 22),
(191, 2, 1, 22),
(192, 3, 1, 22),
(193, 4, 1, 22),
(194, 5, 1, 22),
(195, 6, 1, 22),
(196, 7, 1, 22),
(197, 8, 1, 22),
(198, 9, 1, 22),
(199, 1, 1, 23),
(200, 2, 1, 23),
(201, 3, 1, 23),
(202, 4, 1, 23),
(203, 5, 1, 23),
(204, 6, 1, 23),
(205, 7, 1, 23),
(206, 8, 1, 23),
(207, 9, 1, 23);

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id` bigint(20) NOT NULL,
  `penumpang_id` bigint(20) NOT NULL,
  `shuttle_id` bigint(20) NOT NULL,
  `metode_pembayaran` enum('Transfer','E_Wallet') NOT NULL,
  `status` enum('TERKONFIRMASI','CANCEL') NOT NULL,
  `tanggal_pembayaran` timestamp NOT NULL DEFAULT current_timestamp(),
  `kursi_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id`, `penumpang_id`, `shuttle_id`, `metode_pembayaran`, `status`, `tanggal_pembayaran`, `kursi_id`, `user_id`) VALUES
(29, 84, 5, 'E_Wallet', 'TERKONFIRMASI', '2025-01-01 14:59:24', 43, 2),
(30, 85, 5, 'Transfer', 'CANCEL', '2025-01-01 14:59:59', 38, 2),
(31, 86, 5, 'Transfer', 'TERKONFIRMASI', '2025-01-02 01:46:11', 38, 2),
(32, 87, 4, 'Transfer', 'TERKONFIRMASI', '2025-01-02 02:05:04', 31, 4),
(33, 88, 4, 'Transfer', 'TERKONFIRMASI', '2025-01-02 03:06:05', 30, 2),
(34, 89, 4, 'E_Wallet', 'TERKONFIRMASI', '2025-01-06 09:37:40', 29, 2);

-- --------------------------------------------------------

--
-- Table structure for table `penumpang`
--

CREATE TABLE `penumpang` (
  `id` bigint(20) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `nomor_hp` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penumpang`
--

INSERT INTO `penumpang` (`id`, `nama`, `email`, `nomor_hp`) VALUES
(84, 'Glend', 'glend@gmail.com', '08123465742'),
(85, 'aldo', 'aldo@gmail.com', '08132434322'),
(86, 'glend', 'glendod123@gmail.com', '0292493434'),
(87, 'irfan', 'irfan@gmail.com', '081242626124'),
(88, 'Glend', 'glendod123@gmail.com', '0292493434'),
(89, 'Glend', 'gffsgfg@ggs', '081111111111');

-- --------------------------------------------------------

--
-- Table structure for table `shuttle`
--

CREATE TABLE `shuttle` (
  `id` bigint(20) NOT NULL,
  `nama_shuttle` varchar(255) NOT NULL,
  `jam_keberangkatan` time NOT NULL,
  `harga` decimal(38,2) NOT NULL,
  `keberangkatan` varchar(255) DEFAULT NULL,
  `tujuan` varchar(255) DEFAULT NULL,
  `tanggal_keberangkatan` date NOT NULL,
  `kursi_tersisa` int(11) NOT NULL DEFAULT 9
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `shuttle`
--

INSERT INTO `shuttle` (`id`, `nama_shuttle`, `jam_keberangkatan`, `harga`, `keberangkatan`, `tujuan`, `tanggal_keberangkatan`, `kursi_tersisa`) VALUES
(4, 'Aurora Express', '08:30:00', 150000.00, 'Bandung', 'Jakarta', '2025-01-02', 6),
(5, 'Citra Lintas', '09:00:00', 130000.00, 'Jakarta', 'Bogor', '2025-01-03', 7),
(6, 'Lautan Raya', '07:45:00', 170000.00, 'Surabaya', 'Malang', '2025-01-04', 9),
(7, 'Mega Transit', '10:15:00', 200000.00, 'Yogyakarta', 'Solo', '2025-01-05', 9),
(8, 'Gemilang Tours', '06:30:00', 180000.00, 'Denpasar', 'Kuta', '2025-01-06', 9),
(9, 'Bintang Kejora', '08:45:00', 140000.00, 'Makassar', 'Parepare', '2025-01-07', 9),
(10, 'Harmoni Raya', '07:15:00', 120000.00, 'Semarang', 'Magelang', '2025-01-08', 9),
(11, 'Indah Nusantara', '09:30:00', 125000.00, 'Medan', 'Binjai', '2025-01-09', 9),
(12, 'Selaras Sentosa', '08:00:00', 175000.00, 'Palembang', 'Lubuklinggau', '2025-01-10', 9),
(13, 'Lintas Borneo', '07:30:00', 155000.00, 'Pontianak', 'Sintang', '2025-01-11', 9),
(14, 'Sejahtera Abadi', '06:45:00', 150000.00, 'Balikpapan', 'Samarinda', '2025-01-12', 9),
(15, 'Kencana Lintas', '10:00:00', 160000.00, 'Manado', 'Tomohon', '2025-01-13', 9),
(16, 'Angkasa Jaya', '09:15:00', 145000.00, 'Padang', 'Bukittinggi', '2025-01-14', 9),
(17, 'Putra Selatan', '08:30:00', 175000.00, 'Banjarmasin', 'Banjarbaru', '2025-01-15', 9),
(18, 'Pesona Laut', '07:00:00', 135000.00, 'Ambon', 'Masohi', '2025-01-16', 9),
(19, 'Cahaya Timur', '10:30:00', 165000.00, 'Jayapura', 'Sentani', '2025-01-17', 9),
(20, 'Pelangi Transit', '09:45:00', 155000.00, 'Maluku', 'Ternate', '2025-01-18', 9),
(21, 'Nusantara Jaya', '08:15:00', 145000.00, 'Kupang', 'Maumere', '2025-01-19', 9),
(22, 'Srikandi Tours', '07:45:00', 185000.00, 'Palu', 'Donggala', '2025-01-20', 9),
(23, 'Mahkota Permai', '09:00:00', 150000.00, 'Kendari', 'Bau-Bau', '2025-01-21', 9);

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `id` bigint(20) NOT NULL,
  `pembayaran_id` bigint(20) NOT NULL,
  `nama_penumpang` varchar(255) NOT NULL,
  `nomor_kursi` int(11) NOT NULL,
  `keberangkatan` varchar(255) NOT NULL,
  `tujuan` varchar(255) NOT NULL,
  `tanggal_keberangkatan` date NOT NULL,
  `jam_keberangkatan` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`id`, `pembayaran_id`, `nama_penumpang`, `nomor_kursi`, `keberangkatan`, `tujuan`, `tanggal_keberangkatan`, `jam_keberangkatan`) VALUES
(24, 29, 'Glend', 7, 'Jakarta', 'Bogor', '2025-01-03', '09:00:00'),
(25, 29, 'Glend', 7, 'Jakarta', 'Bogor', '2025-01-03', '09:00:00'),
(26, 31, 'glend', 2, 'Jakarta', 'Bogor', '2025-01-03', '09:00:00'),
(27, 32, 'irfan', 4, 'Bandung', 'Jakarta', '2025-01-02', '08:30:00'),
(28, 32, 'irfan', 4, 'Bandung', 'Jakarta', '2025-01-02', '08:30:00'),
(29, 33, 'Glend', 3, 'Bandung', 'Jakarta', '2025-01-02', '08:30:00'),
(30, 33, 'Glend', 3, 'Bandung', 'Jakarta', '2025-01-02', '08:30:00'),
(31, 34, 'Glend', 2, 'Bandung', 'Jakarta', '2025-01-02', '08:30:00'),
(32, 29, 'Glend', 7, 'Jakarta', 'Bogor', '2025-01-03', '09:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `email`) VALUES
(2, 'glend', 'aldo', 'glend@gmail.com'),
(3, 'marcel', 'aldo', 'marcel@gmail.com'),
(4, 'irfan', '1234', 'irfan@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kursi`
--
ALTER TABLE `kursi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `shuttle_id` (`shuttle_id`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id`),
  ADD KEY `penumpang_id` (`penumpang_id`),
  ADD KEY `shuttle_id` (`shuttle_id`),
  ADD KEY `kursi_id` (`kursi_id`),
  ADD KEY `fk_user_pembayaran` (`user_id`);

--
-- Indexes for table `penumpang`
--
ALTER TABLE `penumpang`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `shuttle`
--
ALTER TABLE `shuttle`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pembayaran_id` (`pembayaran_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kursi`
--
ALTER TABLE `kursi`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=208;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `penumpang`
--
ALTER TABLE `penumpang`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=90;

--
-- AUTO_INCREMENT for table `shuttle`
--
ALTER TABLE `shuttle`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `tiket`
--
ALTER TABLE `tiket`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `kursi`
--
ALTER TABLE `kursi`
  ADD CONSTRAINT `kursi_ibfk_1` FOREIGN KEY (`shuttle_id`) REFERENCES `shuttle` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `fk_user_pembayaran` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `pembayaran_ibfk_1` FOREIGN KEY (`penumpang_id`) REFERENCES `penumpang` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `pembayaran_ibfk_2` FOREIGN KEY (`shuttle_id`) REFERENCES `shuttle` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `pembayaran_ibfk_3` FOREIGN KEY (`kursi_id`) REFERENCES `kursi` (`id`) ON DELETE CASCADE;

--
-- Constraints for table `tiket`
--
ALTER TABLE `tiket`
  ADD CONSTRAINT `tiket_ibfk_1` FOREIGN KEY (`pembayaran_id`) REFERENCES `pembayaran` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
