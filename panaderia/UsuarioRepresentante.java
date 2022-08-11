public class UsuarioRepresentante extends Usuario {
    private Representante rep;

    public UsuarioRepresentante(String username, Representante rep) {
        super(username);
        this.rep = rep;
    }

    public Representante getRep() {
        return rep;
    }

    public void setRep(Representante rep) {
        this.rep = rep;
    }
}
