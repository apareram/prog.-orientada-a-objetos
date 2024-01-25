package clase15012024;

public class Persona {
    String nombre;
    int edad;
    double peso;

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public String getnombre() {
        return nombre;
    }

    public void setedad(int edad){
        this.edad = edad;
    }

    public int getedad() {
        return edad;
    }

    public void setpeso(double peso){
        this.peso = peso;
    }

    public double getpeso(){
        return peso;
    }

    void diTuNombre(){
        System.out.println("diciendo mi nombre ");
    }

    void diTuEdad(){
        System.out.println("diciendo mi edad ");
    }
    
}
