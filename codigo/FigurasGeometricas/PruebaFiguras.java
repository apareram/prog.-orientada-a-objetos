package FigurasGeometricas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PruebaFiguras {
    public static void main(String[] args) throws NumberFormatException,IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrismaRect rect = new PrismaRect("suave", "dulce", "negro");
        if (rect.tipo(rect) == 1) {
            System.out.println("la figura es un prisma rectangular.");
        }
        double ancho;
        System.out.println("Escriba el ancho del prisma");
        ancho = Double.valueOf(br.readLine()).doubleValue();
        double largo;
        System.out.println("Escriba el largo del prisma");
        largo = Double.valueOf(br.readLine()).doubleValue();
        double alto;
        System.out.println("Escriba el alto del prisma");
        alto = Double.valueOf(br.readLine()).doubleValue();
        System.out.println("la figura es de textura " + rect.gettextura() + ", de sabor " + rect.getsabor() + " y de color " + rect.getcolor());
        System.out.println("el rectanguto tiene " + rect.area(ancho,largo,alto) + " cm^2 de area, tiene " + rect.volumen(ancho,largo,alto) + " cm^3 de volumen y le caben  " + rect.cuantosChicharos(ancho,largo,alto) + " chicharos");

        Cono cono = new Cono("rugoso", "amargo", "cafe");
        if (cono.tipo(cono) == 2) {
            System.out.println("la figura es un cono.");
        }
        double radio;
        System.out.println("Escriba el radio del cono");
        radio = Double.valueOf(br.readLine()).doubleValue();
        double altura;
        System.out.println("Escriba la altura del cono");
        altura = Double.valueOf(br.readLine()).doubleValue();
        double hipo;
        System.out.println("Escriba la hipotenusa del cono");
        hipo = Double.valueOf(br.readLine()).doubleValue();
        System.out.println("el cono es de textura " + cono.gettextura() + ", de sabor " + cono.getsabor() + " y de color " + cono.getcolor());
        System.out.println("el cono tiene " + cono.area(radio, altura, hipo) + " cm^2 de area, tiene " + cono.volumen(radio, altura, hipo) + " cm^3 de volumen y le caben  " + cono.cuantosChicharos(radio, altura, hipo) + " chicharos");

        Toroide toro = new Toroide("aspera", "agridulce", "rosa");
        if (toro.tipo(toro) == 3) {
            System.out.println("la figura es un toroide.");
        }
        double radioMay;
        System.out.println("Escriba el radio mayor del toroide");
        radioMay = Double.valueOf(br.readLine()).doubleValue();
        double radioMen;
        System.out.println("Escriba el radio menor del toroide");
        radioMen = Double.valueOf(br.readLine()).doubleValue();
        System.out.println("el toeroide es de textura " + toro.gettextura() + ", de sabor " + toro.getsabor() + " y de color " + toro.getcolor());
        System.out.println("el toroide tiene " + toro.area(radioMay,radioMen) + " cm^2 de area, tiene " + toro.volumen(radioMay,radioMen) + " cm^3 de volumen y le caben  " + toro.cuantosChicharos(radioMay,radioMen) + " chicharos");
    }
}