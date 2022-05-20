public class Dispositivo {
    private String nombre;
    private int direccionIp;

    public Dispositivo(String nombre, int direccionIp) {
        this.nombre = nombre;
        this.direccionIp = direccionIp;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDireccionIp() {
        return direccionIp;
    }
    public void setDireccionIp(int direccionIp) {
        this.direccionIp = direccionIp;
    }
}
