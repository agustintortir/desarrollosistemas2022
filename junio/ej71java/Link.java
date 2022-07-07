public class Link extends Fichero {
    Fichero puntero;

    public Link(String nombre, Fichero puntero) {
        super(nombre);
        this.puntero = puntero;
    }

    public Fichero getPuntero() {
        return puntero;
    }
    public void setPuntero(Fichero puntero) {
        this.puntero = puntero;
    }

    public int getTamano() {
        if (puntero == null) return 0;
        return puntero.getTamano();
    }
}
