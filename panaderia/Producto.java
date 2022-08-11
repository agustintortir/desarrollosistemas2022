import java.util.ArrayList;

public class Producto {
    private String nombre;
    private UnidadDeMedida unds;
    private ArrayList<String> fotos;

    public Producto(String nombre, UnidadDeMedida unds, ArrayList<String> fotos) {
        this.nombre = nombre;
        this.unds = unds;
        this.fotos = fotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public UnidadDeMedida getUnds() {
        return unds;
    }

    public void setUnds(UnidadDeMedida unds) {
        this.unds = unds;
    }

    public ArrayList<String> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<String> fotos) {
        this.fotos = fotos;
    }
}
