public class UsuarioEmpleado extends Usuario {
    private Empleado emp;

    public UsuarioEmpleado(String username, Empleado emp) {
        super(username);
        this.emp = emp;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }
}
