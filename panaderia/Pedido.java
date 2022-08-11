import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private Empresa empresa;
    private String comentario;
    private String direccion;
    private LocalDate fecha;
    private Estado estado;
    private ArrayList<PedidoProducto> prods;

    public Pedido(Empresa empresa, String comentario, String direccion, LocalDate fecha, Estado estado, ArrayList<PedidoProducto> prods) {
        this.empresa = empresa;
        this.comentario = comentario;
        this.direccion = direccion;
        this.fecha = fecha;
        this.estado = estado;
        this.prods = prods;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<PedidoProducto> getProds() {
        return prods;
    }

    public void setProds(ArrayList<PedidoProducto> prods) {
        this.prods = prods;
    }
}
