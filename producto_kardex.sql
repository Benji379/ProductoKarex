-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2023 a las 00:32:15
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `producto_kardex`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `CodigoCliente` int(20) NOT NULL,
  `NomCliente` varchar(30) NOT NULL,
  `DNI` varchar(10) NOT NULL,
  `Direccion` varchar(20) NOT NULL,
  `Telefono` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`CodigoCliente`, `NomCliente`, `DNI`, `Direccion`, `Telefono`) VALUES
(1, 'Esteban Carrillo', '97729154', 'Miraflores', '943197512'),
(3, 'Malena Cueva', '38729478', 'Miraflores', '293586472'),
(5, 'Benjamin Atoche', '71829321', 'Lima', '92837212');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `CodigoEmpleado` int(8) NOT NULL,
  `dniEmpleado` varchar(20) NOT NULL,
  `NomEmpleado` varchar(20) NOT NULL,
  `TipoContrato` varchar(20) NOT NULL,
  `TiempoContrato` varchar(30) NOT NULL,
  `Salario` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`CodigoEmpleado`, `dniEmpleado`, `NomEmpleado`, `TipoContrato`, `TiempoContrato`, `Salario`, `password`) VALUES
(1, '12345678', 'Juan Perez', 'Temporal', '10', '2500.45', '123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `CodigoEmpresa` int(20) NOT NULL,
  `NomEmpresa` varchar(40) NOT NULL,
  `Ruc` varchar(30) NOT NULL,
  `NumDireccion` varchar(30) NOT NULL,
  `Ciudad` varchar(20) NOT NULL,
  `CodigoEmpleado` varchar(30) NOT NULL,
  `CodigoAlmacen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`CodigoEmpresa`, `NomEmpresa`, `Ruc`, `NumDireccion`, `Ciudad`, `CodigoEmpleado`, `CodigoAlmacen`) VALUES
(2, 'Promart', '10384790', '11', 'Lima', '003', '004'),
(3, 'Maestro', '10384791', '12', 'Piura', '002', '003'),
(4, 'Amazon', '10384792', '13', 'Paris', 'Juan Perez', '001'),
(7, 'Google', '28374632', '122', 'Lima', 'Juan Perez', '002');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `CodigoProducto` int(30) NOT NULL,
  `nombre` text NOT NULL,
  `precio` text NOT NULL,
  `stock` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`CodigoProducto`, `nombre`, `precio`, `stock`) VALUES
(4, 'Martillo', '15', '100'),
(5, 'Destornillador', '10', '70');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `CodigoVenta` int(30) NOT NULL,
  `Monto` varchar(30) NOT NULL,
  `FechaVenta` varchar(30) NOT NULL,
  `DniCliente` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`CodigoVenta`, `Monto`, `FechaVenta`, `DniCliente`) VALUES
(24, '78.30', '2022-06-14 00:00:00', '003'),
(25, '86.50', '2022-07-12 00:00:00', '003'),
(28, '173.4', '2023-07-14 20:15:32', '97729154'),
(29, '104.0', '2023-07-14 21:24:03', '28902640'),
(30, '24.0', '2023-07-20 22:10:27', '97729154'),
(31, '64.0', '2023-07-20 22:13:44', '97729154'),
(32, '24.0', '2023-07-20 22:19:29', '97729154'),
(33, '70.0', '2023-07-20 22:20:34', '97729154');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`CodigoCliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`CodigoEmpleado`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`CodigoEmpresa`),
  ADD KEY `fk_5` (`CodigoEmpleado`),
  ADD KEY `fk_6` (`CodigoAlmacen`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`CodigoProducto`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`CodigoVenta`),
  ADD KEY `fk_1` (`DniCliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `CodigoCliente` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `CodigoEmpleado` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `CodigoEmpresa` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `inventario`
--
ALTER TABLE `inventario`
  MODIFY `CodigoProducto` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `CodigoVenta` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
