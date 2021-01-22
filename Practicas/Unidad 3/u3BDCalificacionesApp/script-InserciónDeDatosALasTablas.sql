/* elimina todos los registros de las tablas. */
DELETE FROM Kardex;
DELETE FROM Alumnos;
DELETE FROM Materias;

/* Poblar la tabla con registros de prueba. */

INSERT INTO Alumnos VALUES ( '17130852', 'Olivia', 'Olivares Oliveira', 19, 79.0 );
INSERT INTO Alumnos VALUES ( '17130433', 'Hernán', 'Hernandez', 21, 82.54 );
INSERT INTO Alumnos VALUES ( '17130800', 'Félix', 'Martínez H.', 22, 90.0 );

INSERT INTO Materias VALUES ( 'ED1', 'Estructura de datos', 8 );
INSERT INTO Materias VALUES ( 'TAP1', 'Tópicos avanzados de programación', 6 );
INSERT INTO Materias VALUES ( 'TBD1', 'Taller de B. de datos', 10 );
INSERT INTO Materias VALUES ( 'IA1', 'Inteligencia Artificial', 8 );

INSERT INTO Kardex VALUES ( 1, '17130852', 'TBD1', '2020A', 91 );
INSERT INTO Kardex VALUES ( 2, '17130852', 'ED1', '2020A', 75 );
INSERT INTO Kardex VALUES ( 3, '17130852', 'TAP1', '2020A', 81 );
INSERT INTO Kardex VALUES ( 4, '17130852', 'IA1', '2020A', 78 );

INSERT INTO Kardex VALUES ( 5, '17130433', 'TBD1', '2020A', 78 );
INSERT INTO Kardex VALUES ( 6, '17130433', 'ED1', '2020A', 81 );
INSERT INTO Kardex VALUES ( 7, '17130433', 'TAP1', '2020A', 75 );
INSERT INTO Kardex VALUES ( 8, '17130433', 'IA1', '2020A', 91 );

INSERT INTO Kardex VALUES ( 9, '17130800', 'TBD1', '2020A', 88 );
INSERT INTO Kardex VALUES ( 10, '17130800', 'ED1', '2020A', 86 );
INSERT INTO Kardex VALUES ( 11, '17130800', 'TAP1', '2020A', 94 );
INSERT INTO Kardex VALUES ( 12, '17130800', 'IA1', '2020A', 73 );