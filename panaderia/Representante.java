public class Representante {
    private String nombre;
    private String email;
    private Empresa empresa;

    public Representante(String nombre, String email, Empresa empresa) {
        this.nombre = nombre;
        this.email = email;
        this.empresa = empresa;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
