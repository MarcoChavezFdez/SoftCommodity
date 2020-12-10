-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-12-2020 a las 06:58:18
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `softcommodity`
--
CREATE DATABASE IF NOT EXISTS `softcommodity` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `softcommodity`;

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `calculaTotalTicket` (IN `id` INT, OUT `total` DECIMAL)  BEGIN
    select SUM(dt.SubTotal)
    into total
    from tickets t 
    JOIN detalleticket  
    dt on t.idticket=dt.idticket 
    where t.IdTicket=id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `calculaVentaCorte` (IN `idcorte` INT, OUT `totalVenta` DECIMAL)  BEGIN
    select SUM(t.total)
    into totalVEnta
    from cortescaja cc 
    join detallecortes dc
    on cc.idcorte=dc.idcorte
    join tickets t
    on t.idticket=dc.idticket
    where cc.idcorte=idcorte;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bodegas`
--

CREATE TABLE `bodegas` (
  `IdBodega` int(11) NOT NULL,
  `Nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `IdCategoria` int(11) NOT NULL,
  `Nombre` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cortescaja`
--

CREATE TABLE `cortescaja` (
  `IdCorte` int(11) NOT NULL,
  `IdUsuario` int(11) NOT NULL,
  `FondoInicial` int(11) NOT NULL,
  `TotalVenta` decimal(10,4) NOT NULL,
  `TotalRetiros` decimal(10,4) NOT NULL,
  `TotalCorte` decimal(10,4) NOT NULL,
  `HoraInicial` time NOT NULL,
  `HoraFinal` time DEFAULT NULL,
  `Estatus` char(1) COLLATE utf8_spanish_ci NOT NULL,
  `Fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cortesventas`
--

CREATE TABLE `cortesventas` (
  `IdVenta` int(11) NOT NULL,
  `IdCorte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecortes`
--

CREATE TABLE `detallecortes` (
  `IdCorte` int(11) NOT NULL,
  `IdTicket` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleretiros`
--

