import java.time.LocalDate;

public class Produccion {
    private LocalDate dia;
    private int cantidad;
    private Producto prod;
    private UnidadDeMedida unidad;

    public Produccion(LocalDate dia, int cantidad, Producto prod, UnidadDeMedida unidad) {
        this.dia = dia;
        this.cantidad = cantidad;
        this.prod = prod;
        this.unidad = unidad;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProd() {
        return prod;
    }

    public void setProd(Producto prod) {
        this.prod = prod;
    }

    public UnidadDeMedida getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDeMedida unidad) {
        this.unidad = unidad;
    }
}
