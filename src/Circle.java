public class Circle {
    private Point centro;
    private double raggio;
     //costruttore
    public Circle(int ascisse, int ordinate, double raggio){
        centro = new Point( ascisse, ordinate);
        this.raggio = raggio;

    }
    public Circle(){
        this.centro = new Point();
        this. raggio = 1.0;
    }
    // metodi accessori

    public double getRaggio() {
        return raggio;
    }

    public Point getCentro(){
        return centro;
    }

    public void setCentro(Point centro) {
        this.centro = centro;
    }
    // metodi

    public boolean spostamento(int x, int y){
        boolean uno;
        boolean due;
        uno = centro.traslaAscisse(x);
        due = centro.traslaOrdinate(y);
        if( uno == true && due == true){
            return true;
        }
        return false;
    }
    public boolean appartenenza( Point punto){
       double distanza = Math.sqrt(Math.pow(punto.getAscisse() - centro.getAscisse(), 2) + Math.pow(punto.getOrdinate() - centro.getOrdinate(), 2));
       if ( distanza <= raggio){
           return true;
       }
       return false;
    }
}