CREATE TABLE `detalleretiros` (
  `IdRetiro` int(11) NOT NULL,
  `IdCorte` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleticket`
--

CREATE TABLE `detalleticket` (
  `IdTicket` int(11) NOT NULL,
  `IdProducto` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `PrecioUnitario` decimal(10,4) NOT NULL,
  `SubTotal` decimal(10,4) NOT NULL,
  `PrecioMayorista` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventarios`
--

CREATE TABLE `inventarios` (
  `IdInventario` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `Faltante` decimal(10,4) NOT NULL,
  `TotalInventario` decimal(10,4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventariosbodegas`
--

CREATE TABLE `inventariosbodegas` (
  `IdInventario` int(11) NOT NULL,
  `IdBodega` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `IdProducto` int(11) NOT NULL,
  `IdCategoria` int(11) NOT NULL,
  `Nombre` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `Descripcion` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `PrecioMayoreo` decimal(10,4) NOT NULL,
  `PrecioMenudeo` decimal(10,4) NOT NULL,
  `PrecioCompra` decimal(10,4) NOT NULL,
  `Presentacion` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `EAN` varchar(13) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Contenido` int(11) NOT NULL,
  `TipoContenido` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `Material` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `Anchura` decimal(10,1) NOT NULL DEFAULT 0.0,
  `MedidaAnchura` varchar(10) COLLATE utf8_spanish_ci NOT NULL DEFAULT 'NA',
  `Color` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `Estatus` char(1) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productosbodega`
--

CREATE TABLE `productosbodega` (
  `IdBodega` int(11) NOT NULL,
  `IdProducto` int(11) NOT NULL,
  `Cantida` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reportes`
--

CREATE TABLE `reportes` (
  `IdReporte` int(11) NOT NULL,
  `FechaInicial` date NOT NULL,
  `FechaFinal` date NOT NULL,
  `TotalVentas` decimal(10,4) NOT NULL,
  `FechaGeneracion` date NOT NULL,
  `HoraGeneracion` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reportesventas`
--

CREATE TABLE `reportesventas` (
  `IdReporte` int(11) NOT NULL,
  `IdVenta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `retiros`
--

CREATE TABLE `retiros` (
  `IdRetiro` int(11) NOT NULL,
  `IdUsuarioAutorizador` int(11) NOT NULL,
  `Monto` decimal(10,4) NOT NULL,
  `Hora` time NOT NULL,
  `Fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tickets`
--

CREATE TABLE `tickets` (
  `IdTicket` int(11) NOT NULL,
  `IdUsuario` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `HoraVenta` time NOT NULL,
  `SubTotal` decimal(10,4) NOT NULL,
  `IVA` decimal(10,4) NOT NULL,
  `Total` decimal(10,4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IdUsuario` int(11) NOT NULL,
  `Nombre` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `ApellidoPaterno` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `ApellidoMaterno` varchar(60) COLLATE utf8_spanish_ci NOT NULL,
  `CURP` varchar(18) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Direccion` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `Telefono` varchar(12) COLLATE utf8_spanish_ci NOT NULL,
  `Email` varchar(40) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Rol` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Login` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `Passw` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `Estatus` char(1) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `IdVenta` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `TotalVenta` decimal(10,4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bodegas`
--
ALTER TABLE `bodegas`
  ADD PRIMARY KEY (`IdBodega`),
  ADD UNIQUE KEY `Nombre` (`Nombre`);

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`IdCategoria`),
  ADD UNIQUE KEY `Nombre` (`Nombre`);

--
-- Indices de la tabla `cortescaja`
--
ALTER TABLE `cortescaja`
  ADD PRIMARY KEY (`IdCorte`),
  ADD KEY `FK_Usuarios_CortesCaja` (`IdUsuario`);

--
-- Indices de la tabla `cortesventas`
--
ALTER TABLE `cortesventas`
  ADD KEY `FK_Ventas_CortesVentas` (`IdVenta`),
  ADD KEY `FK_Cortes_CortesVentas` (`IdCorte`);

--
-- Indices de la tabla `detallecortes`
--
ALTER TABLE `detallecortes`
  ADD KEY `FK_CortesCaja_DetalleCortes` (`IdCorte`),
  ADD KEY `FK_Tickets_DetalleCortes` (`IdTicket`);

--
-- Indices de la tabla `detalleretiros`
--
ALTER TABLE `detalleretiros`
  ADD KEY `FK_Retiros_DetalleRetiros` (`IdRetiro`),
  ADD KEY `FK_Cortes_DetalleRetiros` (`IdCorte`);

--
-- Indices de la tabla `detalleticket`
--
ALTER TABLE `detalleticket`
  ADD KEY `FK_Ticket_DetalleTicket` (`IdTicket`),
  ADD KEY `FK_Productos_DetalleTicket` (`IdProducto`);

--
-- Indices de la tabla `inventarios`
--
ALTER TABLE `inventarios`
  ADD PRIMARY KEY (`IdInventario`);

--
-- Indices de la tabla `inventariosbodegas`
--
ALTER TABLE `inventariosbodegas`
  ADD KEY `FK_Bodegas_InventariosBodega` (`IdBodega`),
  ADD KEY `FK_Inventarios_InventariosBodegas` (`IdInventario`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`IdProducto`),
  ADD KEY `FK_Productos_Categorias` (`IdCategoria`);

--
-- Indices de la tabla `productosbodega`
--
ALTER TABLE `productosbodega`
  ADD KEY `FK_Productos_ProductosBodega` (`IdProducto`),
  ADD KEY `FK_Bodegas_ProductosBodega` (`IdBodega`);

--
-- Indices de la tabla `reportes`
--
ALTER TABLE `reportes`
  ADD PRIMARY KEY (`IdReporte`);

--
-- Indices de la tabla `reportesventas`
--
ALTER TABLE `reportesventas`
  ADD KEY `FK_Reportes_ReportesVentas` (`IdReporte`),
  ADD KEY `FK_Ventas_ReportesVentas` (`IdVenta`);

--
-- Indices de la tabla `retiros`
--
ALTER TABLE `retiros`
  ADD PRIMARY KEY (`IdRetiro`),
  ADD KEY `FK_Usuarios_Retiros` (`IdUsuarioAutorizador`);

--
-- Indices de la tabla `tickets`
--
ALTER TABLE `tickets`
  ADD PRIMARY KEY (`IdTicket`),
  ADD KEY `FK_Usuarios_Tickets` (`IdUsuario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IdUsuario`),
  ADD UNIQUE KEY `Login` (`Login`),
  ADD UNIQUE KEY `CURP` (`CURP`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`IdVenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bodegas`
--
ALTER TABLE `bodegas`
  MODIFY `IdBodega` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
  MODIFY `IdCategoria` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cortescaja`
--
ALTER TABLE `cortescaja`
  MODIFY `IdCorte` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inventarios`
--
ALTER TABLE `inventarios`
  MODIFY `IdInventario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `IdProducto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reportes`
--
ALTER TABLE `reportes`
  MODIFY `IdReporte` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `retiros`
--
ALTER TABLE `retiros`
  MODIFY `IdRetiro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tickets`
--
ALTER TABLE `tickets`
  MODIFY `IdTicket` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `IdUsuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `IdVenta` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cortescaja`
--
ALTER TABLE `cortescaja`
  ADD CONSTRAINT `FK_Usuarios_CortesCaja` FOREIGN KEY (`IdUsuario`) REFERENCES `usuarios` (`IdUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `cortesventas`
--
ALTER TABLE `cortesventas`
  ADD CONSTRAINT `FK_Cortes_CortesVentas` FOREIGN KEY (`IdCorte`) REFERENCES `cortescaja` (`IdCorte`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Ventas_CortesVentas` FOREIGN KEY (`IdVenta`) REFERENCES `ventas` (`IdVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detallecortes`
--
ALTER TABLE `detallecortes`
  ADD CONSTRAINT `FK_CortesCaja_DetalleCortes` FOREIGN KEY (`IdCorte`) REFERENCES `cortescaja` (`IdCorte`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Tickets_DetalleCortes` FOREIGN KEY (`IdTicket`) REFERENCES `tickets` (`IdTicket`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detalleretiros`
--
ALTER TABLE `detalleretiros`
  ADD CONSTRAINT `FK_Cortes_DetalleRetiros` FOREIGN KEY (`IdCorte`) REFERENCES `cortescaja` (`IdCorte`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Retiros_DetalleRetiros` FOREIGN KEY (`IdRetiro`) REFERENCES `retiros` (`IdRetiro`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `detalleticket`
--
ALTER TABLE `detalleticket`
  ADD CONSTRAINT `FK_Productos_DetalleTicket` FOREIGN KEY (`IdProducto`) REFERENCES `productos` (`IdProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Ticket_DetalleTicket` FOREIGN KEY (`IdTicket`) REFERENCES `tickets` (`IdTicket`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `inventariosbodegas`
--
ALTER TABLE `inventariosbodegas`
  ADD CONSTRAINT `FK_Bodegas_InventariosBodega` FOREIGN KEY (`IdBodega`) REFERENCES `bodegas` (`IdBodega`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Inventarios_InventariosBodegas` FOREIGN KEY (`IdInventario`) REFERENCES `inventarios` (`IdInventario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `FK_Productos_Categorias` FOREIGN KEY (`IdCategoria`) REFERENCES `categorias` (`IdCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `productosbodega`
--
ALTER TABLE `productosbodega`
  ADD CONSTRAINT `FK_Bodegas_ProductosBodega` FOREIGN KEY (`IdBodega`) REFERENCES `bodegas` (`IdBodega`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Productos_ProductosBodega` FOREIGN KEY (`IdProducto`) REFERENCES `productos` (`IdProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reportesventas`
--
ALTER TABLE `reportesventas`
  ADD CONSTRAINT `FK_Reportes_ReportesVentas` FOREIGN KEY (`IdReporte`) REFERENCES `reportes` (`IdReporte`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Ventas_ReportesVentas` FOREIGN KEY (`IdVenta`) REFERENCES `ventas` (`IdVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `retiros`
--
ALTER TABLE `retiros`
  ADD CONSTRAINT `FK_Usuarios_Retiros` FOREIGN KEY (`IdUsuarioAutorizador`) REFERENCES `usuarios` (`IdUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tickets`
--
ALTER TABLE `tickets`
  ADD CONSTRAINT `FK_Usuarios_Tickets` FOREIGN KEY (`IdUsuario`) REFERENCES `usuarios` (`IdUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
