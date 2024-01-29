package FigurasGeometricas;

public class Cono extends Ffiguras{

    int identificador = 2;

    public Cono(String textura, String sabor, String color){
        super(textura, sabor, color);
    }

    /**
     * Calcula el area de un cono.
     * @param radio el radio de un cono en cm.
     * @param altura la altura de un cono en cm.
     * @param hipo la hipotenusa de un cono en cm.
     * @return regresa el resultado del area de un cono.
     */
    public double area(double radio, double altura, double hipo){
        double res = 0;
        double pi = 3.14159264;
        if(radio <= 0 || altura <= 0 || hipo <= 0)
        {
            return -1;
        }
        else{
            res = pi*radio*(radio+hipo);
            return res;
        }
    }

    /**
     * Calcula el volumen de un cono.
     * @param radio el radio de un cono en cm.
     * @param altura la altura de un cono en cm.
     * @param hipo la hipotenusa de un cono en cm.
     * @return regresa el resultado del volumen de un cono.
     */
    public double volumen(double radio, double altura, double hipo){
        double res = 0;
        double pi = 3.14159264;
        if(radio <= 0 || altura <= 0 || hipo <= 0)
        {
            return -1;
        }
        else{
            res = (pi*(radio*radio)*altura)/3;
            return res;
        }
    }

     /**
     * Calcula cuantos chicaros cabrian en el volumen de un cono.
     * @param radio el radio de un cono en cm.
     * @param altura la altura de un cono en cm.
     * @param hipo la hipotenusa de un cono en cm.
     * @return regresa el resultado del calculo de chicharos.
     */
    public double cuantosChicharos(double radio, double altura, double hipo){
        double res = 0;
        double volChicharo = 1.5;
        if(radio <= 0 || altura <= 0 || hipo <= 0)
        {
            return -1;
        }
        else{
            res = volumen(radio, altura, hipo)/volChicharo;
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
