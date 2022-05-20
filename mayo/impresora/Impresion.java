public class Impresion {
    private EstadoImpresion estado;

    public Impresion() {
        this.estado = EstadoImpresion.PENDIENTE;
    }

    public void imprimir(){
        this.estado = EstadoImpresion.IMPRESO;
    }
}
