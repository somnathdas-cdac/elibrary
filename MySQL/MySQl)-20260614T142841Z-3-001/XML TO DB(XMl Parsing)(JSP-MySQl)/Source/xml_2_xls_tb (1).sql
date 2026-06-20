-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Feb 21, 2014 at 08:28 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `struts_app`
--

-- --------------------------------------------------------

--
-- Table structure for table `xml_2_xls_tb`
--

CREATE TABLE IF NOT EXISTS `xml_2_xls_tb` (
  `id_no` int(11) NOT NULL AUTO_INCREMENT,
  `serial_no` int(10) NOT NULL,
  `language` text NOT NULL,
  `title` text NOT NULL,
  `singer` text NOT NULL,
  `songtype` text NOT NULL,
  `subject` text NOT NULL,
  `copyright` text NOT NULL,
  `accessionno` text NOT NULL,
  `recordno` text NOT NULL,
  `recordslno` text NOT NULL,
  `recordtype` text NOT NULL,
  `recorddate` text NOT NULL,
  `source` text NOT NULL,
  `digitizeby` text NOT NULL,
  `format` text NOT NULL,
  `dvd_no` int(10) NOT NULL,
  PRIMARY KEY (`id_no`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6467 ;

--
-- Dumping data for table `xml_2_xls_tb`
--

INSERT INTO `xml_2_xls_tb` (`id_no`, `serial_no`, `language`, `title`, `singer`, `songtype`, `subject`, `copyright`, `accessionno`, `recordno`, `recordslno`, `recordtype`, `recorddate`, `source`, `digitizeby`, `format`, `dvd_no`) VALUES
(6039, 1, 'Bengali', 'A Parabase Robe Ke Hay', 'Sandhya Mukherjee', 'Rabindra Sangeet', '', '', '887', '45_GE.25408', '7XCEI.16020', '45 rpm', '1971/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6040, 2, 'Bengali', 'Aaakash Jure Shuninu', 'Kumari Gita Naha', 'Rabindra Sangeet', '', '', '202', 'GE.7122', '7XCE1.27404', '78 rpm', '0000/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6041, 3, 'Bengali', 'Aadhek Ghume Nayan Chume', 'Sagar Sen', 'Rabindra Sangeet', '', '', '854', '45_GE.25337', '7XCEI.1546', '45 rpm', '1969/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6042, 4, 'Bengali', 'Aaha Tomar Songe Praner Khela', 'Nilima Sen', 'Rabindra Sangeet', '', '', '945', '7EPE.1148', '7TJE.6153', '45 rpm', '1971/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6043, 5, 'Bengali', 'Aaha, Aaji Ei Basante', 'Ashoktaru Bandyopadhyay', 'Rabindra Sangeet', '', '', '639', 'HSB.7611', 'H.2293', '78 rpm', '0000/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6044, 6, 'Bengali', 'Aaj Sabar Range Rang Mishate Hobe', 'Sandhya Mukherjee', 'Rabindra Sangeet', '', '', '817', '45_GE.25378', '7XCEI.1630', '45 rpm', '1970/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6045, 7, 'Bengali', 'Aaj Shravaner Purnimate', 'Kanika Bandyopadhyay', 'Rabindra Sangeet', '', '', '749', '7EPE.1057', '7TJE.381', '45 rpm', '00/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6046, 8, 'Bengali', 'Aaj Tomare Dekhte Elem', 'Asoketaru Banerjee', 'Rabindra Sangeet', '', '', '840', 'LH.72', '7TJE.6036', '45 rpm', '00/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6047, 9, 'Bengali', 'Aaji Barsha Rater Shese', 'Mrinal Chakraborty', 'Rabindra Sangeet', '', '', '613', '45_N 83119', '7XJE 115', '45 rpm', '1965/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6048, 10, 'Bengali', 'Aaji Jhara Jhara Mukhar Badardine', 'Nilima Sen', 'Rabindra Sangeet', '', '', '864', '7EPE.1148', '7TJE.6152', '45 rpm', '1971/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6049, 11, 'Bengali', 'Aaji Jharer Rate Tomar Avisar', 'Chitralekha Chowdhury', 'Rabindra Sangeet', '', '', '793', 'SLH.158', '7XJE.635', '45 rpm', '00/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6050, 12, 'Bengali', 'Aaji Nahi Nahi Nidra', 'Nilima Sen', 'Rabindra Sangeet', '', '', '864', '7EPE.1148', '7TJE.6153', '45 rpm', '1971/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6051, 13, 'Bengali', 'Aaji Nirbhay Nidirita Bhubane', 'Samar Gupta', 'Rabindra Sangeet', '', '', '882', '45_BRT.151', '7XJE.1031', '45 rpm', '00/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6052, 14, 'Bengali', 'Aaji Tomay Aabar Chai Shunabare', 'Nilima Sen', 'Rabindra Sangeet', '', '', '973', '7EPE.3049', '7TJE.17459', '45 rpm', '1974/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6053, 15, 'Bengali', 'Aaji Tomay Aabar Chai Shunabare', 'Banani Ghosh', 'Rabindra Sangeet', '', '', '774', '45_N.83341', '7XJE.253', '45 rpm', '1969/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6054, 16, 'Bengali', 'Aajikar Din Na Furate', 'Shambhu Mitra', 'Rabindra Sangeet', '', '', '831', '7EPE.1118', '7TJE.6053', '45 rpm', '1970/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6055, 17, 'Bengali', 'Aamake Je Bandhbe Dhore', 'Sushil Mullick', 'Rabindra Sangeet', '', '', '766', '45_GE.25341', '7XCE1.1554', '45 rpm', '1969/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6056, 18, 'Bengali', 'Aamar A Path', 'Dwijen Mukhopadhyay', 'Rabindra Sangeet', '', '', '949', 'BOE.1126', '7XJE.2529', '45 rpm', '1973/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6057, 19, 'Bengali', 'Aamar Bhanga Pather Ranga Dhulay', 'Aruna Roy', 'Rabindra Sangeet', '', '', '602', 'H.2225', 'HSB.7300', '78 rpm', '0000/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6058, 20, 'Bengali', 'Aamar Byatha Jokhon Aane Aamay', 'Purba Sinha', 'Rabindra Sangeet', '', '', '776', '45_N 83312', '7XJE.169', '45 rpm', '1969/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6059, 21, 'Bengali', 'Aamar Ei Rikta Daali', 'Sandhya Mukherjee', 'Rabindra Sangeet', '', '', '854', '45_GE.25338', '7XCEI.1547', '45 rpm', '1969/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6060, 22, 'Bengali', 'Aamar Hiyar Majhe Lukiye Chhile', 'Debabrata Biswas', 'Rabindra Sangeet', '', '', '866', 'SLH.157', '7XJE.727', '45 rpm', '00/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6061, 23, 'Bengali', 'Aamar Jabar Belay', 'Aditi Sengupta', 'Rabindra Sangeet', '', '', '545', 'H.2228', 'HSB.6980', '78 rpm', '0000/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6062, 24, 'Bengali', 'Aamar Jodi Bela Jay Go', 'Rajeswari Datta', 'Rabindra Sangeet', '', '', '841', 'LH.71', '7TJE.6032', '45 rpm', '00/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6063, 25, 'Bengali', 'Aamar Jodi Bela', 'Sushil Mallick', 'Rabindra Sangeet', '', '', '877', '45-BRT.153', '7XJE.10296', '45 rpm', '00/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6064, 26, 'Bengali', 'Aamar Kantha Hote', 'Samar Gupta', 'Rabindra Sangeet', '', '', '875', '45_BRT.148', '7XJE.10169', '45 rpm', '00/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6065, 27, 'Bengali', 'Aamar Latar Pratham Mukul', 'Anjali Mukherjee', 'Rabindra Sangeet', '', '', '628', 'H.2297', 'HSB.7602', '78 rpm', '0000/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6066, 28, 'Bengali', 'Aamar Mallika Bone', 'Pratima Mukherjee', 'Rabindra Sangeet', '', '', '877', '45_GE.25342', '7XCE1.1555', '45 rpm', '1969/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6067, 29, 'Bengali', 'Aamar Mon Bole, Chai, Chai Go', 'Bithin Banerjee', 'Rabindra Sangeet', '', '', '835', '45_N.83411', '7XJE.10308', '45 rpm', '1971/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6068, 30, 'Bengali', 'Aamar Na Bola Dil', 'Ila Sen', 'Rabindra Sangeet', '', '', '236', 'GE.7456', 'CEI.33382', '78 rpm', '1961/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6069, 31, 'Bengali', 'Aamar Nishitha Rater Badal Dhara', 'Namita Ghoshal', 'Rabindra Sangeet', '', '', '784', '45_GE.25340', '7XCE1.1552', '45 rpm', '1969/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263),
(6070, 32, 'Bengali', 'Aamar Sakal Raser Dhara', 'Asoketaru Banerjee', 'Rabindra Sangeet', '', '', '718', 'H.2426', 'HSB.8097', '78 rpm', '0000/00/00', 'RABINDRA BHAVANA, VISVA-BHARATI', 'C-DAC, Kolkata', 'WAV', 5263);
