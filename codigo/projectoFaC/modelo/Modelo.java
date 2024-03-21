package projectoFaC.modelo;

// en el modelo se generan acciones sobre los atributos a traves de metodos.
// el modelo no sabe nada acerca del controlador ni la vista.

public class Modelo {
    private float temp;

    public Modelo(){
        //temp = 0;
    }

    public Modelo(float temp){
        this.temp =temp;
    }
    
    public void setTemp(float temp) {
        this.temp = temp;
    }
    
    public float ConvT(){
        temp = (float) ((temp * 1.8) + 32);
        System.out.println(temp); // para ver si se raliza el calculo
        return temp;
    }
}