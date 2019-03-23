-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 23-03-2019 a las 02:53:01
-- Versión del servidor: 5.7.21
-- Versión de PHP: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdnomina`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `concepto`
--

DROP TABLE IF EXISTS `concepto`;
CREATE TABLE IF NOT EXISTS `concepto` (
  `ID_Concepto` varchar(10) NOT NULL,
  `NombreConcepto` varchar(50) DEFAULT NULL,
  `EfectoConcepto` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_Concepto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `concepto`
--

INSERT INTO `concepto` (`ID_Concepto`, `NombreConcepto`, `EfectoConcepto`) VALUES
('1', 'Comision', 'Suma'),
('2', 'Total devengado', 'suma'),
('3', 'Bonificación', 'suma'),
('4', 'IGSS', 'Resta'),
('5', 'ISR', 'Resta'),
('6', 'Descuentos Juridicos', 'Resta'),
('7', 'Total Deducciones', 'Resta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

DROP TABLE IF EXISTS `departamento`;
CREATE TABLE IF NOT EXISTS `departamento` (
  `ID_Departamento` varchar(10) NOT NULL,
  `NombreDepartamento` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_Departamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`ID_Departamento`, `NombreDepartamento`) VALUES
('1', 'IT'),
('2', 'Contabilidad'),
('3', 'Producción'),
('4', 'Mantenimiento'),
('5', 'Administración');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_nomina`
--

DROP TABLE IF EXISTS `detalle_nomina`;
CREATE TABLE IF NOT EXISTS `detalle_nomina` (
  `ID_Nomina` varchar(10) NOT NULL,
  `ID_Empleado` varchar(10) NOT NULL,
  `ID_Concepto` varchar(10) NOT NULL,
  `ValorNominaDetalle` float DEFAULT NULL,
  PRIMARY KEY (`ID_Nomina`,`ID_Empleado`,`ID_Concepto`),
  KEY `FK_EmpleadoEncabezadoNomina` (`ID_Empleado`),
  KEY `FK_ConceptoEncabezadoNomina` (`ID_Concepto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
  `ID_Empleado` varchar(10) NOT NULL,
  `NombreEmpleado` varchar(50) DEFAULT NULL,
  `SueldoEmpleado` float DEFAULT NULL,
  `ID_Puesto` varchar(10) NOT NULL,
  `ID_Departamento` varchar(10) NOT NULL,
  PRIMARY KEY (`ID_Empleado`),
  KEY `FK_IDpuestoempleado` (`ID_Puesto`),
  KEY `FK_IDdepartamentoempleado` (`ID_Departamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`ID_Empleado`, `NombreEmpleado`, `SueldoEmpleado`, `ID_Puesto`, `ID_Departamento`) VALUES
('1', 'Bryan', 5000, '1', '1'),
('10', 'Ricardo', 5000, '3', '3'),
('2', 'Jose', 5000, '1', '1'),
('3', 'Javier', 4000, '2', '2'),
('4', 'Maria', 3000, '5', '5'),
('5', 'Carlos', 8000, '3', '3'),
('6', 'Alberto', 4000, '4', '4'),
('7', 'Estuardo', 10000, '1', '1'),
('8', 'Juan', 5000, '3', '3'),
('9', 'Pedro', 6000, '3', '3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encabezado_nomina`
--

DROP TABLE IF EXISTS `encabezado_nomina`;
CREATE TABLE IF NOT EXISTS `encabezado_nomina` (
  `ID_Nomina` varchar(10) NOT NULL,
  `FechaInicialNomina` varchar(10) DEFAULT NULL,
  `FechaFinalNomina` varchar(10) DEFAULT NULL,
  `ValorNomina` float DEFAULT NULL,
  PRIMARY KEY (`ID_Nomina`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `encabezado_nomina`
--

INSERT INTO `encabezado_nomina` (`ID_Nomina`, `FechaInicialNomina`, `FechaFinalNomina`, `ValorNomina`) VALUES
('1', '2019-2-1', '2019-2-30', 56562.2),
('2', '2019-3-1', '2019-3-30', 58457.1),
('3', '2019-4-1', '2019-4-30', 56769.8),
('4', '2019-4-1', '2019-4-30', 57767.8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `puesto`
--

DROP TABLE IF EXISTS `puesto`;
CREATE TABLE IF NOT EXISTS `puesto` (
  `ID_Puesto` varchar(10) NOT NULL,
  `NombrePuesto` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_Puesto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `puesto`
--

INSERT INTO `puesto` (`ID_Puesto`, `NombrePuesto`) VALUES
('1', 'Programador'),
('2', 'Contador'),
('3', 'Operador'),
('4', 'Mecanico'),
('5', 'Atención al trabajador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
CREATE TABLE IF NOT EXISTS `tipo_usuario` (
  `ID_TipoUsuario` varchar(10) NOT NULL,
  `NombreTipoUsuario` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_TipoUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`ID_TipoUsuario`, `NombreTipoUsuario`) VALUES
('1', 'Administrador'),
('2', 'Usuario');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `ID_Usuario` varchar(10) NOT NULL,
  `NombreUsuario` varchar(50) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `EstadoUsuario` tinyint(1) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `LastSeccion` datetime DEFAULT NULL,
  `ID_Empleado` varchar(10) NOT NULL,
  `ID_TipoUsuario` varchar(10) NOT NULL,
  PRIMARY KEY (`ID_Usuario`),
  KEY `FK_IDEmpleado` (`ID_Empleado`),
  KEY `FK_IDTipoUsuario` (`ID_TipoUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID_Usuario`, `NombreUsuario`, `Password`, `EstadoUsuario`, `Email`, `LastSeccion`, `ID_Empleado`, `ID_TipoUsuario`) VALUES
('1', 'bmazariegos', 'f741425789e06350a8d7d9fa27ab31dc81ec7394', 1, 'bryanestuard3@gmail.com', '2019-03-22 20:46:05', '1', '1'),
('2', 'Usuarioprueba', 'f741425789e06350a8d7d9fa27ab31dc81ec7394', 1, 'bryanestuard3@gmail.com', '2019-03-20 16:38:43', '1', '2'),
('3', 'prueba', '7110eda4d09e062aa5e4a390b0a572ac0d2c0220', 1, 'abc@gmail.com', '2019-03-22 20:09:33', '2', '2');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_nomina`
--
ALTER TABLE `detalle_nomina`
  ADD CONSTRAINT `FK_ConceptoEncabezadoNomina` FOREIGN KEY (`ID_Concepto`) REFERENCES `concepto` (`ID_Concepto`),
  ADD CONSTRAINT `FK_EmpleadoEncabezadoNomina` FOREIGN KEY (`ID_Empleado`) REFERENCES `empleado` (`ID_Empleado`),
  ADD CONSTRAINT `FK_EncabezadoDetalleNomina` FOREIGN KEY (`ID_Nomina`) REFERENCES `encabezado_nomina` (`ID_Nomina`);

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `FK_IDdepartamentoempleado` FOREIGN KEY (`ID_Departamento`) REFERENCES `departamento` (`ID_Departamento`),
  ADD CONSTRAINT `FK_IDpuestoempleado` FOREIGN KEY (`ID_Puesto`) REFERENCES `puesto` (`ID_Puesto`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `FK_IDEmpleado` FOREIGN KEY (`ID_Empleado`) REFERENCES `empleado` (`ID_Empleado`),
  ADD CONSTRAINT `FK_IDTipoUsuario` FOREIGN KEY (`ID_TipoUsuario`) REFERENCES `tipo_usuario` (`ID_TipoUsuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
