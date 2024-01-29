package FigurasGeometricas;

public class Toroide extends Ffiguras{

    int identificador = 3;

    public Toroide(String textura, String sabor, String color){
        super(textura, sabor, color);
    }

    /**
     * Este método calcula el area de un toroide
     * @param radioMay el radio mayor de un toroide en cm.
     * @param radioMen el radio menor de un toroide en cm.
     * @return regresa el resultado del calculo del toroide.
     */
    public double area(double radioMay, double radioMen){
        double res = 0;
        double pi = 3.14159264;
        if(radioMay <= 0 || radioMen <= 0 )
        {
            return -1;
        }
        else{
            res = 4*pi*pi*radioMay*radioMen;
            return res;
        }
    }
    
    /**
     * Este método calcula el volumen de un toroide
     * @param radioMay el radio mayor de un toroide en cm.
     * @param radioMen el radio menor de un toroide en cm.
     * @return regresa el resultado del calculo del volumen toroide.
     */
    public double volumen(double radioMay, double radioMen){
        double res = 0;
        double pi = 3.14159264;
        if(radioMay <= 0 || radioMen <= 0 )
        {
            return -1;
        }
        else{
            res = 2*pi*pi*radioMay*radioMen*radioMen;
            return res;
        }
    }

    /**
     * Calcula cuantos chicaros cabrian en el volumen de un toroide.
     * @param radioMay el radio mayor de un toroide en cm.
     * @param radioMen el radio menor de un toroide en cm.
     * @return regresa el resultado del calculo de chicharos.
     */
    public double cuantosChicharos(double radioMay, double radioMen){
        double res = 0;
        double volChicharo = 1.5;
        if(radioMay <= 0 || radioMen <= 0 )
        {
            return -1;
        }
        else{
            res = volumen(radioMay, radioMen)/volChicharo;
            return res;
        }
    }

    /**
     * regresa el identificador del toroide.
     * @return identificador regresa el identificador.
     */
    public int regresaIdentificador(){
        return identificador;
    }
}
