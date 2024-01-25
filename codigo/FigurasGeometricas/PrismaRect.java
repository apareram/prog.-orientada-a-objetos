package FigurasGeometricas;

public class PrismaRect extends Ffiguras{
    
    int identificador = 1;

    public PrismaRect(String textura, String sabor, String color){
        super(textura, sabor, color);
    }

    /**
     * Calcula el area de un prisma rectangular.
     * @param ancho el ancho de un prisma rectangular en cm.
     * @param largo el largo de un prisma rectangular en cm.
     * @param altura la altura de un prisma rectangular en cm.
     * @return regresa el resultado del area de un prisma rectangular.
     */
    public double area(double ancho, double largo, double altura){
        double res = 0;
        res = 2*(ancho*largo + ancho*altura + altura*largo);
        return res;
    }
    
    /**
     * Calcula el volumen de un prisma rectangular.
     * @param ancho el ancho de un prisma rectangular en cm.
     * @param largo el largo de un prisma rectangular en cm.
     * @param altura la altura de un prisma rectangular en cm.
     * @return regresa el resultado del volumen de un prisma rectangular.
     */
    public double volumen(double ancho, double largo, double altura){
        double res = 0;
        res = ancho*largo*altura;
        return res;
    }

    /**
     * Calcula cuantos chicaros cabrian en el volumen de un prisma rectangular.
     * @param ancho el ancho de un prisma rectangular en cm.
     * @param largo el largo de un prisma rectangular en cm.
     * @param altura la altura de un prisma rectangular en cm.
     * @return regresa el resultado del calculo de chicharos.
     */
    public double cuantosChicharos(double ancho, double largo, double altura){
        double res = 0;
        double volChicharo = 1.5;
        res = volumen(ancho, largo, altura)/volChicharo;
        return res;
    }

    /**
     * regresa el identificador del toroide.
     * @return identificador regresa el identificador.
     */
    public int regresaIdentificador(){
        return identificador;
    }
}