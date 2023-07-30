

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


--
-- Base de datos: `mobilitydb`
--

-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS `mobilitydb`;

-- Seleccionar la base de datos
USE `mobilitydb`;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comparendo`
--

CREATE TABLE `comparendo` (
  `radicado` int(11) NOT NULL,
  `cc` int(11) NOT NULL,
  `descripcion` text NOT NULL,
  `fecha` date NOT NULL,
  `valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comparendo`
--

INSERT INTO `comparendo` (`radicado`, `cc`, `descripcion`, `fecha`, `valor`) VALUES
(4807, 1, 'por feo', '2023-05-10', 20000000),
(5511, 1, 'por exeso de facha', '2023-05-25', 2000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `impuesto`
--

CREATE TABLE `impuesto` (
  `nit` int(11) NOT NULL,
  `placa` varchar(7) NOT NULL,
  `fLimite` int(11) NOT NULL,
  `valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `impuesto`
--

INSERT INTO `impuesto` (`nit`, `placa`, `fLimite`, `valor`) VALUES
(14626, 'aaa-111', 2022, 300000),
(41726, 'abc-123', 2023, 6000000),
(72860, 'bbb-222', 2023, 5250000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos_comparendo`
--

CREATE TABLE `pagos_comparendo` (
  `codigo_transaccion` int(11) NOT NULL,
  `cc` int(11) NOT NULL,
  `radicado` int(11) NOT NULL,
  `estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pagos_comparendo`
--

INSERT INTO `pagos_comparendo` (`codigo_transaccion`, `cc`, `radicado`, `estado`) VALUES
(6880, 1, 4807, 'PAGO'),
(9943, 1, 5511, 'PAGO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos_impuesto`
--

CREATE TABLE `pagos_impuesto` (
  `cod_pago` int(11) NOT NULL,
  `cc` int(11) NOT NULL,
  `nit` int(11) NOT NULL,
  `estado` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pagos_impuesto`
--

INSERT INTO `pagos_impuesto` (`cod_pago`, `cc`, `nit`, `estado`) VALUES
(2902, 1, 41726, 'EN MORA'),
(4113, 2, 14626, 'PAGANDO'),
(4739, 2, 14626, 'EN MORA'),
(5744, 2, 72860, 'PAGANDO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `cc` int(11) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `genero` varchar(50) NOT NULL,
  `fNacimiento` date NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `email` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`cc`, `nombres`, `apellidos`, `genero`, `fNacimiento`, `telefono`, `email`) VALUES
(1, 'jhoan sebastian', 'sua garcia', 'Masculino', '2023-05-16', 3116756552, 'sebas@gmail.com'),
(2, 'danna', 'sepulveda', 'Helicoptero Apache', '2023-05-18', 3991122000, 'danna@yahoo.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `placa` varchar(7) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `modelo` int(11) NOT NULL,
  `color` varchar(10) NOT NULL,
  `cc` int(11) NOT NULL,
  `marca` varchar(20) NOT NULL,
  `cilindraje` int(11) NOT NULL,
  `ValorComercial` double NOT NULL,
  `combustible` varchar(15) NOT NULL,
  `anio_Registro` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`placa`, `tipo`, `modelo`, `color`, `cc`, `marca`, `cilindraje`, `ValorComercial`, `combustible`, `anio_Registro`) VALUES
('aaa-111', 'Publico', 1995, 'amarillo', 2, 'KIA', 1900, 2000000, 'Gas', 2022),
('abc-123', 'Particular', 2023, 'rojo', 1, 'chevrolet', 3000, 40000000, 'Electrico', 2023),
('bbb-222', 'Publico', 2005, 'amarillo', 2, 'KIA', 2000, 35000000, 'Gas', 2023);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comparendo`
--
ALTER TABLE `comparendo`
  ADD PRIMARY KEY (`radicado`),
  ADD KEY `cc` (`cc`);

--
-- Indices de la tabla `impuesto`
--
ALTER TABLE `impuesto`
  ADD PRIMARY KEY (`nit`),
  ADD KEY `placa` (`placa`);

--
-- Indices de la tabla `pagos_comparendo`
--
ALTER TABLE `pagos_comparendo`
  ADD PRIMARY KEY (`codigo_transaccion`),
  ADD KEY `radicado` (`radicado`),
  ADD KEY `cc` (`cc`);

--
-- Indices de la tabla `pagos_impuesto`
--
ALTER TABLE `pagos_impuesto`
  ADD PRIMARY KEY (`cod_pago`),
  ADD KEY `nit` (`nit`),
  ADD KEY `cc` (`cc`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`cc`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`placa`),
  ADD KEY `cc` (`cc`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comparendo`
--
ALTER TABLE `comparendo`
  ADD CONSTRAINT `comparendo_ibfk_1` FOREIGN KEY (`cc`) REFERENCES `persona` (`cc`);

--
-- Filtros para la tabla `impuesto`
--
ALTER TABLE `impuesto`
  ADD CONSTRAINT `impuesto_ibfk_1` FOREIGN KEY (`placa`) REFERENCES `vehiculo` (`placa`);

--
-- Filtros para la tabla `pagos_comparendo`
--
ALTER TABLE `pagos_comparendo`
  ADD CONSTRAINT `pagos_comparendo_ibfk_1` FOREIGN KEY (`radicado`) REFERENCES `comparendo` (`radicado`),
  ADD CONSTRAINT `pagos_comparendo_ibfk_2` FOREIGN KEY (`cc`) REFERENCES `persona` (`cc`);

--
-- Filtros para la tabla `pagos_impuesto`
--
ALTER TABLE `pagos_impuesto`
  ADD CONSTRAINT `pagos_impuesto_ibfk_1` FOREIGN KEY (`nit`) REFERENCES `impuesto` (`nit`),
  ADD CONSTRAINT `pagos_impuesto_ibfk_2` FOREIGN KEY (`cc`) REFERENCES `persona` (`cc`);

--
-- Filtros para la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`cc`) REFERENCES `persona` (`cc`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
