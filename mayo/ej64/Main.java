public class Main {
    public static void main(String[] args) {
        BaseReal base1 = new BaseReal("Base 1", 10, 100);
        BaseReal base2 = new BaseReal("Base 2", 15, 50);
        BaseAdministrativa baseAdm = new BaseAdministrativa("Base admin");
        baseAdm.getBases().add(base1);
        baseAdm.getBases().add(base2);
        System.out.println(baseAdm.numeroDeAmbulancias());
        System.out.println(baseAdm.tiempoMedioAsistencia());
    }
}
