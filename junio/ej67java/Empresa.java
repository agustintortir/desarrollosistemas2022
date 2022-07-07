import java.util.ArrayList;

public class Empresa {
    private String presidente;
    private String cuit;
    private String direccionPostal;
    private ArrayList<UnidadDeNegocio> unidadesDeNegocio;

    public Empresa(String presidente, String cuit, String direccionPostal, ArrayList<UnidadDeNegocio> unidadesDeNegocio) {
        this.presidente = presidente;
        this.cuit = cuit;
        this.direccionPostal = direccionPostal;
        this.unidadesDeNegocio = unidadesDeNegocio;
    }

    public String getPresidente() {
        return presidente;
    }
    public String getCuit() {
        return cuit;
    }
    public String getDireccionPostal() {
        return direccionPostal;
    }
    public ArrayList<UnidadDeNegocio> getUnidadesDeNegocio() {
        return unidadesDeNegocio;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }
    public void setUnidadesDeNegocio(ArrayList<UnidadDeNegocio> unidadesDeNegocio) {
        this.unidadesDeNegocio = unidadesDeNegocio;
    }
}
