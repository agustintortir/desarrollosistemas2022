import java.util.ArrayList;

public class UnidadDeNegocioConjunta extends UnidadDeNegocio {
    private ArrayList<UnidadDeNegocio> unidadesHijas;

    public UnidadDeNegocioConjunta(String gerente, ArrayList<UnidadDeNegocio> unidadesHijas) {
        super(gerente);
        this.unidadesHijas = unidadesHijas;
    }

    public ArrayList<UnidadDeNegocio> getUnidadesHijas() {
        return unidadesHijas;
    }
    public void setUnidadesHijas(ArrayList<UnidadDeNegocio> unidadesHijas) {
        this.unidadesHijas = unidadesHijas;
    }

    public int getNumeroDeEmpleados() {
        int cantTotal = 0;
        for (UnidadDeNegocio unidad : unidadesHijas) {
            int cantEmpleados = unidad.getNumeroDeEmpleados();
            cantTotal += cantEmpleados;
        }
        return cantTotal;
    }
    public float getBeneficiosBrutos() {
        float beneficioTotal = 0;
        for (UnidadDeNegocio unidad : unidadesHijas) {
            float beneficio = unidad.getBeneficiosBrutos();
            beneficioTotal += beneficio;
        }
        return beneficioTotal;
    }
    public float getInversionEnEdificios() {
        float inversionTotal = 0;
        for (UnidadDeNegocio unidad : unidadesHijas) {
            float inversion = unidad.getInversionEnEdificios();
            inversionTotal += inversion;
        }
        return inversionTotal;
    }
    public int getContratosPorSemana() {
        int cantTotal = 0;
        for (UnidadDeNegocio unidad : unidadesHijas) {
            int cantContratos = unidad.getContratosPorSemana();
            cantTotal += cantContratos;
        }
        return cantTotal / unidadesHijas.size();
    }
}
