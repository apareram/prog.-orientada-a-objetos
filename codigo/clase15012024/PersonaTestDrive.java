package clase15012024;

public class PersonaTestDrive {
    public static void main (String[] args){
        Persona a = new Persona();
        a.setnombre("messi");
        a.setedad(35);
        a.setpeso(60.2);
        a.diTuNombre();
        a.diTuEdad();
        System.out.println("Nombre: " + a.getnombre()+ " Edad: " + a.getedad() + "Peso: " + a.getpeso());


        Persona b = new Persona();
        b.setnombre("cristiano");
        b.setedad(38);
        b.setpeso(80.2);
        b.diTuNombre();
        b.diTuEdad();
        System.out.println("Nombre: " + b.getnombre()+ " Edad: " + b.getedad() + "Peso: " + b.getpeso());

    }
}
