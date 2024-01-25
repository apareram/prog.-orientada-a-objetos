package FigurasGeometricas;

public class Ffiguras {
    String textura;
    String sabor;
    String color;

    //constructor, permite asignar los valores a los atributos
    public Ffiguras(String textura, String sabor, String color){
        super();
        this.textura = textura;
        this.sabor = sabor;
        this.color = color;
    }
    /**
     * metodo para obtener los valores
     * @return textura con el valor de textura
     */
    public String gettextura(){
        return textura;
    }

    /**
     * metodo para obtener los valores
     * @return sabor con el valor de sabor
     */
    public String getsabor(){
        return sabor;
    }

    /**
     * metodo para obtener los valores
     * @return color con el valor de color
     */
    public String getcolor() {
        return color;
    }

    public void area(){
        System.out.println("area.");
    }

    public void volumen(){
        System.out.println("vol.");
    }

    public void cuantosChicharos(){
        System.out.println("chicharos.");
    }

    public int regresaIdentificador(){
        return 0;
    }

    public int tipo(Ffiguras a){

        return a.regresaIdentificador();
    }
}