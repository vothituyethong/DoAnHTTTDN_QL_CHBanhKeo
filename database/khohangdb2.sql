-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 08, 2022 at 05:13 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `khohangdb2`
--

-- --------------------------------------------------------

--
-- Table structure for table `ct_hd`
--

CREATE TABLE `ct_hd` (
  `MA_HD` varchar(20) NOT NULL,
  `MA_HANG` varchar(20) NOT NULL,
  `SLUONG` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ct_hd`
--

INSERT INTO `ct_hd` (`MA_HD`, `MA_HANG`, `SLUONG`) VALUES
('HD001', 'SK003', 4),
('HD002', 'BA004', 5),
('HD003', 'KE005', 5),
('HD003', 'SK004', 5),
('HD004', 'BA001', 5),
('HD004', 'KE005', 5),
('HD005', 'BA001', 8),
('HD005', 'SK005', 5),
('HD006', 'BA005', 5),
('HD006', 'KE003', 5),
('HD007', 'BA001', 8),
('HD007', 'SK001', 10);

-- --------------------------------------------------------

--
-- Table structure for table `ct_pn`
--

CREATE TABLE `ct_pn` (
  `MA_PN` varchar(20) NOT NULL,
  `MA_HANG` varchar(20) NOT NULL,
  `SLUONG` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ct_pn`
--

INSERT INTO `ct_pn` (`MA_PN`, `MA_HANG`, `SLUONG`) VALUES
('N001', 'BA001', 50),
('N001', 'KE002', 15),
('N002', 'KE003', 20),
('N002', 'SK001', 30),
('N003', 'BA005', 30),
('N003', 'SK002', 30),
('N004', 'BA004', 25),
('N004', 'SK003', 25),
('N005', 'BA003', 25),
('N006', 'KE001', 15),
('N006', 'KE005', 30),
('N007', 'SK002', 25),
('N007', 'SK004', 15),
('N008', 'BA002', 10),
('N009', 'SK004', 20),
('N009', 'SK005', 20),
('N010', 'BA005', 10),
('N010', 'KE002', 15),
('N011', 'BA005', 5),
('N011', 'SK004', 5),
('N012', 'BA001', 3),
('N012', 'BA005', 4),
('N012', 'SK001', 2),
('N013', 'BA002', 10),
('N013', 'BA004', 20),
('N014', 'KE003', 10),
('N014', 'KE004', 5),
('N014', 'SK005', 5),
('N015', 'BA006', 10),
('N015', 'SK001', 5),
('N015', 'SK003', 5),
('N016', 'KE002', 5),
('N017', 'BA002', 30),
('N017', 'KE003', 35),
('N018', 'BA001', 100),
('N019', 'SK001', 50),
('N020', 'BA006', 10),
('N020', 'SK005', 20);

-- --------------------------------------------------------

--
-- Table structure for table `ct_px`
--

CREATE TABLE `ct_px` (
  `MA_PX` varchar(20) NOT NULL,
  `MA_HANG` varchar(20) NOT NULL,
  `SLUONG` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ct_px`
--

INSERT INTO `ct_px` (`MA_PX`, `MA_HANG`, `SLUONG`) VALUES
('X001', 'BA001', 5),
('X001', 'KE002', 10),
('X002', 'KE001', 8),
('X002', 'SK003', 10),
('X003', 'BA003', 7),
('X003', 'SK001', 8),
('X004', 'SK001', 15),
('X005', 'BA002', 8),
('X005', 'BA004', 5),
('X005', 'BA005', 10),
('X006', 'SK001', 20),
('X007', 'KE002', 10),
('X007', 'KE005', 20),
('X008', 'SK002', 25),
('X009', 'BA001', 15),
('X009', 'BA003', 10),
('X010', 'KE003', 5),
('X010', 'SK005', 20),
('X011', 'BA003', 5),
('X011', 'KE005', 5),
('X012', 'BA001', 10),
('X012', 'BA003', 5),
('X013', 'BA006', 5),
('X013', 'KE004', 5),
('X014', 'BA001', 20),
('X014', 'KE003', 10);

-- --------------------------------------------------------

--
-- Table structure for table `hanghoa`
--

CREATE TABLE `hanghoa` (
  `MA_HANG` varchar(20) NOT NULL,
  `TEN_HANG` varchar(50) NOT NULL,
  `SO_LUONG` int(11) NOT NULL,
  `GIA` int(11) NOT NULL,
  `MA_LOAI` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hanghoa`
--

INSERT INTO `hanghoa` (`MA_HANG`, `TEN_HANG`, `SO_LUONG`, `GIA`, `MA_LOAI`) VALUES
('BA001', 'B??nh b?? tr???ng Richy', 198, 36500, 'BA'),
('BA002', 'B??nh b??ng lan kem Solite', 80, 59000, 'BA'),
('BA003', 'B??nh Choco-Pie Orion', 65, 55000, 'BA'),
('BA004', 'B??nh g???o n?????ng v??? truy???n th???ng Orion An g??i 151.2g', 55, 20500, 'BA'),
('BA005', 'B??nh x???p nh??n phomai Richeese Nabati', 60, 43000, 'BA'),
('BA006', 'B??nh Doowee Donut socola', 65, 62000, 'BA'),
('KE001', 'K???o nhai socola h????ng b???c h?? Dynamite Chews', 57, 20000, 'KE'),
('KE002', 'K???o m???m h????ng tr??i c??y Alpenliebe', 50, 13500, 'KE'),
('KE003', 'K???o m??t Milkita t??i l???n 50 c??y', 95, 80000, 'KE'),
('KE004', 'Socola s???a nh??n h???t macca Henk', 55, 30500, 'KE'),
('KE005', 'K???o socola s???a M&M g??i 40g', 55, 10500, 'KE'),
('SK001', 'Snack khoai t??y v??? kim chi H??n Qu???c OStar', 115, 22000, 'SK'),
('SK002', 'Snack khoai t??y v??? bit t???t New York Swing', 62, 21000, 'SK'),
('SK003', 'Snack khoai t??y v??? t???o bi???n OStar', 55, 22000, 'SK'),
('SK004', 'Snack rong bi???n gi??n v??? chua cay Tao Kae Noi', 55, 23000, 'SK'),
('SK005', 'Snack que nh??n s???a Oishi Akiko', 70, 21500, 'SK');

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `MA_HD` varchar(20) NOT NULL,
  `NGAY_LAP` date NOT NULL,
  `MA_NV` varchar(20) NOT NULL,
  `MA_KH` varchar(20) NOT NULL,
  `TONG_TIEN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`MA_HD`, `NGAY_LAP`, `MA_NV`, `MA_KH`, `TONG_TIEN`) VALUES
('HD001', '2022-04-27', '004', 'KH011', 88000),
('HD002', '2022-04-27', '004', 'KH012', 102500),
('HD003', '2022-04-28', '005', 'KH013', 167500),
('HD004', '2022-04-28', '005', 'KH014', 235000),
('HD005', '2022-04-28', '005', 'KH011', 399500),
('HD006', '2022-04-28', '004', 'KH015', 615000),
('HD007', '2022-05-08', '004', 'KH016', 512000);

-- --------------------------------------------------------

--
-- Table structure for table `k_hang`
--

CREATE TABLE `k_hang` (
  `MA_KH` varchar(20) NOT NULL,
  `TEN_KH` varchar(50) NOT NULL,
  `D_CHI` varchar(50) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `LOAI_KH` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `k_hang`
--

INSERT INTO `k_hang` (`MA_KH`, `TEN_KH`, `D_CHI`, `SDT`, `LOAI_KH`) VALUES
('KH001', 'C???a h??ng ??nh Linh', '46C Nguy???n V??n Tr???i, P. 15, Q. Ph?? Nhu???n', '02838449224', 'SI'),
('KH002', 'C???a h??ng b??nh Bon Bon', '19 ???????ng 3 Th??ng 2, P. 11, Q. 10', '02838344746', 'SI'),
('KH003', 'C???a h??ng D??? Nguy??n', '1D L?? Quang Sung, P. 2, Q. 6', '02839690052', 'SI'),
('KH004', 'C???a h??ng H???ng Anh', 'D1/8 ???p 4, X. B??nh Ch??nh, H. B??nh Ch??nh', '02838758464', 'SI'),
('KH005', 'C???a h??ng b??nh k???o H???ng Hoa', '351/2A Nguy???n Tr???ng Tuy???n, P. 1, Q. T??n B??nh', '02838445591', 'SI'),
('KH006', 'C???a h??ng Huy???n Tr??n', '93 L?? V??n L????ng, P. T??n Ki???ng, Q. 7', '02837711768', 'SI'),
('KH007', 'C???a h??ng Thi??n H????ng', '47/1A Phan V??n H???n, X. B?? ??i???m, H. H??c M??n', '02837125951', 'SI'),
('KH008', 'C???a h??ng b??nh k???o Thi???n K??', '58 B???n C???n Giu???c,P. 11, Q. 8', '02838565388', 'SI'),
('KH009', 'C???a h??ng b??nh k???o Thanh Ph????ng', '74/2 Nguy???n ???nh Th???, P. Trung M??? T??y, Q. 12', '02838834437', 'SI'),
('KH010', 'C???a h??ng b??nh k???o Th??y V??n', '130/3 ???p Trung Ch??nh, X. Trung Ch??nh, H. H??c M??n', '02837183614', 'SI'),
('KH011', 'Nguy???n V??n An', '123 Nguy???n ????nh Chi???u, Q3', '0909778783', 'LE'),
('KH012', 'L??m Kh??nh Vy', '23 Tr???n Ph??, Qu???n 5', '0379864863', 'LE'),
('KH013', 'Tr???n T??ng Anh', '95 Kha V???n Ch??n, Th??? ?????c', '0787201827', 'LE'),
('KH014', 'H?? Nh???t Minh', '273 An D????ng V????ng, P3, Q5', '0901686684', 'LE'),
('KH015', '??o??n V??n Thanh', '140 Nguy???n Tr??i, Q1', '0568904909', 'LE'),
('KH016', 'H?? Nh???t Nam', '29 ???????ng 3/2, P11, Q10', '0962858585', 'LE'),
('KH017', 'C???a h??ng b??nh k???o Thi??n Thanh', '304 Cao Th???ng P12, Q10', '02822421063', 'SI');

-- --------------------------------------------------------

--
-- Table structure for table `loaihang`
--

CREATE TABLE `loaihang` (
  `MA_LOAI` varchar(20) NOT NULL,
  `TEN_LOAI` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `loaihang`
--

INSERT INTO `loaihang` (`MA_LOAI`, `TEN_LOAI`) VALUES
('BA', 'B??nh'),
('KE', 'K???o'),
('SK', 'Snack');

-- --------------------------------------------------------

--
-- Table structure for table `ncc`
--

CREATE TABLE `ncc` (
  `MA_NCC` varchar(20) NOT NULL,
  `TEN_NCC` varchar(50) NOT NULL,
  `D_CHI` varchar(50) NOT NULL,
  `SDT` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ncc`
--

INSERT INTO `ncc` (`MA_NCC`, `TEN_NCC`, `D_CHI`, `SDT`) VALUES
('NCC001', 'CTy TM DV H????ng Th???y', 'C10, 39, Nguy???n H???u Th???, Nh?? B??', '02836209955'),
('NCC002', 'CTy  TM L???i Th??nh H??ng', '325 -327 B???n Ph?? L??m, P. 9, Q. 6', '02839600695'),
('NCC003', 'Cty TNHH TM ?????i Vinh', '67, ?????c H??a, Long An', '0933388484'),
('NCC004', 'CTy TNHH TM Mai Kim', '60K L?? Th??? Ri??ng, Q1', '02838298280'),
('NCC005', 'CTy CP Lai Ph??', '95 B??u C??t 3, Q. T??n B??nh', '02839491725'),
('NCC006', 'CTy CP Ph?? Tr?????ng', 'B09 Nguy???n V??n Linh, Q7', '02854121595'),
('NCC007', 'CTy TNHH TM H??ng Thu', '6/17 Ph???m V??n Hai, Q. T??n B??nh', '02838454155'),
('NCC008', 'CTy TNHH TM Kim Ph??c', '79/11 Tr???n Huy Li???u, Q. Ph?? Nhu???n', '02838728434'),
('NCC009', 'Cty TNHH TP ??n Nam', '41 Th???o ??i???n - P. Th???o ??i???n, Q. 2', '02835126400'),
('NCC010', 'CTy TNHH Nguy???n Ph?????c', '71/12/36 Nguy???n B???c , Q. T??n B??nh', '02838449925'),
('NCC011', 'CTy H???i H??', '168 Ph???m Ng?? L??o, Q1', '02854297628');

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MA_NV` varchar(20) NOT NULL,
  `TEN_NV` varchar(32) NOT NULL,
  `NG_SINH` date NOT NULL,
  `G_TINH` varchar(3) NOT NULL,
  `D_CHI` varchar(30) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `CHUC_VU` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MA_NV`, `TEN_NV`, `NG_SINH`, `G_TINH`, `D_CHI`, `SDT`, `CHUC_VU`) VALUES
('001', 'Ng?? Thanh Ng???c', '2000-09-15', 'N???', '273 An D????ng V????ng, P3, Q5', '0767231827', 'Qu???n l??'),
('002', 'D????ng Ng???c Vinh', '2000-11-24', 'Nam', '105 B?? Huy???n Thanh Quan, Q3', '0371521963', 'Nh??n vi??n kho'),
('003', 'Ph???m Qu???c Minh', '2000-02-14', 'Nam', '04 T??n ?????c Th???ng, Q1', '0527741476', 'Nh??n vi??n kho'),
('004', 'Nguy???n Minh Anh', '2000-09-11', 'N???', '20 Ng?? Th???i Nhi???m, Q3', '0738459367', 'Nh??n vi??n b??n h??ng'),
('005', 'Tr???n Tr???ng Th??i', '2000-09-22', 'Nam', '06 Nguy???n Tr??i, Q5', '0568300148', 'Nh??n vi??n b??n h??ng');

-- --------------------------------------------------------

--
-- Table structure for table `p_nhap`
--

CREATE TABLE `p_nhap` (
  `MA_PN` varchar(20) NOT NULL,
  `NGAY_LAP` date NOT NULL,
  `MA_NV` varchar(20) NOT NULL,
  `MA_NCC` varchar(20) NOT NULL,
  `TONG_TIEN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `p_nhap`
--

INSERT INTO `p_nhap` (`MA_PN`, `NGAY_LAP`, `MA_NV`, `MA_NCC`, `TONG_TIEN`) VALUES
('N001', '2020-01-15', '002', 'NCC005', 2027500),
('N002', '2020-02-28', '003', 'NCC001', 2260000),
('N003', '2020-02-06', '002', 'NCC003', 1920000),
('N004', '2020-03-10', '002', 'NCC009', 1062500),
('N005', '2020-03-17', '003', 'NCC004', 1375000),
('N006', '2020-04-22', '002', 'NCC009', 615000),
('N007', '2020-03-29', '002', 'NCC003', 870000),
('N008', '2017-04-30', '003', 'NCC004', 590000),
('N009', '2020-04-06', '003', 'NCC001', 890000),
('N010', '2020-04-08', '003', 'NCC003', 632500),
('N011', '2020-06-04', '002', 'NCC010', 330000),
('N012', '2020-06-08', '002', 'NCC001', 325500),
('N013', '2020-06-08', '003', 'NCC002', 1000000),
('N014', '2020-06-15', '002', 'NCC009', 1060000),
('N015', '2020-06-15', '002', 'NCC010', 840000),
('N016', '2022-04-27', '002', 'NCC007', 67500),
('N017', '2022-05-01', '003', 'NCC005', 4570000),
('N018', '2022-05-01', '003', 'NCC009', 3650000),
('N019', '2022-05-01', '003', 'NCC010', 1100000),
('N020', '2022-05-08', '002', 'NCC011', 1050000);

-- --------------------------------------------------------

--
-- Table structure for table `p_xuat`
--

CREATE TABLE `p_xuat` (
  `MA_PX` varchar(20) NOT NULL,
  `NGAY_LAP` date NOT NULL,
  `MA_NV` varchar(20) NOT NULL,
  `MA_KH` varchar(20) NOT NULL,
  `TONG_TIEN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `p_xuat`
--

INSERT INTO `p_xuat` (`MA_PX`, `NGAY_LAP`, `MA_NV`, `MA_KH`, `TONG_TIEN`) VALUES
('X001', '2020-01-17', '002', 'KH004', 317500),
('X002', '2020-11-25', '003', 'KH003', 380000),
('X003', '2020-01-24', '002', 'KH009', 561000),
('X004', '2020-02-25', '003', 'KH001', 330000),
('X005', '2020-02-02', '003', 'KH008', 1004500),
('X006', '2020-02-08', '003', 'KH002', 440000),
('X007', '2020-02-13', '002', 'KH006', 345000),
('X008', '2020-03-01', '003', 'KH010', 525000),
('X009', '2020-03-09', '003', 'KH007', 1097500),
('X010', '2020-03-15', '003', 'KH009', 830000),
('X011', '2020-06-04', '002', 'KH005', 327500),
('X012', '2020-06-15', '002', 'KH005', 640000),
('X013', '2022-04-27', '002', 'KH007', 462500),
('X014', '2022-05-08', '003', 'KH017', 1530000);

-- --------------------------------------------------------

--
-- Table structure for table `quyen`
--

CREATE TABLE `quyen` (
  `MA_QUYEN` varchar(20) NOT NULL,
  `TEN_QUYEN` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `quyen`
--

INSERT INTO `quyen` (`MA_QUYEN`, `TEN_QUYEN`) VALUES
('MN', 'Qu???n l??'),
('STOCK', 'Nh??n vi??n kho'),
('STORE', 'Nh??n vi??n b??n h??ng');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` text NOT NULL,
  `MA_NV` varchar(20) NOT NULL,
  `MA_QUYEN` varchar(20) NOT NULL,
  `KHOA` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`USERNAME`, `PASSWORD`, `MA_NV`, `MA_QUYEN`, `KHOA`) VALUES
('mn1', '827ccb0eea8a706c4c34a16891f84e7b', '001', 'MN', 0),
('nvbh1', '827ccb0eea8a706c4c34a16891f84e7b', '004', 'STORE', 0),
('nvbh2', '827ccb0eea8a706c4c34a16891f84e7b', '005', 'STORE', 0),
('nvk1', '827ccb0eea8a706c4c34a16891f84e7b', '002', 'STOCK', 0),
('nvk2', '827ccb0eea8a706c4c34a16891f84e7b', '003', 'STOCK', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ct_hd`
--
ALTER TABLE `ct_hd`
  ADD PRIMARY KEY (`MA_HD`,`MA_HANG`),
  ADD KEY `fk_cthd_hang` (`MA_HANG`);

--
-- Indexes for table `ct_pn`
--
ALTER TABLE `ct_pn`
  ADD PRIMARY KEY (`MA_PN`,`MA_HANG`),
  ADD KEY `fk_ctpn_hang` (`MA_HANG`);

--
-- Indexes for table `ct_px`
--
ALTER TABLE `ct_px`
  ADD PRIMARY KEY (`MA_PX`,`MA_HANG`),
  ADD KEY `fk_ctpx_hang` (`MA_HANG`);

--
-- Indexes for table `hanghoa`
--
ALTER TABLE `hanghoa`
  ADD PRIMARY KEY (`MA_HANG`),
  ADD KEY `fk_hang_loai` (`MA_LOAI`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MA_HD`),
  ADD KEY `fk_hd_nv` (`MA_NV`),
  ADD KEY `fk_hd_kh` (`MA_KH`);

--
-- Indexes for table `k_hang`
--
ALTER TABLE `k_hang`
  ADD PRIMARY KEY (`MA_KH`);

--
-- Indexes for table `loaihang`
--
ALTER TABLE `loaihang`
  ADD PRIMARY KEY (`MA_LOAI`);

--
-- Indexes for table `ncc`
--
ALTER TABLE `ncc`
  ADD PRIMARY KEY (`MA_NCC`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MA_NV`);

--
-- Indexes for table `p_nhap`
--
ALTER TABLE `p_nhap`
  ADD PRIMARY KEY (`MA_PN`),
  ADD KEY `fk_pn_nv` (`MA_NV`),
  ADD KEY `fk_pn_ncc` (`MA_NCC`);

--
-- Indexes for table `p_xuat`
--
ALTER TABLE `p_xuat`
  ADD PRIMARY KEY (`MA_PX`),
  ADD KEY `fk_px_nv` (`MA_NV`),
  ADD KEY `fk_px_kh` (`MA_KH`);

--
-- Indexes for table `quyen`
--
ALTER TABLE `quyen`
  ADD PRIMARY KEY (`MA_QUYEN`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`USERNAME`),
  ADD KEY `fk_tk_nv` (`MA_NV`),
  ADD KEY `fk_tk_quyen` (`MA_QUYEN`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ct_hd`
--
ALTER TABLE `ct_hd`
  ADD CONSTRAINT `fk_cthd_hang` FOREIGN KEY (`MA_HANG`) REFERENCES `hanghoa` (`MA_HANG`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_cthd_hd` FOREIGN KEY (`MA_HD`) REFERENCES `hoadon` (`MA_HD`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ct_pn`
--
ALTER TABLE `ct_pn`
  ADD CONSTRAINT `fk_ctpn_hang` FOREIGN KEY (`MA_HANG`) REFERENCES `hanghoa` (`MA_HANG`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_ctpn_pn` FOREIGN KEY (`MA_PN`) REFERENCES `p_nhap` (`MA_PN`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ct_px`
--
ALTER TABLE `ct_px`
  ADD CONSTRAINT `fk_ctpx_hang` FOREIGN KEY (`MA_HANG`) REFERENCES `hanghoa` (`MA_HANG`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_ctpx_px` FOREIGN KEY (`MA_PX`) REFERENCES `p_xuat` (`MA_PX`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hanghoa`
--
ALTER TABLE `hanghoa`
  ADD CONSTRAINT `fk_hang_loai` FOREIGN KEY (`MA_LOAI`) REFERENCES `loaihang` (`MA_LOAI`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `fk_hd_kh` FOREIGN KEY (`MA_KH`) REFERENCES `k_hang` (`MA_KH`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_hd_nv` FOREIGN KEY (`MA_NV`) REFERENCES `nhanvien` (`MA_NV`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `p_nhap`
--
ALTER TABLE `p_nhap`
  ADD CONSTRAINT `fk_pn_ncc` FOREIGN KEY (`MA_NCC`) REFERENCES `ncc` (`MA_NCC`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_pn_nv` FOREIGN KEY (`MA_NV`) REFERENCES `nhanvien` (`MA_NV`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `p_xuat`
--
ALTER TABLE `p_xuat`
  ADD CONSTRAINT `fk_px_kh` FOREIGN KEY (`MA_KH`) REFERENCES `k_hang` (`MA_KH`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_px_nv` FOREIGN KEY (`MA_NV`) REFERENCES `nhanvien` (`MA_NV`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `fk_tk_nv` FOREIGN KEY (`MA_NV`) REFERENCES `nhanvien` (`MA_NV`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_tk_quyen` FOREIGN KEY (`MA_QUYEN`) REFERENCES `quyen` (`MA_QUYEN`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
