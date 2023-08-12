# Como configurar Profiles en Spring Boot para diferentes entornos utilizando Properties o Yml

Los proyectos presentados permiten las instrucciones necesarias para configurar varios perfiles en Spring Boot utilizando Properties o Yml, para múltiples entornos, como desarrollo, test o producción. 

## Explicación del proyecto

Puedes ver a detalle el proyecto directamente desde mi canal de YouTube [https://youtu.be/WSGs9fbmK1E](https://youtu.be/WSGs9fbmK1E)


## Script de la base de datos

```
create database db_springboot_prod;
CREATE TABLE `db_springboot_prod`.`clientes` (
  `id_cliente` INT ZEROFILL NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `fecha_registro` date  NOT NULL,
  PRIMARY KEY (`id_cliente`));
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Walter', 'Rosero', 'ecuadorwalter@std.com', '2023-08-01');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Juan', 'Espinoza', 'juanespi98@gmail.com', '2023-08-02');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Kevin', 'Cantos', 'cantos99@hotmail.com', '2023-08-03');


create database db_springboot_dev;
CREATE TABLE `db_springboot_dev`.`clientes` (
  `id_cliente` INT ZEROFILL NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `fecha_registro` date  NOT NULL,
  PRIMARY KEY (`id_cliente`));
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Joel', 'Jurado', 'juradoec@yahoo.com', '2023-08-01');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Carlos', 'Miranda', 'mirandaTr98@gmail.com', '2023-08-02');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Marcela', 'Sanchez', 'schMarce@itb.com', '2023-08-03');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Ben', 'Tennyson', 'ben10@cn.com', '2023-08-04');
```
## Compilación y ejecución 
Para la compilación del proyecto se lo realizara con los comandos de Maven, donde se le asigna la variable del comando -P indicando que es un perfil y se asigna el nombre del perfil en este caso |dev|prod|test
```
mvn clean install -P dev
java -jar nombre-del-jar-mas-extension
```

