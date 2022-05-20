import java.util.ArrayList;

public class BaseAdministrativa extends Base {
    private ArrayList<BaseReal> bases;

    public BaseAdministrativa(String nombre) {
        super(nombre);
        this.bases = new ArrayList<>();
    }

    public ArrayList<BaseReal> getBases() {
        return bases;
    }

    public int numeroDeAmbulancias() {
        int total = 0;
        for (BaseReal base : bases) {
            total += base.getCantAmbulancias();
        }
        return total;
    }

    public int tiempoMedioAsistencia() {
        int total = 0;
        int cant = bases.size();
        for (BaseReal base : bases) {
            total += base.getTiempoAsistencia();
        }
        return total / cant;
    }
}
