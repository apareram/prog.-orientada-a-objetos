package OperacionesNumericas;

public class OperacionesNumericas {
    private double val1;
    private double val2;
    private double val3;

    public OperacionesNumericas(double val1, double val2, double val3){
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public OperacionesNumericas(){
    }

    public double suma(double val4, double val5, double val6){
        return val4 + val5 + val6;
    }

    public double suma(){
        return val1 + val2 + val3;
    }

    public double resta(double val4, double val5, double val6){
        return val4 - val5 - val6;
    }

    public double resta(){
        return val1 - val2 - val3;
    }

    public double mult(double val4, double val5, double val6){
        return val4 * val5 * val6;
    }

    public double mult(){
        return val1 * val2 * val3;
    }

    public double div(double val4, double val5){
        return val4 / val5;
    }

    public double div(){
        return val1 / val2;
    }

    public double pot(double val4, double val5){
        return Math.pow(val4, val5);
    }

    public double pot(){
        return Math.pow(val1, val2);
    }
}
