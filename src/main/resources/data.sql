

CREATE TABLE operador(
id INT PRIMARY KEY,
nombre VARCHAR(100),
apellido VARCHAR(100),
email VARCHAR(100));

CREATE TABLE incidencia(
id INT PRIMARY KEY,
descripcion VARCHAR(255),
fecha DATE,
estado VARCHAR(50),
operador_id INT,
FOREIGN KEY (operador_id) REFERENCES operador(id));





insert into operador(id, nombre, apellido, email) VALUES(1, 'JUAN', 'PEREZ', 'juan@gmail.com');
insert into operador(id, nombre, apellido, email) VALUES(2, 'maria', 'PEREZ', 'maria@gmail.com');
