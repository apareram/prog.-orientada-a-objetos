package casas;

public class Cdepartamento extends Ccasa{
    int numPiso;
    int numDepto;

    //constructor, permite asignar los valores a los atributos
    public Cdepartamento(int nPuertas, int nVentanas, String color,  int numPiso, int numDepto){
        super(nPuertas, nVentanas, color);
        this.numPiso = numPiso;
        this.numDepto = numDepto;
    }

    public int getnumPiso(){
        return numPiso;
    }

    public int getnumDepto(){
        return numDepto;
    }

    public void subirPisos(){
        System.out.println("subí los pisos.");
    }

    public void bajarPisos(){
        System.out.println("bajé los pisos.");
    }
}
