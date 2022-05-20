public abstract class Base {
    private String nombre;

    public Base(String nombre) {
        this.nombre = nombre;
    }

    public abstract int numeroDeAmbulancias();
    public abstract int tiempoMedioAsistencia();
}
