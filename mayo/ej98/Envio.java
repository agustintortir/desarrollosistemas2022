public class Envio {
    private ManeraCalculo estrategia;

    public Envio(ManeraCalculo estrategia) {
        this.estrategia = estrategia;
    }

    public ManeraCalculo getEstrategia() {
        return estrategia;
    }
    public void setEstrategia(ManeraCalculo estrategia) {
        this.estrategia = estrategia;
    }
}
