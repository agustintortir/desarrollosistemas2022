public abstract class UnidadDeNegocio {
    private String gerente;

    public UnidadDeNegocio(String gerente) {
        this.gerente = gerente;
    }

    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public abstract int getNumeroDeEmpleados();
    public abstract float getBeneficiosBrutos();
    public abstract float getInversionEnEdificios();
    public abstract int getContratosPorSemana();
}
