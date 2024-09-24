-- ENCRIPTAR
-- ESTRUCTURA BASE DE DATOS
DROP DATABASE IF EXISTS BDENCRIPTAR;
CREATE DATABASE BDENCRIPTAR;
USE BDENCRIPTAR;
-- HACER UNA FUNCION EN LA QUE CONSIGUES LA PALABRA SECRETA A TRAVES DE UNA FUNCION
DROP FUNCTION IF EXISTS obtener_palabra_secreta
DELIMITER $$
CREATE FUNCTION obtener_palabra_secreta() RETURNS VARCHAR(200)
DETERMINISTIC
BEGIN 
	DECLARE palabra_clave VARCHAR(200);
    SET palabra_clave = 'sefhl<dzfv$a';
    RETURN palabra_clave;
END$$
DELIMITER ;
DROP TABLE IF EXISTS Usuario;
CREATE TABLE Usuario (
	idUsuario INT            NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre    VARCHAR(20)    NOT NULL,
    login     VARBINARY(20)  NOT NULL,
    clave     VARBINARY(255) NOT NULL
    
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
-- DATOS-----------------------
INSERT INTO Usuario (nombre,login,clave) VALUES
('Luis','Luisito','12345678');
INSERT INTO Usuario (nombre,login,clave) VALUES
('Carlos','carlinio',AES_ENCRYPT('ABCDEF',CONCAT(obtener_palabra_secreta(),'%')));

-- MOSTRAR
SELECT * FROM Usuario;
SELECT clave FROM Usuario WHERE idUsuario = 1;
SELECT clave FROM Usuario WHERE idUsuario = 2;

-- MOSTRAR LA CLAVE DESENCRIPTADA
SELECT nombre , login, CAST(clave AS CHAR) FROM Usuario WHERE idUsuario = 1;
SELECT nombre, login, CAST(AES_DECRYPT(clave,CONCAT(obtener_palabra_secreta(),'%')) AS CHAR) FROM Usuario
WHERE idUsuario = 2;

-- NOMBRA A LA FUNCTION
SELECT obtener_palabra_secreta();
