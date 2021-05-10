package colegio;

import java.util.Date;

public final class AlumnoCiclo extends Alumno {

   /**
    * Constructor por defecto de alumno 
    */

    public AlumnoCiclo() {
        super();
    }
    
    /**
    * Constructor de alumno 
    * @param nombre Nombre del alumno 
    * @param apellidos apellidos del alumno 
    */

    public AlumnoCiclo(String nombre, String apellidos) {
        super(nombre, apellidos);
    }


     /**
    * Constructor de alumno 
    * @param nombre Nombre del alumno 
    * @param apellidos apellidos del alumno 
    * @param nacimiento nacimiento del alumno 
    * @param notas notas del alumno 
    */

    public AlumnoCiclo(String nombre, String apellidos, Date nacimiento, int[] notas) {
        super(nombre, apellidos, nacimiento, notas);
    }

   /**
    * Matriculación de un alumno  
    * @param curso curso del alumno 
    * Si es uno de los cursos indicados en el if le asigna un curso al alumno
    */
      
    @Override
    public void matricular(Curso curso) {
        if ( curso == Curso.SMR1 || curso == Curso.SMR2 || curso == Curso.ASIR1 || curso == Curso.ASIR2)
            this.curso = curso;
    }

    /**
    * desmatricular de un alumno  
    *  Si el curso es distinto de null desmatricula al alumno
    */

    @Override
    public void desmatricular() {
        if (curso != null)
            this.curso = null;
    }

  
}
