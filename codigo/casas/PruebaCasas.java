package casas;

public class PruebaCasas {
    public static void main(String[] args){
        Ccasa casaUno = new Ccasa(30, 1, "negra");
        Ccasa casaDos = new Ccasa(1, 20, "rosa");
        
        casaUno.abrirVentanas();
        casaUno.abrirPuertas();
        casaUno.cerrarVentanas();
        casaUno.cerrarVentanas();
        casaUno.pintar();

        System.out.println("la casa tiene " + casaUno.getnPuertas() + " puertas " + casaUno.getnVentanas() + " y es de color " + casaUno.getcolor());

        casaDos.abrirVentanas();
        casaDos.abrirPuertas();
        casaDos.cerrarVentanas();
        casaDos.cerrarVentanas();
        casaDos.pintar();

        System.out.println("la casa tiene " + casaDos.getnPuertas() + " puertas " + casaDos.getnVentanas() + " y es de color " + casaDos.getcolor());

        Cchalet chaletUno = new Cchalet(2, 2, "azul", true);
        Cchalet chaletDos = new Cchalet(3, 13, "morada", false);
        
        chaletUno.abrirVentanas();
        chaletUno.abrirPuertas();
        chaletUno.cerrarVentanas();
        chaletUno.cerrarVentanas();
        chaletUno.pintar();

        System.out.println("el chalet tiene " + chaletUno.getnPuertas() + " puertas, " + chaletUno.getnVentanas() 
        + "es de color " + chaletUno.getcolor() + " y tiene jardín: " + chaletUno.getmJardirn());

        chaletDos.abrirVentanas();
        chaletDos.abrirPuertas();
        chaletDos.cerrarVentanas();
        chaletDos.cerrarVentanas();
        chaletDos.pintar();

        System.out.println("el chalet tiene " + chaletUno.getnPuertas() + " puertas, " + chaletUno.getnVentanas() 
        + "es de color " + chaletUno.getcolor() + " y tiene jardín: " + chaletUno.getmJardirn());

        Cdepartamento depaUno = new Cdepartamento(4, 10, "blanco", 3, 21);
        Cdepartamento depaDos = new Cdepartamento(5, 2, "dorado", 1, 1);
        
        depaUno.abrirVentanas();
        depaUno.abrirPuertas();
        depaUno.cerrarVentanas();
        depaUno.cerrarVentanas();
        depaUno.pintar();
        depaUno.subirPisos();
        depaUno.bajarPisos();

        System.out.println("el departamento tiene " + depaUno.getnPuertas() + " puertas, " + depaUno.getnVentanas() 
        + "es de color " + depaUno.getcolor() + " esta en el piso " + depaUno.getnumPiso() + " y esta en el psio " + depaUno.getnumDepto());

        depaDos.abrirVentanas();
        depaDos.abrirPuertas();
        depaDos.cerrarVentanas();
        depaDos.cerrarVentanas();
        depaDos.pintar();

        System.out.println("el departamento tiene " + depaDos.getnPuertas() + " puertas, " + depaDos.getnVentanas() 
        + "es de color " + depaDos.getcolor() + " esta en el piso " + depaDos.getnumPiso() + " y esta en el psio " + depaDos.getnumDepto());
    }
}
