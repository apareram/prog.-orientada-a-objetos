package herencia;

public class Profesor extends Empleado {
    String materia;
    double numeroHoras;
    double promedioGrupo;
    String cansancio;

    public Profesor(String nombre, int edad, int numeroProfesor, int numeroSuerte, double sueldo, String materia, double numeroHoras, double promedioGrupo, String cansancio){
        super(nombre, edad, numeroProfesor, numeroSuerte, sueldo);
        this.materia = materia;
        this.numeroHoras = numeroHoras;
        this.promedioGrupo = promedioGrupo;
        this.cansancio = cansancio;
    }

    public String getmateria(){
        return materia;
    }

    public double getnumeroHoras(){
        return numeroHoras;
    }

    public double getpromedioGrupo(){
        return promedioGrupo;
    }

    public String getcansancio(){
        return cansancio;
    }

    public void asignarMateria(){
        System.out.println("Materia asignada.");
    }

    public void checarCansancio(){
        System.out.println("Cansancio checado.");
    }
}
