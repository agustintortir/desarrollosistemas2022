public class Main {
    public static void main(String[] args) {
        Empresa emp1 = new Empresa("Envios SRL");
        ManeraCalculo estrategia1 = new Transportista1();
        System.out.println(estrategia1.calcular(100, 10));
        ManeraCalculo estrategia2 = new Transportista2();
        System.out.println(estrategia2.calcular(100, 10));
        Envio envio1 = new Envio(estrategia1);
        Envio envio2 = new Envio(estrategia2);
        emp1.getEnvios().add(envio1);
        emp1.getEnvios().add(envio2);
    }
}