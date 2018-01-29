
package boletin17n2;


public class Boletin17n2 {


    public static void main(String[] args) {
        Metodos met = new Metodos();
        Alumno[]alumnos= new Alumno[4];
     alumnos= met.crearArray();
        met.amosar(alumnos);
    met.numeroAS(alumnos);
    met.notaMedia(alumnos);
}
}