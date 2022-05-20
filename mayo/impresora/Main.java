public class Main {
    public static void main(String[] args) {
        Impresora imp1 = Impresora.getInstance();
        Impresora imp2 = Impresora.getInstance();
        System.out.println(imp1 == imp2);
    }
}