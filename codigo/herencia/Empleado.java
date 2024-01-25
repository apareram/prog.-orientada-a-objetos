package herencia;

public class Empleado {
    String nombre;
    int edad;
    int numeroProfesor;
    int numeroSuerte;
    double sueldo;

    //constructor, permite asignar los valores a los atributos
    public Empleado(String nombre, int edad, int numeroProfesor, int numeroSuerte, double sueldo){
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.numeroProfesor = numeroProfesor;
        this.numeroSuerte = numeroSuerte;
        this.sueldo = sueldo;
    }

    public String getnombre(){
        return nombre;
    }

    public int getedad(){
        return edad;
    }

    public int getnumeroProfesor() {
        return numeroProfesor;
    }

    public int getnumeroSuerte() {
        return numeroSuerte;
    }

    public double getsueldo() {
        return sueldo;
    }

    //ambito publico, no regresa nada
    public void guardarEmpleado(){
        System.out.println("Gruardando empleado.");
    }

    public void pagarSueldo(){
        System.out.println("Sueldo pagado.");
    }

    public void tieneSuerte(){
        System.out.println("Probando suerte.");
    }
}
