public class FicheroNormal extends Fichero {
    private int tamano;

    public FicheroNormal(String nombre, int tamano) {
        super(nombre);
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
}
