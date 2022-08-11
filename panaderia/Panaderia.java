import java.util.ArrayList;

public class Panaderia {
    private ArrayList<Empresa> empresas;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;
    private ArrayList<Pedido> pedidos;
    private Panaderia instance;

    private Panaderia(ArrayList<Empresa> empresas, ArrayList<Usuario> usuarios, ArrayList<Producto> productos, ArrayList<Pedido> pedidos) {
        this.empresas = empresas;
        this.usuarios = usuarios;
        this.productos = productos;
        this.pedidos = pedidos;
    }

    public Panaderia getInstance(ArrayList<Empresa> empresas, ArrayList<Usuario> usuarios, ArrayList<Producto> productos, ArrayList<Pedido> pedidos) {
        if (this.instance != null) return instance;
        this.instance = new Panaderia(empresas, usuarios, productos, pedidos);
        return instance;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
