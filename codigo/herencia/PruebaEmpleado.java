package herencia;

public class PruebaEmpleado {
    public static void main(String[] args){
        Profesor profesorUno = new Profesor("messi", 60, 10, 7, 1000, "deportes", 2.1, 8.7, "si");
        Profesor profesorDos = new Profesor("cristiano", 63, 7, 10, 900, "deportes", 2.2, 8.8, "si");
        
        profesorUno.guardarEmpleado();
        profesorUno.asignarMateria();
        profesorUno.pagarSueldo();
        profesorUno.tieneSuerte();
        profesorUno.checarCansancio();

        System.out.println("el nombre del profesor es: " + profesorUno.getnombre() + " su edad es: " + profesorUno.getedad() 
        + " su número favorito es: " + profesorUno.getnumeroSuerte() + " su sueldo es: " + profesorUno.getsueldo()
        +  " su materia es: " + profesorUno.getmateria() + " horas de trabajo: " + profesorUno.getnumeroHoras()
        + " el promedio de su grupo es: " + profesorUno.getpromedioGrupo() + " está cansado? " + profesorUno.getcansancio());

        profesorDos.guardarEmpleado();
        profesorDos.asignarMateria();
        profesorDos.pagarSueldo();
        profesorDos.tieneSuerte();
        profesorDos.checarCansancio();

        System.out.println("el nombre del profesor es: " + profesorDos.getnombre() + " su edad es: " + profesorDos.getedad() 
        + " su número favorito es: " + profesorDos.getnumeroSuerte() + " su sueldo es: " + profesorDos.getsueldo()
        +  " su materia es: " + profesorDos.getmateria() + " horas de trabajo: " + profesorDos.getnumeroHoras()
        + " el promedio de su grupo es: " + profesorDos.getpromedioGrupo() + " está cansado? " + profesorDos.getcansancio());
    }
}
