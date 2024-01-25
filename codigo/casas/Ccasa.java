package casas;

public class Ccasa {
    int nPuertas;
    int nVentanas;
    String color;

    //constructor, permite asignar los valores a los atributos
    public Ccasa(int nPuertas, int nVentanas, String color){
        super();
        this.nPuertas = nPuertas;
        this.nVentanas = nVentanas;
        this.color = color;
    }

    public int getnPuertas(){
        return nPuertas;
    }

    public int getnVentanas(){
        return nVentanas;
    }

    public String getcolor() {
        return color;
    }

    //ambito publico, no regresa nada
    public void abrirVentanas(){
        System.out.println("ventanas abiertas.");
    }

    public void cerrarVentanas(){
        System.out.println("ventanas cerradas.");
    }

    public void pintar(){
        System.out.println("casa pintada.");
    }

    public void abrirPuertas(){
        System.out.println("puertas puertas.");
    }

    public void cerrarPuertas(){
        System.out.println("puertas cerradas.");
    }
}
