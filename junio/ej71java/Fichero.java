public abstract class Fichero {
    private String nombre;

    public Fichero(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getTamano();
}
