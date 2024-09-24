-- CREAR USUARIO
CREATE USER 'Jorge.G.Andujar' @'localhost' identified WITH mysql_native_password BY '12345678';
-- DAR PRIVILEGIOS EN TODA LA BASE DE DATOS
GRANT ALL PRIVILEGES ON `BDTRANSACCION`.* TO 'Jorge.G.Andujar' @'localhost';
-- DAR TODOS LOS PRIVILEGIOS
GRANT ALL PRIVILEGES ON *.* TO 'Jorge.G.Andujar' @'localhost';
FLUSH PRIVILEGES;
