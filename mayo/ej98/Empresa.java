import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Envio> envios;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.envios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Envio> getEnvios() {
        return envios;
    }
}
