package Main;

import java.io.IOException;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class Main {

	public static void main(String[] args) throws IOException {			   
      
		Vista framel = new Vista();
		Modelo modelo = new Modelo();
		Controlador control = new Controlador(modelo, framel);
		framel.setVisible(true);
		framel.setResizable(false);
	}
}