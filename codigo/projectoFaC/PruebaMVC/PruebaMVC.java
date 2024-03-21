package projectoFaC.PruebaMVC;

import projectoFaC.vista.Vista;
import projectoFaC.modelo.Modelo;
import projectoFaC.controlador.Controlador;

public class PruebaMVC {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        vista.setVisible(true);
    }
}