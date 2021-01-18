public class Alumno {

    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if(nombre.length() < 3){
            System.out.println("El nombre tiene menos de 3 caracteres");
        }

        if(numeroMatricula.length() < 4){
            System.out.println("La matricula tiene menos de 4 caracteres");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }

    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String nombreUsuario = "";
        String matriculaUsuario = "";
        if (nombre.length() < 3){ 
            nombreUsuario = nombre;
        }
        else if (nombre.length() >= 3){
            nombreUsuario = nombre.substring(0, 3);
        }
        
        if(numeroMatricula.length() < 4){
            matriculaUsuario = numeroMatricula;
        }
        else if(numeroMatricula.length() >= 4){
            matriculaUsuario = numeroMatricula.substring(0, 4);
        }

        return nombreUsuario + matriculaUsuario;
    }
}
