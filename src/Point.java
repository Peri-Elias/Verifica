public class Point {
    //attributi
    private int ascisse;
    private int ordinate;
    final private int lowerBound = 0;
    final private int upperBound = 1000;
    //costruttori
    public Point(int ascisse, int ordinate){
        this.ascisse = ascisse;
        this.ordinate = ordinate;
    }
    //costruttore di default
    public Point(){}
    //metodi accessori
    public int getAscisse() {
        return ascisse;
    }
    public int getOrdinate() {
        return ordinate;
    }

    public void setAscisse(int ascisse) {
        this.ascisse = ascisse;
    }

    public void setOrdinate(int ordinate) {
        this.ordinate = ordinate;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    //metodi
    public boolean traslaAscisse(int valore){
        int nuovaAscissa = ascisse += valore;
        if(nuovaAscissa >= lowerBound && nuovaAscissa <= upperBound){
            this.ascisse = nuovaAscissa;
            return true;
        }
        return false;
    }

    public boolean traslaOrdinate(int valore){
        int nuovaOrdinata = ordinate += valore;
        if(nuovaOrdinata >= lowerBound && nuovaOrdinata <= upperBound){
            this.ordinate = nuovaOrdinata;
            return true;
        }
        return true;
    }
}
