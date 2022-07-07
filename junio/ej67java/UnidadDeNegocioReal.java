public class UnidadDeNegocioReal extends UnidadDeNegocio {
    private int numeroDeEmpleados;
    private float beneficiosBrutos;
    private float inversionEnEdificios;
    private int contratosPorSemana;

    public UnidadDeNegocioReal(String gerente, int numeroDeEmpleados, float beneficiosBrutos, float inversionEnEdificios, int contratosPorSemana) {
        super(gerente);
        this.numeroDeEmpleados = numeroDeEmpleados;
        this.beneficiosBrutos = beneficiosBrutos;
        this.inversionEnEdificios = inversionEnEdificios;
        this.contratosPorSemana = contratosPorSemana;
    }

    public int getNumeroDeEmpleados() {
        return numeroDeEmpleados;
    }
    public float getBeneficiosBrutos() {
        return beneficiosBrutos;
    }
    public float getInversionEnEdificios() {
        return inversionEnEdificios;
    }
    public int getContratosPorSemana() {
        return contratosPorSemana;
    }

    public void setNumeroDeEmpleados(int numeroDeEmpleados) {
        this.numeroDeEmpleados = numeroDeEmpleados;
    }
    public void setBeneficiosBrutos(float beneficiosBrutos) {
        this.beneficiosBrutos = beneficiosBrutos;
    }
    public void setInversionEnEdificios(float inversionEnEdificios) {
        this.inversionEnEdificios = inversionEnEdificios;
    }
    public void setContratosPorSemana(int contratosPorSemana) {
        this.contratosPorSemana = contratosPorSemana;
    }
}
