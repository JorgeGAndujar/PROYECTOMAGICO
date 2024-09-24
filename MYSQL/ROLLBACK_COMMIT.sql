-- ----------------
-- CREAR BASE DE DATOS
-- ----------------

-- Borrar la base de datos si existe
DROP DATABASE IF EXISTS BDTRANSACCIONES;

-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS BDTRANSACCIONES;

-- Usar la base de datos
USE BDTRANSACCIONES;

-- Crear la tabla Clientes
CREATE TABLE IF NOT EXISTS Cliente (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
) ENGINE = InnoDB;

-- ----------------------
-- REALIZAR TRANSACCION INSERT
-- ----------------------

-- ACTIVAR UN PUNTO DE RESTAURACIÓN
START TRANSACTION;

INSERT INTO Cliente (nombre, email) VALUES ('Arturo', 'arturo@gmail.com');
INSERT INTO Cliente (nombre, email) VALUES ('Dafne', 'dafne@gmail.com');

-- CONFIRMAR LA TRANSACCION
COMMIT;

-- DESCARTAR LA TRANSACCION (ejemplo, puedes usar esto según sea necesario)
-- ROLLBACK;

-- Seleccionar todos los registros de la tabla Cliente
SELECT * FROM Cliente;

-- ---------------------------------------------------------------
-- ------------------------ DAR PRIVILEGIOS ---------------------
-- ---------------------------------------------------------------

-- Verificar los privilegios del usuario actual
SHOW GRANTS FOR CURRENT_USER;

-- Si el usuario no tiene privilegios, otorgar permisos
GRANT ALL PRIVILEGES ON BDTRANSACCIONES.* TO CURRENT_USER;

-- Actualizar los privilegios
FLUSH PRIVILEGES;

-- Verificar nuevamente los privilegios
SHOW GRANTS FOR CURRENT_USER;



