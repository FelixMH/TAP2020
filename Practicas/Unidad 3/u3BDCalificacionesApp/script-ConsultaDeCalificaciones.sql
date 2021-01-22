
/* Consultar las calificaciones de los alumnos ordenada por matricula. */

SELECT a.MATRICULA, a.NOMBRE, a.APELLIDOS, m.MATERIA , k.CALIFICACION 
    FROM Alumnos a, Kardex k , Materias m WHERE a.MATRICULA = k.MATRICULA AND k.IDMATERIA = m.IDMATERIA 
    ORDER BY k.MATRICULA;

/* Consultar calificaciones de un alumno en particular. */
SELECT a.MATRICULA, a.NOMBRE, a.APELLIDOS, m.MATERIA , k.CALIFICACION 
    FROM Alumnos a, Kardex k , Materias m WHERE a.MATRICULA = k.MATRICULA AND k.IDMATERIA = m.IDMATERIA  AND k.MATRICULA = '17130800'
    ORDER BY k.MATRICULA;