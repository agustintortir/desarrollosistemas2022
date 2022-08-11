import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String email;
    private String telefono;
    private ArrayList<Produccion> prod;

    public Empleado(String nombre, String email, String telefono, ArrayList<Produccion> prod) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.prod = prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Produccion> getProd() {
        return prod;
    }

    public void setProd(ArrayList<Produccion> prod) {
        this.prod = prod;
    }
}
