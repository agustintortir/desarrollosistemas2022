public class BaseReal extends Base {
    private int cantAmbulancias;
    private int tiempoAsistencia;

    public BaseReal(String nombre, int cantAmbulancias, int tiempoAsistencia) {
        super(nombre);
        this.cantAmbulancias = cantAmbulancias;
        this.tiempoAsistencia = tiempoAsistencia;
    }

    public int getCantAmbulancias() {
        return cantAmbulancias;
    }
    public void setCantAmbulancias(int cantAmbulancias) {
        this.cantAmbulancias = cantAmbulancias;
    }

    public int getTiempoAsistencia() {
        return tiempoAsistencia;
    }
    public void setTiempoAsistencia(int tiempoAsistencia) {
        this.tiempoAsistencia = tiempoAsistencia;
    }

    public int numeroDeAmbulancias() {
        return cantAmbulancias;
    }

    public int tiempoMedioAsistencia() {
        return tiempoAsistencia;
    }
}
