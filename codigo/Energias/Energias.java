package Energias;

public class Energias {
    private double masa;
    private double ePote;
    private double eCinc;

    public Energias(double masa) {
        this.masa = masa;
    }

    public double eCin(double vel) {
        eCinc = 0.5 * masa * Math.pow(vel, 2);
        return eCinc;
    }

    public double ePot(double alt) {
        ePote = masa * alt * 9.81;
        return ePote;
    }

    public double eToto() {
        return ePote + eCinc;
    }

    public double getECinc() {
        return eCinc;
    }

    public double getEPote() {
        return ePote;
    }
}