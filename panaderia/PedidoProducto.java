public class PedidoProducto {
    private Pedido pedido;
    private Producto producto;
    private int cantidad;
    private UnidadDeMedida unidad;

    public PedidoProducto(Pedido pedido, Producto producto, int cantidad, UnidadDeMedida unidad) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public UnidadDeMedida getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDeMedida unidad) {
        this.unidad = unidad;
    }
}
