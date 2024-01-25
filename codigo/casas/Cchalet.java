package casas;

public class Cchalet extends Ccasa{
    boolean mJardirn;

    public Cchalet(int nPuertas, int nVentanas, String color, boolean mJardirn){
        super(nPuertas, nVentanas, color);
        this.mJardirn = mJardirn;
    }

    public boolean getmJardirn(){
        return mJardirn;
    }
}
