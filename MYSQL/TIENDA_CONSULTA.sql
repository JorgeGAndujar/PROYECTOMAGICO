-- (1) CUANTAS COMPRAS HA HECHO UN CLIENTE "JUAN PEREZ"
SELECT c.nombre, COUNT(*) AS Cantidad
FROM Cliente c
JOIN Compra co ON c.idCliente = co.idCliente
WHERE c.nombre = 'JUAN PEREZ';

-- (2)QUE CLIENTE HA HECHO MAS COMPRAS
SELECT c.nombre, COUNT(*) AS Cantidad
FROM Cliente c
JOIN  Compra co ON c.idCliente = co.idCliente
GROUP BY c.nombre 
ORDER BY Cantidad DESC -- de mayor a menor 
LIMIT 1;

-- (2)QUE CLIENTE HA HECHO MAS COMPRAS Y SI HAY MAS DE UNO MOSTRARLO
SELECT c.nombre, COUNT(*) AS Cantidad
FROM Cliente c
JOIN  Compra co ON c.idCliente = co.idCliente
GROUP BY c.nombre 
HAVING Cantidad = (SELECT COUNT(*) AS Cantidad
FROM Cliente c
JOIN  Compra co ON c.idCliente = co.idCliente
GROUP BY c.nombre 
ORDER BY Cantidad DESC 
LIMIT 1);

-- (3) CREAR UNA FUNCIÓN QUE CALCULE Y RETORNE EL MAXIMO NUMERO DE COMPRAS DE UN CLIENTE
DROP FUNCTION IF EXISTS obtener_maximo_numero_compras;
DELIMITER $$
CREATE FUNCTION obtener_maximo_numero_compras() RETURNS INT
DETERMINISTIC
BEGIN 
	DECLARE MAXIMO INT;
    SELECT COUNT(*) AS Cantidad INTO MAXIMO
	FROM Cliente c
	JOIN  Compra co ON c.idCliente = co.idCliente
	GROUP BY c.nombre 
	ORDER BY Cantidad DESC -- de mayor a menor 
	LIMIT 1;
    RETURN MAXIMO;
END$$
DELIMITER ;
-- LLAMAR A LA FUNCTION
SELECT obtener_maximo_numero_compras() AS Cantidad;

-- LLAMAR A LA FUNCTION DENTRO DE LA QUERY
SELECT c.nombre, COUNT(*) AS Cantidad
FROM Cliente c
JOIN  Compra co ON c.idCliente = co.idCliente
GROUP BY c.nombre
HAVING Cantidad = obtener_maximo_numero_compras();

-- HACER PROCEDURE QUE MUESTRE TODO LOS CLIENTES CON EL MAYOR NUMERO DE COMPRAS
DROP PROCEDURE IF EXISTS mostrar_todos_clientes_maximo_compras;
DELIMITER $$
CREATE PROCEDURE mostrar_todos_clientes_maximo_compras()
BEGIN
SELECT c.nombre, COUNT(*) AS Cantidad
FROM Cliente c
JOIN  Compra co ON c.idCliente = co.idCliente
GROUP BY c.nombre
HAVING Cantidad = obtener_maximo_numero_compras();
END$$
DELIMITER ;
-- LLAMAR AL PROCEDURE
CALL mostrar_todos_clientes_maximo_compras();

-- HACER UNA FUNCION QUE RETORNE EL NOMBRE DEL ARTÍCULO MÁS CARO
SELECT nombre
FROM Articulo 
ORDER BY precio DESC 
LIMIT 1;

-- CON EL HAVING

SELECT nombre
FROM Articulo
WHERE precio = (SELECT precio
FROM Articulo
ORDER BY precio DESC 
LIMIT 1);

-- DE OTRA MANERA

SELECT MAX(precio) FROM articulo;
-- -------------------
SELECT nombre
FROM Articulo 
WHERE precio = (SELECT MAX(precio) FROM articulo);

-- CREAR FUNCTION
DROP FUNCTION IF EXISTS obtener_nombre_articulo_mas_caro;
DELIMITER $$
CREATE FUNCTION obtener_nombre_articulo_mas_caro() RETURNS VARCHAR(40)
DETERMINISTIC
BEGIN
	DECLARE descripcion VARCHAR(40);
	SELECT nombre INTO descripcion FROM articulo WHERE precio = (SELECT MAX(precio) FROM articulo);
    RETURN descripcion;
END$$
DELIMITER ;
-- LLAMAR FUNCTION
SELECT obtener_nombre_articulo_mas_caro();

-- HACER UNA FUNCION QUE RETORNE EL TOTAL EN DINERO QUE HA GASTADO
-- EN TODA SU HISTORIAL DE COMPRAS DE UN CLIENTE DADO.

SELECT c.nombre, SUM(co.cantidad*a.precio) AS Total
FROM Cliente c
JOIN Compra co ON c.idCliente = co.idCliente
JOIN Articulo a ON a.idArticulo = co.idArticulo
WHERE c.idCliente = 5;

-- CREAR FUNCION
DROP FUNCTION IF EXISTS obtener_total_gastado_cliente;
DELIMITER $$
CREATE FUNCTION obtener_total_gastado_cliente(idCliente_i INT) RETURNS DOUBLE
DETERMINISTIC
BEGIN
	DECLARE Total DOUBLE;
	SELECT SUM(co.cantidad*a.precio) INTO Total
    FROM Cliente c
	JOIN Compra co ON c.idCliente = co.idCliente
	JOIN Articulo a ON a.idArticulo = co.idArticulo
	WHERE c.idCliente = idCliente_i;
    RETURN Total;
END$$
DELIMITER ;
-- LLAMAR FUNCTION
SELECT obtener_total_gastado_cliente(5);

-- HACER UN PROCEDURE QUE UTILICE ESTA FUNCCION PARA SABER QUE CLIENTE HA GASTADO MÁS
DROP PROCEDURE IF EXISTS mostrar_cliente_mayor_gasto_total;
DELIMITER $$
CREATE PROCEDURE mostrar_cliente_mayor_gasto_total()
BEGIN
	DECLARE maximo DOUBLE DEFAULT 0;
    DECLARE total DOUBLE DEFAULT 0;
    DECLARE idClienteMaximo INT DEFAULT 0;
    DECLARE i INT DEFAULT 1;
    DECLARE n INT DEFAULT 0;
    SELECT COUNT(*) INTO n FROM Cliente;
	WHILE i <= n DO 
		SELECT obtener_total_gastado_cliente(i) INTO total;
        IF total > maximo THEN
			SET maximo = total;
            SET idClienteMaximo = i; -- Actualizar el ID del cliente con mayor gasto
        END IF;
        SET i = i + 1;
	END WHILE ;
    SELECT nombre, maximo FROM cliente WHERE idCliente = idClienteMaximo;
END$$
DELIMITER ;

CALL mostrar_cliente_mayor_gasto_total();




